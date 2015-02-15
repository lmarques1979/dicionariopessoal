package dicionariopessoal

import java.util.Date;

import seguranca.Usuario;

class Expressoes {

	String expressaoorigem
	String expressaodestino
	Date dateCreated
	Date lastUpdated
	
	static hasOne 		= [tipoexpressao:TipoExpressao]
	static belongsTo 	= [dicionariousuario:DicionarioUsuario] 
	
	static constraints = {
		expressaoorigem(nullable:false,blank:false)
		expressaodestino(nullable:false,blank:false)
		tipoexpressao(nullable:true)
	}
	
	static mapping = {
		sort expressaoorigem: "asc" // or "asc"
		autoTimestamp true
	}
}
