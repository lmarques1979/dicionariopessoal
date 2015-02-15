import dicionariopessoal.Expressoes
import seguranca.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dicionariopessoal_expressoesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/expressoes/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (expressoesInstanceCount>0)) {
printHtmlPart(1)
invokeTag('set','g',3,['var':("linguaorigem"),'value':(expressoesInstanceList[0].dicionariousuario.dicionario.origem.nome)],-1)
printHtmlPart(1)
invokeTag('set','g',4,['var':("linguadestino"),'value':(expressoesInstanceList[0].dicionariousuario.dicionario.destino.nome)],-1)
printHtmlPart(0)
}
printHtmlPart(0)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('set','g',8,['var':("usuarioInstance"),'value':(Usuario.get(sec.loggedInUserInfo(field: 'id')))],-1)
printHtmlPart(0)
})
invokeTag('ifLoggedIn','sec',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
invokeTag('set','g',14,['var':("entityName"),'value':(message(code: 'expressoes.label', default: 'Expressoes'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',15,['code':("expressoes.list.label")],-1)
})
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',19,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('message','g',28,['code':("filtroexpressoes.label")],-1)
printHtmlPart(10)
invokeTag('message','g',32,['code':("dicionario.dicionariousuario.label")],-1)
printHtmlPart(11)
invokeTag('select','g',34,['onchange':("this.form.submit()"),'noSelection':(['-1': message(code:'selecionardicionario.label')]),'value':(params.int('filtrodicionario')),'optionValue':({it.dicionario.nome + ' - ' + it.dicionario.origem.nome + ' > ' + it.dicionario.destino.nome}),'name':("filtrodicionario"),'from':(dicionariopessoal.DicionarioUsuario.dicionariosUsuario(usuarioInstance)),'optionKey':("id")],-1)
printHtmlPart(12)
invokeTag('message','g',38,['code':("tipoexpressao.label")],-1)
printHtmlPart(11)
invokeTag('select','g',40,['onchange':("this.form.submit()"),'noSelection':(['-1': message(code:'selecionarexpressao.label')]),'value':(params.int('filtroexpressao')),'optionValue':("descricao"),'name':("filtroexpressao"),'from':(dicionariopessoal.TipoExpressao.tipoExpressaoUsuario(usuarioInstance)),'optionKey':("id")],-1)
printHtmlPart(13)
invokeTag('submitButton','g',42,['class':("invisivel"),'name':("create"),'value':("Filtrar")],-1)
printHtmlPart(14)
})
invokeTag('form','g',45,['url':([resource:expressoesInstance, action:'index'])],2)
printHtmlPart(15)
invokeTag('sortableColumn','g',51,['property':("expressaoorigem"),'params':(params),'title':(message(code: 'expressoes.expressaoorigem.label', default: 'Expressaoorigem') + (linguaorigem ? ' - ' + linguaorigem : ''))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',53,['property':("expressaodestino"),'params':(params),'title':(message(code: 'expressoes.expressaodestino.label', default: 'Expressaodestino') + (linguadestino ? ' - ' + linguadestino : ''))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',55,['property':("tipoexpressao.descricao"),'params':(params),'title':(message(code: 'tipoexpressao.label', default: 'Expressaodestino'))],-1)
printHtmlPart(18)
loop:{
int i = 0
for( expressoesInstance in (expressoesInstanceList) ) {
printHtmlPart(19)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(20)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: expressoesInstance, field: "expressaoorigem"))
})
invokeTag('link','g',64,['action':("show"),'id':(expressoesInstance.id)],3)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: expressoesInstance, field: "expressaodestino"))
printHtmlPart(22)
expressionOut.print(expressoesInstance?.tipoexpressao?.descricao ? expressoesInstance?.tipoexpressao?.descricao : '')
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',77,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423852472000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
