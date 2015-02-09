<%@ page import="seguranca.Usuario" %>
<sec:ifLoggedIn>
	<g:set var="usuarioInstance" value="${Usuario.get(sec.loggedInUserInfo(field: 'id'))}" />
</sec:ifLoggedIn>

<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
  		<asset:stylesheet src="application.css"/>
		<asset:javascript src="application.js"/>
		<g:layoutHead/>
	</head>
	<body>
		<div class="header">
			<div class="titulo">
				<span><g:message code="header.label"/></span>
				<g:link id="${params.id}" action="${params.action ? params.action : 'index'}" controller="${params.controller ? params.controller : 'index'}" params="[lang: 'pt_BR']"><asset:image class="internacionalizacao" src="bandeiras/24/Brazil.png" title="${message(code:'portuguesbrasil.label')}"/></g:link>
				<g:link id="${params.id}" action="${params.action ? params.action : 'index'}" controller="${params.controller ? params.controller : 'index'}" params="[lang: 'en']"><asset:image class="internacionalizacao" src="bandeiras/24/britain.png" title="${message(code:'english.label')}"/></g:link>		
				
				<sec:ifLoggedIn>
					<g:link class="usuariologado" id="${usuarioInstance.id}" action="show" controller="Usuario">${usuarioInstance.buscaNome(usuarioInstance)} [${usuarioInstance.username}]</g:link>
				</sec:ifLoggedIn>
								
			</div>
			<div class="menu">
				<ul>
				<!--<li><span><g:message code="header.label"/></span></li>-->
				
				<sec:ifNotLoggedIn>
					
					<li><g:link class="cadastro" controller="Usuario" action="create"><g:message code="cadastrousuario.label"/></g:link></li>
					<li><g:link class="login" controller="login" action="auth"><g:message code="login.label"/></g:link></li>
				</sec:ifNotLoggedIn>
				<sec:ifLoggedIn>
				
					<g:if test="${sec.loggedInUserInfo(field: 'username') == 'admin'}">
						<li><g:link class="idioma" controller="Idioma" action="create"><g:message code="cadastroidioma.label"/></g:link></li>
					</g:if>
					<g:else>
						<li><g:link class="dicionario" controller="Dicionario" action="create"><g:message code="adddicionario.label"/></g:link></li>
						<li><g:link class="tipoexpressao" controller="TipoExpressao" action="create"><g:message code="addtipoexpressao.label"/></g:link></li>
						<li><g:link class="addexpressao" controller="Expressoes" action="create"><g:message code="addexpressao.label"/></g:link></li>
						<li><g:link class="expressao" controller="Expressoes" action="index"><g:message code="visualizaexpressoes.label"/></g:link></li>
					</g:else>
					<li><g:link class="logout" controller="logout" action="index"><g:message code="logout.label"/></g:link></li>
				</sec:ifLoggedIn>
				</ul>
			</div>
		</div>
		<g:layoutBody/>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
	</body>
</html>
