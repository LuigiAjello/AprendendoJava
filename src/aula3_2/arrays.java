package aula3_2;

public class arrays {
    int[] array = {10, 9, 4, 11, 3}; 
    int tamanho = 5;  
    
    public void maiorValor() {
        int maior = array[0];
        for (int i = 1; i < tamanho; i++) { 
            if (array[i] > maior) {
                maior = array[i]; 
            }
        }
        System.out.println("Maior valor: " + maior);
    }

    public void menorValor() {
        int menor = array[0];
        for (int i = 1; i < tamanho; i++) { 
            if (array[i] < menor) {
                menor = array[i]; 
            }
        }
        System.out.println("Menor valor: " + menor);
    }

}