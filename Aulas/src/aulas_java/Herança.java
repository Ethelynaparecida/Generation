package aulas_java;

public class Herança {
	package Turma17;

	public class Professor {
		private int matricula;
		private String nome;
		
		public Professor(int matricula,String nome)
		{
			this.matricula = matricula;
			this.nome = nome;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public float getSalario()
		{
			return 0;
		}
	}


	package Turma17;

	public class ProfessorDE extends Professor {
		private float salario;
		
		
		public ProfessorDE(int matricula,String nome)
		{
			super(matricula,nome);
		}
		
		public ProfessorDE(int matricula,String nome,float salario)
		{
			super(matricula,nome);
			this.salario = salario;
		}

		public float getSalario() {
			return salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}
		
		
	}




	package Turma17;

	public class ProfessorHorista extends Professor {
		private float valorHora;
		private float numeroHoras;
		
		public ProfessorHorista(int matricula,String nome)
		{
			super(matricula,nome);
		}
		
		public ProfessorHorista(int matricula,String nome,float valorHora,float numeroHoras)
		{
			super(matricula,nome);
			this.valorHora = valorHora;
			this.numeroHoras = numeroHoras;
		}

		public float getValorHora() {
			return valorHora;
		}

		public void setValorHora(float valorHora) {
			this.valorHora = valorHora;
		}

		public float getNumeroHoras() {
			return numeroHoras;
		}

		public void setNumeroHoras(float numeroHoras) {
			this.numeroHoras = numeroHoras;
		}
		
		public float getSalario()
		{
			return this.valorHora * this.numeroHoras;
		}
	}



	package Turma17;

	public class ProfessorBolsista extends Professor {
		private float valorBolsa;
		
		public ProfessorBolsista(int matricula,String nome)
		{
			super(matricula,nome);
		}
		
		public ProfessorBolsista(int matricula,String nome,float valorBolsa)
		{
			super(matricula,nome);
			this.valorBolsa = valorBolsa;
			
		}

		public float getValorBolsa() {
			return valorBolsa;
		}

		public void setValorBolsa(float valorBolsa) {
			this.valorBolsa = valorBolsa;
		}
		
		public float getSalario()
		{
			return this.getValorBolsa();
		}
	}



	package Turma17;

	public class TesteProfessor {
		public static void main(String[] args)
		{
			ProfessorDE prof1 = new ProfessorDE(0, null, 0);
			ProfessorHorista prof2 = new ProfessorHorista(0, null,0,0);
			ProfessorBolsista prof3 = new ProfessorBolsista(0, null,0);
			prof1.setMatricula(1);
			prof1.setNome("Maria");
			prof1.setSalario(3000);
			
			prof2.setMatricula(2);
			prof2.setNome("José");
			prof2.setValorHora(50);
			prof2.setNumeroHoras(20);
			
			prof3.setMatricula(3);
			prof3.setNome("Paula");
			prof3.setValorBolsa(1000);
			
			System.out.println("\nSalario Prof 1 = "+prof1.getSalario());
			System.out.println("Salario Prof 2 = "+prof2.getSalario());
			System.out.println("Salario Prof 3 = "+prof3.getSalario());
			
		}
	}

}
