package ExcExtraInterface;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(double sacar, double saldo, int conta, int agencia, String nome) {
		super(sacar, saldo, conta, agencia, nome);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double calculaTributos() {
		this.saldo = this.saldo-(this.saldo*(1/100));
		return 0;
	}
	
	

}
