<%@ page import="dicionariopessoal.DicionarioUsuario" %>

<div class="fieldcontain ${hasErrors(bean: dicionarioUsuarioInstance, field: 'usuario', 'error')} required">
	<label for="usuario">
		<g:message code="dicionarioUsuario.usuario.label" default="Usuario" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="usuario" name="usuario.id" from="${seguranca.Usuario.list()}" optionKey="id" required="" value="${dicionarioUsuarioInstance?.usuario?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dicionarioUsuarioInstance, field: 'dicionario', 'error')} required">
	<label for="dicionario">
		<g:message code="dicionarioUsuario.dicionario.label" default="Dicionario" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="dicionario" name="dicionario.id" from="${dicionariopessoal.Dicionario.list()}" optionKey="id" required="" value="${dicionarioUsuarioInstance?.dicionario?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dicionarioUsuarioInstance, field: 'expressoes', 'error')} ">
	<label for="expressoes">
		<g:message code="dicionarioUsuario.expressoes.label" default="Expressoes" />
		
	</label>
	<g:select name="expressoes" from="${dicionariopessoal.Expressoes.list()}" multiple="multiple" optionKey="id" size="5" value="${dicionarioUsuarioInstance?.expressoes*.id}" class="many-to-many"/>

</div>

