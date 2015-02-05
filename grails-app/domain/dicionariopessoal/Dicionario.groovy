package dicionariopessoal

import java.util.Date;

import seguranca.Usuario;

class Dicionario {

	String nome
	Idioma origem
	Idioma destino
	Date dateCreated
	Date lastUpdated
	
	static hasMany = [dicionariousuario: DicionarioUsuario]
		
	static constraints = {
		nome(nullable:false,blank:false)
		origem(nullable:false,blank:false)
		destino(nullable:false,blank:false)
		
    }
	static mapping = {
		dicionariousuario cascade: 'all-delete-orphan'
		autoTimestamp true
	}
}
