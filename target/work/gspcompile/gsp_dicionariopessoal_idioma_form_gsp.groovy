import dicionariopessoal.Idioma
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_idioma_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/idioma/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',2,['code':("dadosidioma.label")],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: idiomaInstance, field: 'nome', 'error'))
printHtmlPart(2)
invokeTag('message','g',5,['code':("idioma.nome.label"),'default':("Nome")],-1)
printHtmlPart(3)
invokeTag('textField','g',8,['name':("nome"),'required':(""),'value':(idiomaInstance?.nome),'placeholder':(message(code:'idioma.nome.label'))],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: idiomaInstance, field: 'imagem', 'error'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("idioma.imagem.label"),'default':("Imagem")],-1)
printHtmlPart(6)
expressionOut.print(message(code:'idioma.imagem.label'))
printHtmlPart(7)
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
