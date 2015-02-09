<%@ page import="dicionariopessoal.TipoExpressao" %>
<legend><g:message code="dadostipoexpressao.label"/></legend>
<div class="fieldcontain ${hasErrors(bean: tipoExpressaoInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="tipoExpressao.descricao.label"/>
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${tipoExpressaoInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tipoExpressaoInstance, field: 'expressoes', 'error')} ">
	<label for="expressoes">
		<g:message code="tipoExpressao.expressoes.label" default="Expressoes" />
	</label>
	
<ul class="one-to-many">
<g:each in="${tipoExpressaoInstance?.expressoes?}" var="e">
    <li><g:link controller="expressoes" action="show" id="${e.id}">${e?.expressaoorigem + ' > ' + e?.expressaodestino}</g:link></li>
</g:each>
<li class="add">
<g:link controller="expressoes" action="create" params="['tipoExpressao.id': tipoExpressaoInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'expressoes.label', default: 'Expressoes')])}</g:link>
</li>
</ul>


</div>

