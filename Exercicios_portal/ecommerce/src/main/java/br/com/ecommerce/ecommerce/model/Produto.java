package br.com.ecommerce.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Float valor;
	
	private String urlImagem;
	
	
	@OneToMany(mappedBy = "produtoemloja", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"produtoemloja", "descricao"})
	private List<Loja> lojanoproduto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Loja produtonaloja;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	
	
	public List<Loja> getLojanoproduto() {
		return lojanoproduto;
	}

	public void setLojanoproduto(List<Loja> lojanoproduto) {
		this.lojanoproduto = lojanoproduto;
	}

	public Loja getProdutonaloja() {
		return produtonaloja;
	}

	public void setProdutonaloja(Loja produtonaloja) {
		this.produtonaloja = produtonaloja;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	
}
