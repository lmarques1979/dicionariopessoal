import dicionariopessoal.Dicionario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_dicionario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dicionario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',3,['code':("dadosdicionario.label")],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: dicionarioInstance, field: 'nome', 'error'))
printHtmlPart(2)
invokeTag('message','g',6,['code':("dicionario.nome.label"),'default':("Nome")],-1)
printHtmlPart(3)
invokeTag('textField','g',9,['name':("nome"),'required':(""),'value':(dicionarioInstance?.nome),'placeholder':(message(code:'dicionario.nome.label'))],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dicionarioInstance, field: 'origem', 'error'))
printHtmlPart(5)
invokeTag('message','g',15,['code':("dicionario.origem.label"),'default':("Origem")],-1)
printHtmlPart(3)
invokeTag('select','g',18,['id':("origem"),'name':("origem.id"),'from':(dicionariopessoal.Idioma.list()),'optionValue':("nome"),'optionKey':("id"),'required':(""),'value':(dicionarioInstance?.origem?.id),'class':("many-to-one")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dicionarioInstance, field: 'destino', 'error'))
printHtmlPart(6)
invokeTag('message','g',24,['code':("dicionario.destino.label"),'default':("Destino")],-1)
printHtmlPart(3)
invokeTag('select','g',27,['id':("destino"),'name':("destino.id"),'from':(dicionariopessoal.Idioma.list()),'optionValue':("nome"),'optionKey':("id"),'required':(""),'value':(dicionarioInstance?.destino?.id),'class':("many-to-one")],-1)
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
