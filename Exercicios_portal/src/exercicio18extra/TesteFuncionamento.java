package exercicio18extra;

import java.util.Scanner;

public class TesteFuncionamento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int op = 0;
		
		System.out.println("Escolha uma opção:\n1-Fornecedor\n2-Empregado\n3-Administrador");
		op = leia.nextInt();
		while(op<1 || op>3) {
			System.out.println("valor incorreto");
			System.out.println("Escolha uma opção:\n1-Fornecedor\n2-Empregado\n3-Administrador");
			op = leia.nextInt();
		}
		switch(op) {
		case 1:
			Fornecedor for1 = new Fornecedor(null, null,0,0);
			System.out.println("Digite o nome");
			for1.setNome(leia.next());
			System.out.println("Digite o sobrenome");
			for1.setSobrenome(leia.next());
			System.out.println("Digite o valor de credito");
			for1.setValorCredito(leia.nextFloat());
			System.out.println("Digite o debito");
			for1.setValorDivida(leia.nextFloat());
			
			System.out.println("Fornecedor: "+for1.getNome()+" "+for1.getSobrenome() +" saldo de "+for1.getSaldo());
			break;
		case 2:
			Empregado emp1 = new Empregado(null, null,0,0);
			System.out.println("Digite o nome");
			emp1.setNome(leia.next());
			System.out.println("Digite o sobrenome");
			emp1.setSobrenome(leia.next());
			System.out.println("Digite o valor do salario base:");
			emp1.setSalarioBase(leia.nextFloat());
			System.out.println("Digite o codigo do setor");
			emp1.setCodigoSetor(leia.nextInt());
			emp1.setImposto(25/100f);
			
			
			System.out.println("\n\nEmpregado "+ emp1.getNome()+ "" +emp1.getSobrenome()+ " do setor "+  emp1.getCodigoSetor());
			System.out.println("Antigo salario "+emp1.getSalarioBase()+"salario novo "+emp1.calculoSalario());
			break;
		
		}
		
	}

}
