package dicionariopessoal

import java.util.Date;
import seguranca.Usuario;

class DicionarioUsuario {
	
	
	Usuario usuario
	Dicionario dicionario
	Date dateCreated
	Date lastUpdated

	static hasMany=[expressoes: Expressoes]
	
    static constraints = {
		usuario(unique: ['dicionario'])
		dicionario(nullable: false , blank: false)
    }
	
	static mapping = {
		expressoes cascade: 'all-delete-orphan'
		version false
		autoTimestamp true
	}
	
	static def dicionariosUsuario(def usuariologado){
		
		def resultado = DicionarioUsuario.createCriteria().list () {
			eq("usuario",usuariologado)
		}
		return resultado 
	}
}
