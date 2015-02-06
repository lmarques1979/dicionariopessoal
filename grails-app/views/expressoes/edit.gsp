<%@ page import="dicionariopessoal.Expressoes" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'expressoes.label', default: 'Expressoes')}" />
		<title><g:message code="expressoes.edit.label" /></title>
	</head>
	<body>
		<a href="#edit-expressoes" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="expressoes.list.label"/></g:link></li>
				
			</ul>
		</div>
		<div id="edit-expressoes" class="content scaffold-edit" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${expressoesInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${expressoesInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:expressoesInstance, action:'update']" method="PUT" >
				<g:hiddenField name="version" value="${expressoesInstance?.version}" />
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
				
			</g:form>
		</div>
	</body>
</html>
