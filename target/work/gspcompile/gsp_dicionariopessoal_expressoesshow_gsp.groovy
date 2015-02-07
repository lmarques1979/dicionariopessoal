import dicionariopessoal.Expressoes
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_expressoesshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/expressoes/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'expressoes.label', default: 'Expressoes'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("expressoes.show.label")],-1)
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
invokeTag('message','g',14,['code':("expressoes.list.label")],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("index")],2)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (expressoesInstance?.expressaoorigem)) {
printHtmlPart(10)
invokeTag('message','g',28,['code':("expressoes.expressaoorigem.label"),'default':("Expressaoorigem")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',30,['bean':(expressoesInstance),'field':("expressaoorigem")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (expressoesInstance?.expressaodestino)) {
printHtmlPart(14)
invokeTag('message','g',38,['code':("expressoes.expressaodestino.label"),'default':("Expressaodestino")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',40,['bean':(expressoesInstance),'field':("expressaodestino")],-1)
printHtmlPart(12)
}
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(17)
createTagBody(3, {->
invokeTag('message','g',49,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',49,['class':("edit"),'action':("edit"),'resource':(expressoesInstance)],3)
printHtmlPart(17)
invokeTag('actionSubmit','g',50,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(18)
})
invokeTag('form','g',52,['url':([resource:expressoesInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',54,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423243034000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
