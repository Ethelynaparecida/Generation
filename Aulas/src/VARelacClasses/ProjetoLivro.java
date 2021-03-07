package VARelacClasses;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		
		Livro[] l = new Livro[2];
		
		p[0] = new Pessoa("Rosalina", "Mulher", 69);
		p[1] = new Pessoa("Ethy", "mulher", 26);
		
		l[0] = new Livro("outlander", "diana galbandor", p[0], 500 );
		
		l[0].abrir();
		System.out.println(l[0].detalhes());
		
	}

}
