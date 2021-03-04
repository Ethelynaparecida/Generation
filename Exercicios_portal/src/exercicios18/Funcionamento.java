package exercicios18;

public class Funcionamento {

	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro();
		dog1.emitirSom();
		dog1.nome();
		dog1.setStatus(true);
		dog1.comendoCachorro();

		
		Cavalo pocoto1 = new Cavalo();
		pocoto1.emitirSom();
		pocoto1.comendoCavalo();
		pocoto1.setStatus(true);
		pocoto1.comendoCavalo();
		
		Preguica sono = new Preguica();
		sono.sobeArvore();
		sono.setStatus(true);
		sono.sobeArvore();
		
	}

}
