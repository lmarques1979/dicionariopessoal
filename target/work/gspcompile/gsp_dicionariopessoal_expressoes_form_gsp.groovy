import dicionariopessoal.Expressoes
import seguranca.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_expressoes_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/expressoes/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (expressoesInstance)) {
printHtmlPart(2)
invokeTag('set','g',5,['var':("usuarioInstance"),'value':(expressoesInstance.usuario)],-1)
printHtmlPart(0)
}
else {
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('set','g',9,['var':("usuarioInstance"),'value':(Usuario.get(sec.loggedInUserInfo(field: 'id')))],-1)
printHtmlPart(2)
})
invokeTag('ifLoggedIn','sec',10,[:],2)
printHtmlPart(0)
}
printHtmlPart(1)
invokeTag('set','g',13,['var':("tipoexpressao"),'value':(params.int('tipoexpressao'))],-1)
printHtmlPart(0)
invokeTag('set','g',14,['var':("dicionariousuario"),'value':(params.int('dicionariousuario'))],-1)
printHtmlPart(4)
invokeTag('message','g',16,['code':("dadosexpressao.label")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'dicionariousuario', 'error'))
printHtmlPart(6)
invokeTag('message','g',19,['code':("dicionario.dicionariousuario.label"),'default':("Origem")],-1)
printHtmlPart(7)
invokeTag('select','g',22,['id':("dicionariousuario"),'name':("dicionariousuario.id"),'from':(dicionariopessoal.DicionarioUsuario.dicionariosUsuario(usuarioInstance)),'optionValue':({it.dicionario.nome + ' - ' + it.dicionario.origem.nome + ' > ' + it.dicionario.destino.nome}),'optionKey':("id"),'required':(""),'value':(dicionariousuario),'class':("many-to-one")],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'tipoexpressao', 'error'))
printHtmlPart(9)
invokeTag('message','g',27,['code':("dicionario.tipoexpressao.label"),'default':("Origem")],-1)
printHtmlPart(10)
invokeTag('select','g',29,['id':("tipoexpressao"),'name':("tipoexpressao.id"),'from':(dicionariopessoal.TipoExpressao.tipoExpressaoUsuario(usuarioInstance)),'optionValue':("descricao"),'optionKey':("id"),'required':(""),'value':(tipoexpressao),'class':("many-to-one")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'expressaoorigem', 'error'))
printHtmlPart(12)
invokeTag('message','g',33,['code':("expressoes.expressaoorigem.label"),'default':("Expressaoorigem")],-1)
printHtmlPart(7)
invokeTag('textArea','g',36,['name':("expressaoorigem"),'value':(expressoesInstance?.expressaoorigem),'rows':("5")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'expressaodestino', 'error'))
printHtmlPart(14)
invokeTag('message','g',43,['code':("expressoes.expressaodestino.label"),'default':("Expressaodestino")],-1)
printHtmlPart(7)
invokeTag('textArea','g',46,['name':("expressaodestino"),'value':(expressoesInstance?.expressaodestino),'rows':("5")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1424889259000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
