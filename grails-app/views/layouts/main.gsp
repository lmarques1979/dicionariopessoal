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
			<div class="menu">
				<ul>
				<li><span><g:message code="header.label"/></span></li>
				
				<sec:ifNotLoggedIn>
					
					<li><g:link class="cadastro" controller="Usuario" action="create"><g:message code="cadastrousuario.label"/></g:link></li>
					<li><g:link class="login" controller="login" action="auth"><g:message code="login.label"/></g:link></li>
				</sec:ifNotLoggedIn>
				<sec:ifLoggedIn>
				
					<li><g:link class="usuario" controller="Usuario" action="show" id="${sec.loggedInUserInfo(field:"id")}"><g:message code="dadosusuario.label"/></g:link></li>
						
					<g:if test="${sec.loggedInUserInfo(field: 'username') == 'admin'}">
						<li><g:link class="cadastroidioma" controller="Idioma" action="create"><g:message code="cadastroidioma.label"/></g:link></li>
					</g:if>
					<g:else>
						<li><g:link class="cadastrodicionario" controller="Dicionario" action="create"><g:message code="cadastrodicionario.label"/></g:link></li>
						<li><g:link class="createexpressoes" controller="Expressoes" action="create"><g:message code="visualizaexpressoes.label"/></g:link></li>
						<li><g:link class="dicionariosusuario" controller="DicionarioUsuario" action="index"><g:message code="dicionariosusuarios.label"/></g:link></li>
					</g:else>
					<li><g:link class="login" controller="logout" action="index"><g:message code="logout.label"/></g:link></li>
				</sec:ifLoggedIn>
				</ul>
			</div>
		</div>
		<g:layoutBody/>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
	</body>
</html>
