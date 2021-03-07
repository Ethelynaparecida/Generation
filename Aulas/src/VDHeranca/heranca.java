package VDHeranca;

public class heranca {

	public static void main(String[] args) {
		//Não posso instanciar a classe mãe pois ela é abstrata
		//Pessoa p1 = new Pessoa ();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		AlunoBolsista p4 = new AlunoBolsista();
		
		 
		
		System.out.println(p2.toString());
		p2.setIdade(1);
		p2.fazerAni();
		System.out.println(p2.toString());
		System.out.println(p4.toString());
		

	}

}
