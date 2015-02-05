
<%@ page import="dicionariopessoal.DicionarioUsuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dicionarioUsuario.label', default: 'DicionarioUsuario')}" />
		<title><g:message code="dicionariousuario.show.label"/></title>
	</head>
	<body>
		<a href="#show-dicionarioUsuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link class="list" action="index"><g:message code="dicionariousuario.list.label"/></g:link></li>
				<li><g:link class="create" action="create"><g:message code="dicionariousuario.new.label"/></g:link></li>
			</ul>
		</div>
		<div id="show-dicionarioUsuario" class="content scaffold-show" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list dicionarioUsuario">
			
				<g:if test="${dicionarioUsuarioInstance?.usuario}">
				<li class="fieldcontain">
					<span id="usuario-label" class="property-label"><g:message code="dicionarioUsuario.usuario.label" default="Usuario" /></span>
					
						<span class="property-value" aria-labelledby="usuario-label"><g:link controller="usuario" action="show" id="${dicionarioUsuarioInstance?.usuario?.id}">${dicionarioUsuarioInstance?.usuario?.primeironome}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${dicionarioUsuarioInstance?.dicionario}">
				<li class="fieldcontain">
					<span id="dicionario-label" class="property-label"><g:message code="dicionarioUsuario.dicionario.label" default="Dicionario" /></span>
					
						<span class="property-value" aria-labelledby="dicionario-label"><g:link controller="dicionario" action="show" id="${dicionarioUsuarioInstance?.dicionario?.id}">${dicionarioUsuarioInstance?.dicionario?.nome}</g:link></span>
					
				</li>
				</g:if>
										
				<g:if test="${dicionarioUsuarioInstance?.expressoes}">
				<li class="fieldcontain">
					<span id="expressoes-label" class="property-label"><g:message code="dicionarioUsuario.expressoes.label" default="Expressoes" /></span>
					
						<g:each in="${dicionarioUsuarioInstance.expressoes}" var="e">
						<span class="property-value" aria-labelledby="expressoes-label"><g:link controller="expressoes" action="show" id="${e.id}">${e?.expressaoorigem + ' > ' + e?.expressaodestino}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				
			
			</ol>
			
		</div>
	</body>
</html>
