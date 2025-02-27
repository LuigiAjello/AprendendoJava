package aula1;
import java.util.Scanner;

public class exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (soma, subtracao, multiplicacao, divisao): ");
        String operacao = scanner.next().toLowerCase(); // Converte para minúsculas para evitar erro na comparação

        double resultado;

        switch (operacao) {
            case "soma":
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;

            case "subtracao":
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case "multiplicacao":
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case "divisao":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}
