package ExcExtraInterface;

public class TesteConta {

	public static void main(String[] args) {
		Conta  p = new Conta(0, 0, 0, 0, null);
		p.setSaldo(200);
		
		p.setSacar(100);
		System.out.println("saldo"+p.getSaldo());
		p.setDepositar(50);
		System.out.println("saldo"+p.getSaldo());
		
		
		
		
	}

}
