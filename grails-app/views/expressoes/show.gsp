
<%@ page import="dicionariopessoal.Expressoes" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'expressoes.label', default: 'Expressoes')}" />
		<title><g:message code="expressoes.show.label" /></title>
	</head>
	<body>
		<a href="#show-expressoes" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="expressoes.list.label"  /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="expressoes.new.label" /></g:link></li>
			</ul>
		</div>
		<div id="show-expressoes" class="content scaffold-show" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list expressoes">
			
				<g:if test="${expressoesInstance?.expressaoorigem}">
				<li class="fieldcontain">
					<span id="expressaoorigem-label" class="property-label"><g:message code="expressoes.expressaoorigem.label" default="Expressaoorigem" /></span>
					
						<span class="property-value" aria-labelledby="expressaoorigem-label"><g:fieldValue bean="${expressoesInstance}" field="expressaoorigem"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${expressoesInstance?.expressaodestino}">
				<li class="fieldcontain">
					<span id="expressaodestino-label" class="property-label"><g:message code="expressoes.expressaodestino.label" default="Expressaodestino" /></span>
					
						<span class="property-value" aria-labelledby="expressaodestino-label"><g:fieldValue bean="${expressoesInstance}" field="expressaodestino"/></span>
					
				</li>
				</g:if>
			
				
			
			</ol>
			<g:form url="[resource:expressoesInstance, action:'delete']" method="DELETE">
				<g:link class="edit" action="edit" resource="${expressoesInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
				<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />

			</g:form>
		</div>
	</body>
</html>
