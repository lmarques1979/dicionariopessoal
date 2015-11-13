package myspringsecurity    

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.web.authentication.AjaxAwareAuthenticationSuccessHandler
import grails.transaction.Transactional;

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.springframework.security.core.Authentication

import seguranca.Usuario

@Transactional
class MyAuthenticationSuccessHandler extends AjaxAwareAuthenticationSuccessHandler{

		
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication){

		def usuario =  Usuario.get(authentication.getPrincipal().id)
				
		if(usuario.username == 'admin'){
			redirectStrategy.sendRedirect(request, response, '/');
		}else{
			redirectStrategy.sendRedirect(request, response, '/expressoes/index');
		}
	}
}