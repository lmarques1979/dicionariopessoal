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
if(true && (params.filtrodicionario)) {
printHtmlPart(1)
invokeTag('set','g',3,['var':("filtro"),'value':(params.int('filtrodicionario'))],-1)
printHtmlPart(0)
}
else {
printHtmlPart(1)
invokeTag('set','g',6,['var':("filtro"),'value':("-1")],-1)
printHtmlPart(0)
}
printHtmlPart(0)
if(true && (expressoesInstanceCount>0)) {
printHtmlPart(1)
invokeTag('set','g',9,['var':("linguaorigem"),'value':(expressoesInstanceList[0].dicionariousuario.dicionario.origem.nome)],-1)
printHtmlPart(1)
invokeTag('set','g',10,['var':("linguadestino"),'value':(expressoesInstanceList[0].dicionariousuario.dicionario.destino.nome)],-1)
printHtmlPart(0)
}
printHtmlPart(0)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('set','g',14,['var':("usuarioInstance"),'value':(Usuario.get(sec.loggedInUserInfo(field: 'id')))],-1)
printHtmlPart(0)
})
invokeTag('ifLoggedIn','sec',15,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
invokeTag('set','g',20,['var':("entityName"),'value':(message(code: 'expressoes.label', default: 'Expressoes'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',21,['code':("expressoes.list.label")],-1)
})
invokeTag('captureTitle','sitemesh',21,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',21,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',25,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(message(code: "dicionario.label"))
printHtmlPart(10)
invokeTag('select','g',44,['onchange':("this.form.submit()"),'noSelection':(['-1': message(code:'selecionardicionario.label')]),'value':(filtro),'optionValue':({it.dicionario.nome + ' - ' + it.dicionario.origem.nome + ' > ' + it.dicionario.destino.nome}),'name':("filtrodicionario"),'from':(dicionariopessoal.DicionarioUsuario.dicionariosUsuario(usuarioInstance)),'optionKey':("id")],-1)
printHtmlPart(11)
invokeTag('submitButton','g',48,['class':("invisivel"),'name':("create"),'value':("Filtrar")],-1)
printHtmlPart(12)
})
invokeTag('form','g',49,['url':([resource:expressoesInstance, action:'index'])],2)
printHtmlPart(13)
invokeTag('sortableColumn','g',56,['property':("expressaoorigem"),'title':(message(code: 'expressoes.expressaoorigem.label', default: 'Expressaoorigem') + (linguaorigem ? ' - ' + linguaorigem : ''))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',58,['property':("expressaodestino"),'title':(message(code: 'expressoes.expressaodestino.label', default: 'Expressaodestino') + (linguadestino ? ' - ' + linguadestino : ''))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( expressoesInstance in (expressoesInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: expressoesInstance, field: "expressaoorigem"))
})
invokeTag('link','g',67,['action':("show"),'id':(expressoesInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: expressoesInstance, field: "expressaodestino"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',77,['total':(expressoesInstanceCount ?: 0)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',80,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423253517000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
