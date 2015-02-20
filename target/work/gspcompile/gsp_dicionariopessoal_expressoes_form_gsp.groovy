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
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('set','g',4,['var':("usuarioInstance"),'value':(Usuario.get(sec.loggedInUserInfo(field: 'id')))],-1)
printHtmlPart(0)
})
invokeTag('ifLoggedIn','sec',5,[:],1)
printHtmlPart(2)
invokeTag('message','g',7,['code':("dadosexpressao.label")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'dicionariousuario', 'error'))
printHtmlPart(4)
invokeTag('message','g',10,['code':("dicionario.dicionariousuario.label"),'default':("Origem")],-1)
printHtmlPart(5)
invokeTag('select','g',13,['id':("dicionariousuario"),'name':("dicionariousuario.id"),'from':(dicionariopessoal.DicionarioUsuario.dicionariosUsuario(usuarioInstance)),'optionValue':({it.dicionario.nome + ' - ' + it.dicionario.origem.nome + ' > ' + it.dicionario.destino.nome}),'optionKey':("id"),'required':(""),'value':("id"),'class':("many-to-one")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'tipoexpressao', 'error'))
printHtmlPart(7)
invokeTag('message','g',18,['code':("dicionario.tipoexpressao.label"),'default':("Origem")],-1)
printHtmlPart(8)
invokeTag('select','g',20,['id':("tipoexpressao"),'name':("tipoexpressao.id"),'from':(dicionariopessoal.TipoExpressao.tipoExpressaoUsuario(usuarioInstance)),'optionValue':("descricao"),'optionKey':("id"),'required':(""),'value':("id"),'class':("many-to-one")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'expressaoorigem', 'error'))
printHtmlPart(10)
invokeTag('message','g',24,['code':("expressoes.expressaoorigem.label"),'default':("Expressaoorigem")],-1)
printHtmlPart(5)
invokeTag('textArea','g',27,['name':("expressaoorigem"),'value':(expressoesInstance?.expressaoorigem),'rows':("5")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'expressaodestino', 'error'))
printHtmlPart(12)
invokeTag('message','g',34,['code':("expressoes.expressaodestino.label"),'default':("Expressaodestino")],-1)
printHtmlPart(5)
invokeTag('textArea','g',37,['name':("expressaodestino"),'value':(expressoesInstance?.expressaodestino),'rows':("5")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1424284372000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
