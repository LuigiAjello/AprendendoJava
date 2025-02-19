package aula1;

public class exc1 { // Nome da classe com inicial maiúscula (boas práticas)
    public static void main(String args[]) {
        
        int var1; // Declara uma variável
        int var2; // Declara outra variável
        var1 = 1024; // Atribui 1024 a var1
        System.out.println("var1 contém " + var1); 
        
        var2 = var1 / 2; // Corrigido: falta de ponto e vírgula
        
        System.out.print("var2 contém var1/2: "); 
        System.out.println(var2); // Corrigido: falta de ponto e vírgula
    }
}
