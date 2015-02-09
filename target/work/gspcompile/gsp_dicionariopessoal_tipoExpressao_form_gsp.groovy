import dicionariopessoal.TipoExpressao
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_tipoExpressao_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tipoExpressao/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',2,['code':("dadostipoexpressao.label")],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: tipoExpressaoInstance, field: 'descricao', 'error'))
printHtmlPart(2)
invokeTag('message','g',5,['code':("tipoExpressao.descricao.label")],-1)
printHtmlPart(3)
invokeTag('textField','g',8,['name':("descricao"),'required':(""),'value':(tipoExpressaoInstance?.descricao)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: tipoExpressaoInstance, field: 'expressoes', 'error'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("tipoExpressao.expressoes.label"),'default':("Expressoes")],-1)
printHtmlPart(6)
for( e in (tipoExpressaoInstance?.expressoes) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',19,['controller':("expressoes"),'action':("show"),'id':(e.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'expressoes.label', default: 'Expressoes')]))
})
invokeTag('link','g',22,['controller':("expressoes"),'action':("create"),'params':(['tipoExpressao.id': tipoExpressaoInstance?.id])],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423485246000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
