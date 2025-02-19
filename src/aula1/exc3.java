package aula1;

public class exc3 {
 public static void main(String args[]) {
	 double galoes; // Declara uma variável//
     double litros; // Declara outra variável
     double counter; // Declara outra variável
	 	counter = 0 ;
		galoes = 1;
		for (galoes = 1; galoes <= 10 ; galoes++ ) {
			
			litros = galoes * 3.7854;
			counter ++ ;
			 System.out.println(counter + " galões são "  + litros + " litros: " );
			 
		}
	
	 }
}
