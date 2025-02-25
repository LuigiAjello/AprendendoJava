package aula1;

import java.io.IOException;

public class exc5 {
    public static void main(String args[]) 
        throws IOException {
   
        char resposta_usuario;
        char resposta_correta = 'l'; 
        while (true) {
            System.out.print("Digite uma letra: ");
            resposta_usuario = (char) System.in.read();
            System.in.read(); 
            if (resposta_usuario != resposta_correta) {
                System.out.println("Resposta incorreta!");
                
            } else {
                System.out.println("Resposta correta!");
                break;
            }
        }
    }
}

