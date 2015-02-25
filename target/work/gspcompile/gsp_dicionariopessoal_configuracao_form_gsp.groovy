import dicionariopessoal.Configuracao
import seguranca.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_configuracao_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/configuracao/_form.gsp" }
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
invokeTag('message','g',6,['code':("dadosconfiguracao.label")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: configuracaoInstance, field: 'alturaimagens', 'error'))
printHtmlPart(4)
invokeTag('message','g',9,['code':("configuracao.alturaimagens.label"),'default':("Alturaimagens")],-1)
printHtmlPart(5)
invokeTag('field','g',12,['name':("alturaimagens"),'type':("number"),'value':(configuracaoInstance.alturaimagens),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: configuracaoInstance, field: 'larguraimagens', 'error'))
printHtmlPart(7)
invokeTag('message','g',18,['code':("configuracao.larguraimagens.label"),'default':("Larguraimagens")],-1)
printHtmlPart(5)
invokeTag('field','g',21,['name':("larguraimagens"),'type':("number"),'value':(configuracaoInstance.larguraimagens),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: configuracaoInstance, field: 'alturaimagensthumbs', 'error'))
printHtmlPart(8)
invokeTag('message','g',27,['code':("configuracao.alturaimagensthumbs.label"),'default':("Alturaimagensthumbs")],-1)
printHtmlPart(5)
invokeTag('field','g',30,['name':("alturaimagensthumbs"),'type':("number"),'value':(configuracaoInstance.alturaimagensthumbs),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: configuracaoInstance, field: 'larguraimagensthumbs', 'error'))
printHtmlPart(9)
invokeTag('message','g',36,['code':("configuracao.larguraimagensthumbs.label"),'default':("Larguraimagensthumbs")],-1)
printHtmlPart(5)
invokeTag('field','g',39,['name':("larguraimagensthumbs"),'type':("number"),'value':(configuracaoInstance.larguraimagensthumbs),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: configuracaoInstance, field: 'itensporpagina', 'error'))
printHtmlPart(10)
invokeTag('message','g',45,['code':("configuracao.itensporpagina.label"),'default':("Itensporpagina")],-1)
printHtmlPart(5)
invokeTag('field','g',48,['name':("itensporpagina"),'type':("number"),'value':(configuracaoInstance.itensporpagina),'required':("")],-1)
printHtmlPart(11)
invokeTag('hiddenField','g',52,['name':("usuario"),'value':(usuarioInstance.id)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1424889456000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
