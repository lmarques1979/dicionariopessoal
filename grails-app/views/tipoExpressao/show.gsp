
<%@ page import="dicionariopessoal.TipoExpressao" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'tipoExpressao.label', default: 'TipoExpressao')}" />
		<title><g:message code="tipoexpressao.show.label" /></title>
	</head>
	<body>
		<a href="#show-tipoExpressao" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="tipoexpressao.list.label"/></g:link></li>
				<li><g:link class="create" action="create"><g:message code="tipoexpressao.new.label"/></g:link></li>
			</ul>
		</div>
		<div id="show-tipoExpressao" class="content scaffold-show" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list tipoExpressao">
			
				<g:if test="${tipoExpressaoInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="tipoExpressao.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${tipoExpressaoInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:tipoExpressaoInstance, action:'delete']" method="DELETE">
				<g:link class="edit" action="edit" resource="${tipoExpressaoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
				<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				
			</g:form>
		</div>
	</body>
</html>
