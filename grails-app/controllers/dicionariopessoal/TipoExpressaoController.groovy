package dicionariopessoal

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Transactional(readOnly = true)
@Secured('isAuthenticated()')
class TipoExpressaoController extends BaseController{

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
		
        respond TipoExpressao.list(params), model:[tipoExpressaoInstanceCount: TipoExpressao.count()]
    }

    def show(TipoExpressao tipoExpressaoInstance) {
        respond tipoExpressaoInstance
    }

    def create() {
        respond new TipoExpressao(params)
    }

    @Transactional
    def save(TipoExpressao tipoExpressaoInstance) {
        if (tipoExpressaoInstance == null) {
            notFound()
            return
        }
       
		tipoExpressaoInstance.usuario=usuarioLogado
		
        tipoExpressaoInstance.save flush:true
		
		if (tipoExpressaoInstance.hasErrors()) {
			respond tipoExpressaoInstance.errors, view:'create'
			return
		}
		
		request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'tipoExpressao.label', default: 'TipoExpressao'), tipoExpressaoInstance.id])
                redirect action:"create"
            }
            '*' { respond tipoExpressaoInstance, [status: CREATED] }
        }
    }

    def edit(TipoExpressao tipoExpressaoInstance) {
        respond tipoExpressaoInstance
    }

    @Transactional
    def update(TipoExpressao tipoExpressaoInstance) {
        if (tipoExpressaoInstance == null) {
            notFound()
            return
        }

        if (tipoExpressaoInstance.hasErrors()) {
            respond tipoExpressaoInstance.errors, view:'edit'
            return
        }

        tipoExpressaoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'TipoExpressao.label', default: 'TipoExpressao'), tipoExpressaoInstance.id])
                redirect tipoExpressaoInstance
            }
            '*'{ respond tipoExpressaoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(TipoExpressao tipoExpressaoInstance) {

        if (tipoExpressaoInstance == null) {
            notFound()
            return
        }

        tipoExpressaoInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'TipoExpressao.label', default: 'TipoExpressao'), tipoExpressaoInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'tipoExpressao.label', default: 'TipoExpressao'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
