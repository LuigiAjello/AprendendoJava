package aula1;

import java.io.IOException;

public class exc6 {
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
     
                if (resposta_usuario < resposta_correta)  System.out.print("a letra certa é depois que " + resposta_usuario + "  " );
                
                if(resposta_usuario > resposta_correta) System.out.print("a letra certa é antes que  " + resposta_usuario + "  ");
                
            } else {
            	
                System.out.println("Resposta correta!" + resposta_correta);
                break;
            }
        }
    }
}