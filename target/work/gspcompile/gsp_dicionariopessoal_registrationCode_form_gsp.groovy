import grails.plugin.springsecurity.ui.RegistrationCode
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_registrationCode_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/registrationCode/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: registrationCodeInstance, field: 'token', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("registrationCode.token.label"),'default':("Token")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("token"),'required':(""),'value':(registrationCodeInstance?.token)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: registrationCodeInstance, field: 'username', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("registrationCode.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("username"),'required':(""),'value':(registrationCodeInstance?.username)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1422987961000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
