package dicionariopessoal

import java.util.Date;

import seguranca.Usuario;

class Expressoes {

	String expressaoorigem
	String expressaodestino
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [dicionariousuario:DicionarioUsuario]
	
	static constraints = {
		expressaoorigem(nullable:false,blank:false)
		expressaodestino(nullable:false,blank:false)
	}
	
	static mapping = {
		autoTimestamp true
	}
}
