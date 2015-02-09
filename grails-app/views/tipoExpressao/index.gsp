
<%@ page import="dicionariopessoal.TipoExpressao" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'tipoExpressao.label', default: 'TipoExpressao')}" />
		<title><g:message code="tipoexpressao.list.label"/></title>
	</head>
	<body>
		<a href="#list-tipoExpressao" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="list-tipoExpressao" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="descricao" title="${message(code: 'tipoExpressao.descricao.label', default: 'Descricao')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${tipoExpressaoInstanceList}" status="i" var="tipoExpressaoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${tipoExpressaoInstance.id}">${fieldValue(bean: tipoExpressaoInstance, field: "descricao")}</g:link></td>
					
					
					</tr>
				</g:each>
				</tbody>
			</table>
			
		</div>
	</body>
</html>
