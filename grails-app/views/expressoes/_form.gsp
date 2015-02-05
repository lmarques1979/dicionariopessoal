<%@ page import="dicionariopessoal.Expressoes" %>
<div class="fieldcontain ${hasErrors(bean: expressoesInstance, field: 'dicionariousuario', 'error')} required">
	<label for="origem">
		<g:message code="dicionario.dicionariousuario.label" default="Origem" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="dicionariousuario" name="dicionariousuario.id" from="${dicionariopessoal.DicionarioUsuario.dicionariosUsuario()}" optionValue="${{it.dicionario.nome + ' - ' + it.dicionario.origem.nome + ' > ' + it.dicionario.destino.nome}}" optionKey="id" required="" value="id" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: expressoesInstance, field: 'expressaoorigem', 'error')} required">
	<label for="expressaoorigem">
		<g:message code="expressoes.expressaoorigem.label" default="Expressaoorigem" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="expressaoorigem" value="${expressoesInstance?.expressaoorigem}" rows="5"/>
	

</div>

<div class="fieldcontain ${hasErrors(bean: expressoesInstance, field: 'expressaodestino', 'error')} required">
	<label for="expressaodestino">
		<g:message code="expressoes.expressaodestino.label" default="Expressaodestino" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="expressaodestino" value="${expressoesInstance?.expressaodestino}" rows="5"/>
	
</div>

