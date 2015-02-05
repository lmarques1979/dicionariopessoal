package dicionariopessoal

import static org.springframework.http.HttpStatus.*
import dicionariopessoal.BaseController;
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Transactional(readOnly = true)
@Secured('isAuthenticated()')
class ExpressoesController extends BaseController{

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
		
		if(params.filtrodicionario!="-1" && params.filtrodicionario!=null){
			
			def resultado = Expressoes.createCriteria().list () {
				eq("dicionariousuario.id" , Long.valueOf(params.filtrodicionario).longValue())
				order('dateCreated', 'desc')
			}
			respond resultado, model:[expressoesInstanceCount: resultado.size]
		}
	}	
	
    def show(Expressoes expressoesInstance) {
        respond expressoesInstance
    }

    def create() {
        respond new Expressoes(params)
    }

    @Transactional
    def save(Expressoes expressoesInstance) {
        if (expressoesInstance == null) {
            notFound()
            return
        }

        if (expressoesInstance.hasErrors()) {
            respond expressoesInstance.errors, view:'create'
            return
        }

        expressoesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'expressoes.label', default: 'Expressoes'), expressoesInstance.id])
                redirect expressoesInstance
            }
            '*' { respond expressoesInstance, [status: CREATED] }
        }
    }

    def edit(Expressoes expressoesInstance) {
        respond expressoesInstance
    }

    @Transactional
    def update(Expressoes expressoesInstance) {
        if (expressoesInstance == null) {
            notFound()
            return
        }

        if (expressoesInstance.hasErrors()) {
            respond expressoesInstance.errors, view:'edit'
            return
        }

        expressoesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Expressoes.label', default: 'Expressoes'), expressoesInstance.id])
                redirect expressoesInstance
            }
            '*'{ respond expressoesInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Expressoes expressoesInstance) {

        if (expressoesInstance == null) {
            notFound()
            return
        }

        expressoesInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Expressoes.label', default: 'Expressoes'), expressoesInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'expressoes.label', default: 'Expressoes'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
