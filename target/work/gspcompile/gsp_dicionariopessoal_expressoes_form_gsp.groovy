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
invokeTag('set','g',7,['var':("tipoexpressao"),'value':(params.int('tipoexpressao'))],-1)
printHtmlPart(0)
invokeTag('set','g',8,['var':("dicionariousuario"),'value':(params.int('dicionariousuario'))],-1)
printHtmlPart(3)
invokeTag('message','g',10,['code':("dadosexpressao.label")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'dicionariousuario', 'error'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("dicionario.dicionariousuario.label"),'default':("Origem")],-1)
printHtmlPart(6)
invokeTag('select','g',16,['id':("dicionariousuario"),'name':("dicionariousuario.id"),'from':(dicionariopessoal.DicionarioUsuario.dicionariosUsuario(usuarioInstance)),'optionValue':({it.dicionario.nome + ' - ' + it.dicionario.origem.nome + ' > ' + it.dicionario.destino.nome}),'optionKey':("id"),'required':(""),'value':(dicionariousuario),'class':("many-to-one")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'tipoexpressao', 'error'))
printHtmlPart(8)
invokeTag('message','g',21,['code':("dicionario.tipoexpressao.label"),'default':("Origem")],-1)
printHtmlPart(9)
invokeTag('select','g',23,['id':("tipoexpressao"),'name':("tipoexpressao.id"),'from':(dicionariopessoal.TipoExpressao.tipoExpressaoUsuario(usuarioInstance)),'optionValue':("descricao"),'optionKey':("id"),'required':(""),'value':(tipoexpressao),'class':("many-to-one")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'expressaoorigem', 'error'))
printHtmlPart(11)
invokeTag('message','g',27,['code':("expressoes.expressaoorigem.label"),'default':("Expressaoorigem")],-1)
printHtmlPart(6)
invokeTag('textArea','g',30,['name':("expressaoorigem"),'value':(expressoesInstance?.expressaoorigem),'rows':("5")],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: expressoesInstance, field: 'expressaodestino', 'error'))
printHtmlPart(13)
invokeTag('message','g',37,['code':("expressoes.expressaodestino.label"),'default':("Expressaodestino")],-1)
printHtmlPart(6)
invokeTag('textArea','g',40,['name':("expressaodestino"),'value':(expressoesInstance?.expressaodestino),'rows':("5")],-1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1424534804000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
