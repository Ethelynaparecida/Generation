package br.com.shopGame.shopGame.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_compras")
public class Compras {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JsonIgnoreProperties("compra")
	private Usuario usuario;
	
	@ManyToOne
	@JsonIgnoreProperties("compra")
	private Produto produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuarios() {
		return usuario;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuario = usuarios;
	}

	public Produto getProdutos() {
		return produto;
	}

	public void setProdutos(Produto produtos) {
		this.produto = produtos;
	}

	
	
}
