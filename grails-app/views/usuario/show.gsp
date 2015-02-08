
<%@ page import="seguranca.Usuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'usuario.label', default: 'Usuario')}" />
		<title><g:message code="usuario.show.label"/></title>
	</head>
	<body>
		<a href="#show-usuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="show-usuario" class="content scaffold-show" role="main">
			<g:hasErrors bean="${usuarioInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${usuarioInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:if test="${flash.erros}">
			<ul class="errors" role="alert">
				<g:each in="${flash.erros}" status="i" var="erro">
					<li>${erro}</li>
				</g:each>
			</ul>
			</g:if>
			<g:else>
				<ol class="property-list usuario">
				
					<g:if test="${usuarioInstance?.username}">
					<li class="fieldcontain">
						<span id="username-label" class="property-label"><g:message code="usuario.username.label" default="Username" /></span>
						
							<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${usuarioInstance}" field="username"/></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.email}">
					<li class="fieldcontain">
						<span id="email-label" class="property-label"><g:message code="usuario.email.label" default="Email" /></span>
						
							<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${usuarioInstance}" field="email"/></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.primeironome}">
					<li class="fieldcontain">
						<span id="primeironome-label" class="property-label"><g:message code="usuario.primeironome.label" default="Primeironome" /></span>
						
							<span class="property-value" aria-labelledby="primeironome-label"><g:fieldValue bean="${usuarioInstance}" field="primeironome"/></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.sobrenome}">
					<li class="fieldcontain">
						<span id="sobrenome-label" class="property-label"><g:message code="usuario.sobrenome.label" default="Sobrenome" /></span>
						
							<span class="property-value" aria-labelledby="sobrenome-label"><g:fieldValue bean="${usuarioInstance}" field="sobrenome"/></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.imagem}">
					<li class="fieldcontain">
						<span id="imagem-label" class="property-label"><g:message code="usuario.imagem.label" default="Imagem" /></span>
						
							<span class="property-value" aria-labelledby="imagem-label"><g:fieldValue bean="${usuarioInstance}" field="imagem"/></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.accountExpired}">
					<li class="fieldcontain">
						<span id="accountExpired-label" class="property-label"><g:message code="usuario.accountExpired.label" default="Account Expired" /></span>
						
							<span class="property-value" aria-labelledby="accountExpired-label"><g:formatBoolean boolean="${usuarioInstance?.accountExpired}" /></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.accountLocked}">
					<li class="fieldcontain">
						<span id="accountLocked-label" class="property-label"><g:message code="usuario.accountLocked.label" default="Account Locked" /></span>
						
							<span class="property-value" aria-labelledby="accountLocked-label"><g:formatBoolean boolean="${usuarioInstance?.accountLocked}" /></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.enabled}">
					<li class="fieldcontain">
						<span id="enabled-label" class="property-label"><g:message code="usuario.enabled.label" default="Enabled" /></span>
						
							<span class="property-value" aria-labelledby="enabled-label"><g:formatBoolean boolean="${usuarioInstance?.enabled}" /></span>
						
					</li>
					</g:if>
				
					<g:if test="${usuarioInstance?.passwordExpired}">
					<li class="fieldcontain">
						<span id="passwordExpired-label" class="property-label"><g:message code="usuario.passwordExpired.label" default="Password Expired" /></span>
						
							<span class="property-value" aria-labelledby="passwordExpired-label"><g:formatBoolean boolean="${usuarioInstance?.passwordExpired}" /></span>
						
					</li>
					</g:if>
				
				</ol>
				<g:form url="[resource:usuarioInstance, action:'delete']" method="DELETE">
					<g:link class="edit" action="edit" resource="${usuarioInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</g:form>
			</g:else>
		</div>
	</body>
</html>
