
<%@ page import="dicionariopessoal.Dicionario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dicionario.label', default: 'Dicionario')}" />
		<title><g:message code="dicionario.show.label"/></title>
	</head>
	<body>
		<a href="#show-dicionario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="dicionario.list.label" /></g:link></li>
				
			</ul>
		</div>
		<div id="show-dicionario" class="content scaffold-show" role="main">
		
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<ol class="property-list dicionario">
				
				<g:if test="${dicionarioInstance?.nome}">
				<li class="fieldcontain">
					<span id="nome-label" class="property-label"><g:message code="dicionario.nome.label" default="Nome" /></span>
					
						<span class="property-value" aria-labelledby="nome-label"><g:fieldValue bean="${dicionarioInstance}" field="nome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dicionarioInstance?.origem}">
				<li class="fieldcontain">
					<span id="origem-label" class="property-label"><g:message code="dicionario.origem.label" default="Origem" /></span>
					
						<span class="property-value" aria-labelledby="origem-label">${dicionarioInstance?.origem?.nome}</span>
					
				</li>
				</g:if>
			
				<g:if test="${dicionarioInstance?.destino}">
				<li class="fieldcontain">
					<span id="destino-label" class="property-label"><g:message code="dicionario.destino.label" default="Destino" /></span>
					
						<span class="property-value" aria-labelledby="destino-label">${dicionarioInstance?.destino?.nome}</span>
					
				</li>
				</g:if>
			
				
			
			</ol>
			<g:form url="[resource:dicionarioInstance, action:'delete']" method="DELETE">
				<div class="centro">
					<g:link class="edit" action="edit" resource="${dicionarioInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</div>
			</g:form>
		</div>
	</body>
</html>
