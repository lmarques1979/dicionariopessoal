<%@ page import="dicionariopessoal.Expressoes" %>
<g:if test="${params.filtrodicionario}">
	<g:set var="filtro" value="${params.int('filtrodicionario')}" />
</g:if>
<g:else>
	<g:set var="filtro" value="-1" />
</g:else>
<g:if test="${expressoesInstanceCount>0}">
	<g:set var="linguaorigem" value="${expressoesInstanceList[0].dicionariousuario.dicionario.origem.nome }" />
	<g:set var="linguadestino" value="${expressoesInstanceList[0].dicionariousuario.dicionario.destino.nome}" />
</g:if>
<%@ page import="seguranca.Usuario" %>
<sec:ifLoggedIn>
	<g:set var="usuarioInstance" value="${Usuario.get(sec.loggedInUserInfo(field: 'id'))}" />
</sec:ifLoggedIn>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'expressoes.label', default: 'Expressoes')}" />
		<title><g:message code="expressoes.list.label"/></title>
	</head>
	<body>
	
		<a href="#list-expressoes" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="list-expressoes" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<table>
				
				<g:form url="[resource:expressoesInstance, action:'index']" >
					<thead>
						<tr>
							<th colspan="2">${message(code: "dicionario.label")}</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							
							<td>
								<g:select onchange="this.form.submit()" noSelection="${['-1': message(code:'selecionardicionario.label')]}" value="${filtro}" optionValue="${{it.dicionario.nome + ' - ' + it.dicionario.origem.nome + ' > ' + it.dicionario.destino.nome}}" name="filtrodicionario" from="${dicionariopessoal.DicionarioUsuario.dicionariosUsuario(usuarioInstance)}" optionKey="id"/>
							</td>
						</tr>
					</tbody>
					<g:submitButton class="invisivel" name="create" value="Filtrar" />
				</g:form> 
			</table>
	
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="expressaoorigem" title="${message(code: 'expressoes.expressaoorigem.label', default: 'Expressaoorigem') + (linguaorigem ? ' - ' + linguaorigem : '') }" />
					
						<g:sortableColumn property="expressaodestino" title="${message(code: 'expressoes.expressaodestino.label', default: 'Expressaodestino') + (linguadestino ? ' - ' + linguadestino : '')}" />
					
						
					</tr>
				</thead>
				<tbody>
				<g:each in="${expressoesInstanceList}" status="i" var="expressoesInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${expressoesInstance.id}">${fieldValue(bean: expressoesInstance, field: "expressaoorigem")}</g:link></td>
					
						<td>${fieldValue(bean: expressoesInstance, field: "expressaodestino")}</td>
					
						
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${expressoesInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
