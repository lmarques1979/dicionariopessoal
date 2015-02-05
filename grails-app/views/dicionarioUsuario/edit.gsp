<%@ page import="dicionariopessoal.DicionarioUsuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dicionarioUsuario.label', default: 'DicionarioUsuario')}" />
		<title><g:message code="dicionariousuario.edit.label"/></title>
	</head>
	<body>
		<a href="#edit-dicionarioUsuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="dicionariousuario.list.label"/></g:link></li>
				<li><g:link class="create" action="create"><g:message code="dicionariousuario.new.label" /></g:link></li>
			</ul>
		</div>
		<div id="edit-dicionarioUsuario" class="content scaffold-edit" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${dicionarioUsuarioInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${dicionarioUsuarioInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:dicionarioUsuarioInstance, action:'update']" method="PUT" >
				<g:hiddenField name="version" value="${dicionarioUsuarioInstance?.version}" />
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
				
			</g:form>
		</div>
	</body>
</html>
