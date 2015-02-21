package dicionariopessoal

import java.util.Date;

import seguranca.Usuario;

class Idioma {

	String nome
	String imagem
	Date dateCreated
	Date lastUpdated
	
	static constraints = {
		nome(nullable:false,blank:false)
		imagem(nullable:true,blank:true)
    }
	
	static mapping = {
		sort nome: "asc" // or "asc"
		autoTimestamp true
	}
}
