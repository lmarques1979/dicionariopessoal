
<%@ page import="dicionariopessoal.Idioma" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'idioma.label', default: 'Idioma')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-idioma" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="list-idioma" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="nome" title="${message(code: 'idioma.nome.label', default: 'Nome')}" />
					
						<g:sortableColumn property="imagem" title="${message(code: 'idioma.imagem.label', default: 'Imagem')}" />
					
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${idiomaInstanceList}" status="i" var="idiomaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${idiomaInstance.id}">${fieldValue(bean: idiomaInstance, field: "nome")}</g:link></td>
					
						<td>
							<g:if test="${idiomaInstance?.imagem}">
										<asset:image src="${idiomaInstance?.imagem}" title="${idiomaInstance.nome}"/>
							</g:if>
						</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${idiomaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
