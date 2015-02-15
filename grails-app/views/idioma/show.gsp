
<%@ page import="dicionariopessoal.Idioma" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'idioma.label', default: 'Idioma')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-idioma" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="idioma.list.label"/></g:link></li>
				<li><g:link class="create" action="create"><g:message code="idioma.new.label"/></g:link></li>
			</ul>
		</div>
		<div id="show-idioma" class="content scaffold-show" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list idioma">
			
				<g:if test="${idiomaInstance?.nome}">
				<li class="fieldcontain">
					<span id="nome-label" class="property-label"><g:message code="idioma.nome.label" default="Nome" /></span>
					
						<span class="property-value" aria-labelledby="nome-label"><g:fieldValue bean="${idiomaInstance}" field="nome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${idiomaInstance?.imagem}">
				<li class="fieldcontain">
					<span id="imagem-label" class="property-label"><g:message code="idioma.imagem.label" default="Imagem" /></span>
					
						<span class="property-value" aria-labelledby="imagem-label">
							<g:if test="${idiomaInstance?.imagem}">
										<asset:image src="${idiomaInstance?.imagem}" title="${idiomaInstance.nome}"/>
							</g:if>
						</span>
					
				</li>
				</g:if>
			
			
			</ol>
			<g:form url="[resource:idiomaInstance, action:'delete']" method="DELETE">
				<g:link class="edit" action="edit" resource="${idiomaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
				<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				
			</g:form>
		</div>
	</body>
</html>
