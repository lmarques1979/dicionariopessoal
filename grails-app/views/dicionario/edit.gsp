<%@ page import="dicionariopessoal.Dicionario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dicionario.label', default: 'Dicionario')}" />
		<title><g:message code="dicionario.edit.label" /></title>
	</head>
	<body>
		<a href="#edit-dicionario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="dicionario.list.label"/></g:link></li>
				
			</ul>
		</div>
		<div id="edit-dicionario" class="content scaffold-edit" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${dicionarioInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${dicionarioInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:dicionarioInstance, action:'update']" method="PUT" >
				<g:hiddenField name="version" value="${dicionarioInstance?.version}" />
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
				
			</g:form>
		</div>
	</body>
</html>
