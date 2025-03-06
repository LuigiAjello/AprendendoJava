package aula3;
import java.util.Scanner;

public class HelpClassDemo {
    private double num1;
    private double num2;
    private char operacao;

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        scanner.close(); 

   
        if (isValid()) {
            HelpOn(); 
        }
    }

    
    
    
    public boolean isValid() {
        
        if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
            System.out.println("Operação inválida.");
            return false;
        }

        
        if (operacao == '/' && num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return false;
        }

        return true; 
    }

    
    
    
    public void HelpOn() {
        double resultado = 0;  

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}




