package VARelacClasses;

public class Livro implements Publicacao{
	private String titulo, autor;
	private int totalPag, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	public Livro(String titulo, String autor, Pessoa leitor, int totalPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.leitor = leitor;
		this.totalPag = totalPag;
		this.aberto=false;
		this.pagAtual=0;
		
	}
	
	
	
	/*public void detalhes()
	{
		
	}*/
	
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", \nautor=" + autor + ", \ntotalPag=" + totalPag 
				+ ", \npagAtual=" + pagAtual
				+ ", \naberto=" + aberto + ", \nleitor=" + leitor.getNome() + "]";
	}



	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	public int getTotalPag() {
		return totalPag;
	}
	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}



	@Override
	public void abrir() {
		this.aberto=true;
		
	}



	@Override
	public void fechar() {
		this.aberto=false;
	}



	@Override
	public void folhear(int p) {
		if(p>this.totalPag)
		{
			System.out.println("numero de paginas excedido");
		}
		this.pagAtual=p;
        //ele vai receber uma pagina ateatoria
		
	}



	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}



	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}
	
	

}
