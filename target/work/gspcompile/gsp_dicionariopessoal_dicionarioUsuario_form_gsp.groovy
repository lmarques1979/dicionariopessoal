import dicionariopessoal.DicionarioUsuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_dicionarioUsuario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dicionarioUsuario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: dicionarioUsuarioInstance, field: 'usuario', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("dicionarioUsuario.usuario.label"),'default':("Usuario")],-1)
printHtmlPart(2)
invokeTag('select','g',8,['id':("usuario"),'name':("usuario.id"),'from':(seguranca.Usuario.list()),'optionKey':("id"),'required':(""),'value':(dicionarioUsuarioInstance?.usuario?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dicionarioUsuarioInstance, field: 'dicionario', 'error'))
printHtmlPart(4)
invokeTag('message','g',14,['code':("dicionarioUsuario.dicionario.label"),'default':("Dicionario")],-1)
printHtmlPart(2)
invokeTag('select','g',17,['id':("dicionario"),'name':("dicionario.id"),'from':(dicionariopessoal.Dicionario.list()),'optionKey':("id"),'required':(""),'value':(dicionarioUsuarioInstance?.dicionario?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dicionarioUsuarioInstance, field: 'expressoes', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("dicionarioUsuario.expressoes.label"),'default':("Expressoes")],-1)
printHtmlPart(6)
invokeTag('select','g',26,['name':("expressoes"),'from':(dicionariopessoal.Expressoes.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(dicionarioUsuarioInstance?.expressoes*.id),'class':("many-to-many")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423148995000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
