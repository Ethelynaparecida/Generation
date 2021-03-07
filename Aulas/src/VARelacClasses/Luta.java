package VARelacClasses;

import java.util.Random;

public class Luta {
	private Lutador desafiante, desafiado;
	int round;
	boolean aprovada;
	
	public void Luta()
	{
		this.desafiado=desafiado;
		this.desafiante=desafiante;
		this.aprovada=aprovada;
		
	}
	public void marcarLuta(Lutador l1, Lutador l2)
	{
		//equal faz a mesma função do ==, mas como o d=gtCat é uma string
		if(l1.getCategoria().equals(l2.getCategoria())
				&& l1!=l2) {
			this.aprovada=true;
			this.desafiado=l1;
			this.desafiante=l2;
		}else {
			this.aprovada=false;
			this.desafiado=null;
			this.desafiante=null;
		}
	}
	public void lutar()
	{
		if (this.aprovada)
		{
			System.out.println("---DESAFIADO---");
			desafiante.apresentar();
			System.out.println("\n---DESAFIANTE---");
			desafiado.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			System.out.println("----Resultados----");
			switch(vencedor)
			{
			case 0:
				System.out.println("\nEmpatou");
				this.desafiado.empartarLutas();
				this.desafiante.empartarLutas();
			break;
			case 1:
				System.out.println("\nVencedor "+this.desafiado.getNome());
				this.desafiado.ganharLutar();
				System.out.println("\nperdedor "+this.desafiante.getNome());
				this.desafiante.perderLuta();
			case 2:
				System.out.println("\nVencedor "+this.desafiante.getNome());
				this.desafiante.ganharLutar();
				System.out.println("\nperdedor "+this.desafiado.getNome());
				this.desafiado.perderLuta();
			break;
			}
		}else{
			System.out.print("\nA luta não pode acontecer");
		}
		
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	

}
