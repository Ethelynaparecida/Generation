package org.generation.blogPessoal.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name= "usuario")
public class Usuario {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private long idUsuario; 

		 

		@NotNull
		@Size(min = 5, max = 60) 
		private String nome;  

		 

		@NotNull 
		@Size(min = 10, max = 60) 
		private String sobrenome;



		public long getId() {
			return idUsuario;
		}



		public void setId(long id) {
			this.idUsuario = id;
		}



		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public String getSobrenome() {
			return sobrenome;
		}



		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		} 

		 
	
	
}
