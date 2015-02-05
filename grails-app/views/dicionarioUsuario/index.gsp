
<%@ page import="dicionariopessoal.DicionarioUsuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dicionarioUsuario.label', default: 'DicionarioUsuario')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dicionarioUsuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="list-dicionarioUsuario" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="dicionarioUsuario.usuario.label"/></th>
					
						<th><g:message code="dicionarioUsuario.dicionario.label" /></th>
					
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dicionarioUsuarioInstanceList}" status="i" var="dicionarioUsuarioInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${dicionarioUsuarioInstance.id}">${dicionarioUsuarioInstance.usuario.primeironome}</g:link></td>
					
						<td>${dicionarioUsuarioInstance.dicionario.nome}</td>
					
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dicionarioUsuarioInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
