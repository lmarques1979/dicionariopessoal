import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_idiomacreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/idioma/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'idioma.label', default: 'Idioma'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',9,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
createTagBody(2, {->
invokeTag('message','g',12,['code':("idioma.list.label")],-1)
})
invokeTag('link','g',12,['class':("list"),'action':("index")],2)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(11)
expressionOut.print(error.field)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('message','g',22,['error':(error)],-1)
printHtmlPart(14)
})
invokeTag('eachError','g',23,['bean':(idiomaInstance),'var':("error")],3)
printHtmlPart(15)
})
invokeTag('hasErrors','g',25,['bean':(idiomaInstance)],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('render','g',28,['template':("form")],-1)
printHtmlPart(17)
invokeTag('submitButton','g',30,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(8)
})
invokeTag('uploadForm','g',31,['url':([resource:idiomaInstance, action:'save'])],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',33,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423074880000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
