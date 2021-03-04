package teste1;

public class lixo {
	for(int i =0; i<avioes.length;i++) {
    	leia.nextLine();
    	System.out.print("Digite o fabricante da aeronave: ");
    	fabricante = leia.nextLine();
    	System.out.print("Digite o modelo da aeronave: ");
    	modelo = leia.nextLine();
    	System.out.print("Digite a cor da aeronave: ");
    	cor = leia.nextLine();
    	System.out.print("Digite a quantidade de lugares da aeronave: ");
    	lugares = leia.nextInt();
    	avioes[i]=new Aviao(fabricante, modelo, cor, lugares);
    	System.out.println("-----------------------------------------");
    }
    System.out.print("\nBD de Aeronaves\n");
    
    for(Aviao x:avioes) {
    	x.printInfo();
    }
    
    avioes[0].statusVoando();
    avioes[1].statusVoando();
    
    System.out.print("\nBD de Aeronaves\n");
    for(Aviao x:avioes) {
    	x.printInfo();
    }
    
}
}

}
}

}
