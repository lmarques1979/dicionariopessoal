import dicionariopessoal.DicionarioUsuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_dicionarioUsuarioshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dicionarioUsuario/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'dicionarioUsuario.label', default: 'DicionarioUsuario'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("dicionariousuario.show.label")],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',14,['code':("dicionariousuario.list.label")],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("index")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("dicionariousuario.new.label")],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (dicionarioUsuarioInstance?.usuario)) {
printHtmlPart(11)
invokeTag('message','g',26,['code':("dicionarioUsuario.usuario.label"),'default':("Usuario")],-1)
printHtmlPart(12)
createTagBody(3, {->
expressionOut.print(dicionarioUsuarioInstance?.usuario?.primeironome)
})
invokeTag('link','g',28,['controller':("usuario"),'action':("show"),'id':(dicionarioUsuarioInstance?.usuario?.id)],3)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (dicionarioUsuarioInstance?.dicionario)) {
printHtmlPart(15)
invokeTag('message','g',35,['code':("dicionarioUsuario.dicionario.label"),'default':("Dicionario")],-1)
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(dicionarioUsuarioInstance?.dicionario?.nome)
})
invokeTag('link','g',37,['controller':("dicionario"),'action':("show"),'id':(dicionarioUsuarioInstance?.dicionario?.id)],3)
printHtmlPart(13)
}
printHtmlPart(17)
if(true && (dicionarioUsuarioInstance?.expressoes)) {
printHtmlPart(18)
invokeTag('message','g',44,['code':("dicionarioUsuario.expressoes.label"),'default':("Expressoes")],-1)
printHtmlPart(19)
for( e in (dicionarioUsuarioInstance.expressoes) ) {
printHtmlPart(20)
createTagBody(4, {->
expressionOut.print(e?.expressaoorigem + ' > ' + e?.expressaodestino)
})
invokeTag('link','g',47,['controller':("expressoes"),'action':("show"),'id':(e.id)],4)
printHtmlPart(21)
}
printHtmlPart(22)
}
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',58,[:],1)
printHtmlPart(24)
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
