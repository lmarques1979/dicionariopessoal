
<%@ page import="dicionariopessoal.Dicionario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dicionario.label', default: 'Dicionario')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>

		<a href="#list-dicionario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="list-dicionario" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="dicionario.nome" title="${message(code: 'dicionario.nome.label', default: 'Nome')}" />
					
						<th><g:message code="dicionario.origem.label" default="Origem" /></th>
					
						<th><g:message code="dicionario.destino.label" default="Destino" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dicionarioInstanceList}" status="i" var="dicionarioInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${dicionarioInstance.id}">${fieldValue(bean: dicionarioInstance, field: "nome")}</g:link></td>
					
						<td>${dicionarioInstance?.origem?.nome}</td>
					
						<td>${dicionarioInstance?.destino?.nome}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dicionarioInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
