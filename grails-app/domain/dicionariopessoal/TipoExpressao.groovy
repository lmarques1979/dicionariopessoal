package dicionariopessoal

import java.util.Date;

import seguranca.Usuario;

class TipoExpressao {

	String descricao
	Date dateCreated
	Date lastUpdated
	Usuario usuario
	
	static hasMany=[expressoes: Expressoes]
	static belongsTo = [usuario:Usuario]
	
	static constraints = {
		descricao(nullable:false,blank:false)
		usuario(nullable:false,blank:false)
	}
	
	static mapping = {
		sort descricao: "asc" // or "asc"
		autoTimestamp true
	}
	
	static def tipoExpressaoUsuario(def usuariologado){
		
		def resultado = TipoExpressao.createCriteria().list () {
			eq("usuario",usuariologado)
			order("descricao", "asc")
		}
		return resultado
	}
}
