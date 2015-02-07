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
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
invokeTag('stylesheet','asset',15,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',16,['src':("application.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',17,[:],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',18,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
invokeTag('message','g',22,['code':("header.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('image','asset',23,['class':("internacionalizacao"),'src':("bandeiras/24/Brazil.png"),'title':(message(code:'portuguesbrasil.label'))],-1)
})
invokeTag('link','g',23,['id':(params.id),'action':(params.action ? params.action : 'index'),'controller':(params.controller ? params.controller : 'index'),'params':([lang: 'pt_BR'])],2)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('image','asset',24,['class':("internacionalizacao"),'src':("bandeiras/24/britain.png"),'title':(message(code:'english.label'))],-1)
})
invokeTag('link','g',24,['id':(params.id),'action':(params.action ? params.action : 'index'),'controller':(params.controller ? params.controller : 'index'),'params':([lang: 'en'])],2)
printHtmlPart(10)
invokeTag('message','g',28,['code':("header.label")],-1)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
createTagBody(3, {->
invokeTag('message','g',32,['code':("cadastrousuario.label")],-1)
})
invokeTag('link','g',32,['class':("cadastro"),'controller':("Usuario"),'action':("create")],3)
printHtmlPart(13)
createTagBody(3, {->
invokeTag('message','g',33,['code':("login.label")],-1)
})
invokeTag('link','g',33,['class':("login"),'controller':("login"),'action':("auth")],3)
printHtmlPart(14)
})
invokeTag('ifNotLoggedIn','sec',34,[:],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
invokeTag('message','g',37,['code':("dadosusuario.label")],-1)
})
invokeTag('link','g',37,['class':("usuario"),'controller':("Usuario"),'action':("show"),'id':(sec.loggedInUserInfo(field:"id"))],3)
printHtmlPart(16)
if(true && (sec.loggedInUserInfo(field: 'username') == 'admin')) {
printHtmlPart(17)
createTagBody(4, {->
invokeTag('message','g',40,['code':("cadastroidioma.label")],-1)
})
invokeTag('link','g',40,['class':("idioma"),'controller':("Idioma"),'action':("create")],4)
printHtmlPart(18)
}
else {
printHtmlPart(17)
createTagBody(4, {->
invokeTag('message','g',43,['code':("adddicionario.label")],-1)
})
invokeTag('link','g',43,['class':("dicionario"),'controller':("Dicionario"),'action':("create")],4)
printHtmlPart(19)
createTagBody(4, {->
invokeTag('message','g',44,['code':("addexpressao.label")],-1)
})
invokeTag('link','g',44,['class':("addexpressao"),'controller':("Expressoes"),'action':("create")],4)
printHtmlPart(19)
createTagBody(4, {->
invokeTag('message','g',45,['code':("visualizaexpressoes.label")],-1)
})
invokeTag('link','g',45,['class':("expressao"),'controller':("Expressoes"),'action':("index")],4)
printHtmlPart(18)
}
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',47,['code':("logout.label")],-1)
})
invokeTag('link','g',47,['class':("logout"),'controller':("logout"),'action':("index")],3)
printHtmlPart(14)
})
invokeTag('ifLoggedIn','sec',48,[:],2)
printHtmlPart(21)
invokeTag('layoutBody','g',52,[:],-1)
printHtmlPart(22)
invokeTag('message','g',53,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',54,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423250183000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
