<%@ page import="grails.plugin.springsecurity.ui.RegistrationCode" %>



<div class="fieldcontain ${hasErrors(bean: registrationCodeInstance, field: 'token', 'error')} required">
	<label for="token">
		<g:message code="registrationCode.token.label" default="Token" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="token" required="" value="${registrationCodeInstance?.token}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: registrationCodeInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="registrationCode.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${registrationCodeInstance?.username}"/>

</div>

