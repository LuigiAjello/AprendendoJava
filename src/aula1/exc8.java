package aula1;
import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

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
        
        scanner.close();
    }
}

