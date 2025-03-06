package aula2;


class Veiculo{

	   int numero_passageiro_possiveis ;
	   int capacidade_armazenamento_de_combustivel ;
	   int consumo_medio_de_combustivel;
}



class VeiculoDemo {
	
	public static void main(String[]args) {
		 Veiculo minivan = new Veiculo();
		 int autonomia_carro ;
		 
		 minivan.numero_passageiro_possiveis = 8;
		 minivan.capacidade_armazenamento_de_combustivel = 50;
		 minivan.consumo_medio_de_combustivel = 18;
		 
		 autonomia_carro = (minivan.capacidade_armazenamento_de_combustivel * minivan.consumo_medio_de_combustivel);
		 System.out.println(autonomia_carro);
	}
	
	
}
