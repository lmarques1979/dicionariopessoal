<%@ page import="dicionariopessoal.Dicionario" %>

<legend><g:message code="dadosdicionario.label"/></legend>
<div class="fieldcontain ${hasErrors(bean: dicionarioInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="dicionario.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${dicionarioInstance?.nome}" placeholder="${message(code:'dicionario.nome.label')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dicionarioInstance, field: 'origem', 'error')} required">
	<label for="origem">
		<g:message code="dicionario.origem.label" default="Origem" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="origem" name="origem.id" from="${dicionariopessoal.Idioma.list()}" optionValue="nome" optionKey="id" required="" value="${dicionarioInstance?.origem?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dicionarioInstance, field: 'destino', 'error')} required">
	<label for="destino">
		<g:message code="dicionario.destino.label" default="Destino" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="destino" name="destino.id" from="${dicionariopessoal.Idioma.list()}" optionValue="nome" optionKey="id" required="" value="${dicionarioInstance?.destino?.id}" class="many-to-one"/>

</div>

