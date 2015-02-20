import seguranca.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('set','g',3,['var':("usuarioInstance"),'value':(Usuario.get(sec.loggedInUserInfo(field: 'id')))],-1)
printHtmlPart(0)
})
invokeTag('ifLoggedIn','sec',4,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',15,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(4)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(5)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(6)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(7)
invokeTag('stylesheet','asset',20,['src':("application.css")],-1)
printHtmlPart(8)
invokeTag('javascript','asset',21,['src':("application.js")],-1)
printHtmlPart(3)
invokeTag('layoutHead','g',22,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',23,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(9)
invokeTag('message','g',27,['code':("header.label")],-1)
printHtmlPart(10)
createTagBody(2, {->
invokeTag('image','asset',28,['class':("internacionalizacao"),'src':("bandeiras/24/Brazil.png"),'title':(message(code:'portuguesbrasil.label'))],-1)
})
invokeTag('link','g',28,['id':(params.id),'action':(params.action ? params.action : 'index'),'controller':(params.controller ? params.controller : 'index'),'params':([lang: 'pt_BR'])],2)
printHtmlPart(11)
createTagBody(2, {->
invokeTag('image','asset',29,['class':("internacionalizacao"),'src':("bandeiras/24/britain.png"),'title':(message(code:'english.label'))],-1)
})
invokeTag('link','g',29,['id':(params.id),'action':(params.action ? params.action : 'index'),'controller':(params.controller ? params.controller : 'index'),'params':([lang: 'en'])],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
createTagBody(3, {->
expressionOut.print(usuarioInstance.buscaNome(usuarioInstance))
printHtmlPart(14)
expressionOut.print(usuarioInstance.username)
printHtmlPart(15)
})
invokeTag('link','g',32,['class':("usuariologado"),'id':(usuarioInstance.id),'action':("show"),'controller':("Usuario")],3)
printHtmlPart(11)
})
invokeTag('ifLoggedIn','sec',33,[:],2)
printHtmlPart(16)
invokeTag('message','g',38,['code':("header.label")],-1)
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',41,['code':("cadastrousuario.label")],-1)
})
invokeTag('link','g',41,['class':("cadastro"),'controller':("Usuario"),'action':("create")],3)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',42,['code':("login.label")],-1)
})
invokeTag('link','g',42,['class':("login"),'controller':("login"),'action':("auth")],3)
printHtmlPart(20)
})
invokeTag('ifNotLoggedIn','sec',43,[:],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(21)
if(true && (sec.loggedInUserInfo(field: 'username') == 'admin')) {
printHtmlPart(22)
createTagBody(4, {->
invokeTag('message','g',47,['code':("cadastroidioma.label")],-1)
})
invokeTag('link','g',47,['class':("idioma"),'controller':("Idioma"),'action':("create")],4)
printHtmlPart(23)
}
else {
printHtmlPart(22)
createTagBody(4, {->
invokeTag('message','g',50,['code':("adddicionario.label")],-1)
})
invokeTag('link','g',50,['class':("dicionario"),'controller':("Dicionario"),'action':("create")],4)
printHtmlPart(24)
createTagBody(4, {->
invokeTag('message','g',51,['code':("addtipoexpressao.label")],-1)
})
invokeTag('link','g',51,['class':("tipoexpressao"),'controller':("TipoExpressao"),'action':("create")],4)
printHtmlPart(24)
createTagBody(4, {->
invokeTag('message','g',52,['code':("addexpressao.label")],-1)
})
invokeTag('link','g',52,['class':("addexpressao"),'controller':("Expressoes"),'action':("create")],4)
printHtmlPart(24)
createTagBody(4, {->
invokeTag('message','g',53,['code':("visualizaexpressoes.label")],-1)
})
invokeTag('link','g',53,['class':("expressao"),'controller':("Expressoes"),'action':("index")],4)
printHtmlPart(23)
}
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',55,['code':("logout.label")],-1)
})
invokeTag('link','g',55,['class':("logout"),'controller':("logout"),'action':("index")],3)
printHtmlPart(20)
})
invokeTag('ifLoggedIn','sec',56,[:],2)
printHtmlPart(25)
invokeTag('layoutBody','g',60,[:],-1)
printHtmlPart(26)
invokeTag('message','g',61,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',62,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1424289898000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
