package dicionariopessoal

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Transactional(readOnly = true)
@Secured('isAuthenticated()')
class DicionarioController extends BaseController{

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
      
		def resultado = DicionarioUsuario.findAllByUsuario(usuarioLogado).collect{it.dicionario}
		
		respond resultado, model:[dicionarioInstanceCount: resultado.size]
    }

    def show(Dicionario dicionarioInstance) {
        respond dicionarioInstance
    }

    def create() {
        respond new Dicionario(params)
    }

    @Transactional
    def save(Dicionario dicionarioInstance) {
        if (dicionarioInstance == null) {
            notFound()
            return
        }

        dicionarioInstance.save flush:true

		if (dicionarioInstance.hasErrors()) {
			respond dicionarioInstance.errors, view:'create'
			return
		}else{
		
			def dicionarioUsuarioInstance = new DicionarioUsuario()
			dicionarioUsuarioInstance.usuario=usuarioLogado
			dicionarioUsuarioInstance.dicionario=dicionarioInstance
			dicionarioUsuarioInstance.save flush:true
			if (dicionarioUsuarioInstance.hasErrors()) {
				respond dicionarioUsuarioInstance.errors, view:'create'
				return
			}
		}

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'dicionario.label', default: 'Dicionario'), dicionarioInstance.id])
                redirect dicionarioInstance
            }
            '*' { respond dicionarioInstance, [status: CREATED] }
        }
    }

    def edit(Dicionario dicionarioInstance) {
        respond dicionarioInstance
    }

    @Transactional
    def update(Dicionario dicionarioInstance) {
        if (dicionarioInstance == null) {
            notFound()
            return
        }

        if (dicionarioInstance.hasErrors()) {
            respond dicionarioInstance.errors, view:'edit'
            return
        }

        dicionarioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Dicionario.label', default: 'Dicionario'), dicionarioInstance.id])
                redirect dicionarioInstance
            }
            '*'{ respond dicionarioInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Dicionario dicionarioInstance) {

        if (dicionarioInstance == null) {
            notFound()
            return
        }

        dicionarioInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Dicionario.label', default: 'Dicionario'), dicionarioInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'dicionario.label', default: 'Dicionario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
