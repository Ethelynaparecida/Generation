package exercicio18extra;

import java.text.NumberFormat;

public class Administrador extends Pessoa{
	
	private float ajudaDeCusto;
	
	public Administrador(String nome, String sobrenome, float ajudaDeCusto)
	{
		super(nome, sobrenome);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//metodo para formatar valor em moeda de acordo com o sistema operacional
	
	public String formatarAjuda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(ajudaDeCusto);
		return formatoMoeda;
	}

}

