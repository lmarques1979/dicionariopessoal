package dicionariopessoal



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Transactional(readOnly = true)
@Secured('isAuthenticated()')
class DicionarioUsuarioController extends BaseController{

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        
		def resultado = DicionarioUsuario.createCriteria().list () {
			eq("usuario",usuarioLogado)
		}
		respond resultado, model:[dicionarioUsuarioInstanceCount: resultado.size]
    }

    def show(DicionarioUsuario dicionarioUsuarioInstance) {
        respond dicionarioUsuarioInstance
    }

    def create() {
        respond new DicionarioUsuario(params)
    }

    @Transactional
    def save(DicionarioUsuario dicionarioUsuarioInstance) {
        if (dicionarioUsuarioInstance == null) {
            notFound()
            return
        }

        if (dicionarioUsuarioInstance.hasErrors()) {
            respond dicionarioUsuarioInstance.errors, view:'create'
            return
        }

        dicionarioUsuarioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'dicionarioUsuario.label', default: 'DicionarioUsuario'), dicionarioUsuarioInstance.id])
                redirect dicionarioUsuarioInstance
            }
            '*' { respond dicionarioUsuarioInstance, [status: CREATED] }
        }
    }

    def edit(DicionarioUsuario dicionarioUsuarioInstance) {
        respond dicionarioUsuarioInstance
    }

    @Transactional
    def update(DicionarioUsuario dicionarioUsuarioInstance) {
        if (dicionarioUsuarioInstance == null) {
            notFound()
            return
        }

        if (dicionarioUsuarioInstance.hasErrors()) {
            respond dicionarioUsuarioInstance.errors, view:'edit'
            return
        }

        dicionarioUsuarioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DicionarioUsuario.label', default: 'DicionarioUsuario'), dicionarioUsuarioInstance.id])
                redirect dicionarioUsuarioInstance
            }
            '*'{ respond dicionarioUsuarioInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DicionarioUsuario dicionarioUsuarioInstance) {

        if (dicionarioUsuarioInstance == null) {
            notFound()
            return
        }

        dicionarioUsuarioInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DicionarioUsuario.label', default: 'DicionarioUsuario'), dicionarioUsuarioInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'dicionarioUsuario.label', default: 'DicionarioUsuario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
