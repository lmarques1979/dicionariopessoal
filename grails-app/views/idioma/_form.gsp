<%@ page import="dicionariopessoal.Idioma" %>
<legend><g:message code="dadosidioma.label"/></legend>
<div class="fieldcontain ${hasErrors(bean: idiomaInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="idioma.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${idiomaInstance?.nome}" placeholder="${message(code:'idioma.nome.label') }"/>

</div>

<div class="fieldcontain ${hasErrors(bean: idiomaInstance, field: 'imagem', 'error')} ">
	<label for="imagem">
		<g:message code="idioma.imagem.label" default="Imagem" />
		
	</label>
	<input type="file" name="arquivo" placeholder="${message(code:'idioma.imagem.label') }"/>
	
</div>

