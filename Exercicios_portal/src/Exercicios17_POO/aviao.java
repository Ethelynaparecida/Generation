package Exercicios17_POO;

public class aviao {
	//criando os atributos do objeto
		private String dataVoo;
		private String numeroVoo;
		private String serieAeronave;
		
		public String getDataVoo() {
			return dataVoo;
		}
		public void setDataVoo(String dataVoo) {
			this.dataVoo = dataVoo;
		}
		public String getNumeroVoo() {
			return numeroVoo;
		}
		public void setNumeroVoo(String numeroVoo) {
			this.numeroVoo = numeroVoo;
		}
		public String getSerieAeronave() {
			return serieAeronave;
		}
		public void setSerieAeronave(String serieAeronave) {
			this.serieAeronave = serieAeronave;
		}
		
		public String getDadosVoo()
		{
			String dadosVoo = "Seu voo sai no dia"+dataVoo+" numero "+numeroVoo+" numero de serie da aeronave "+serieAeronave;
			return dadosVoo;
		}

		

}
