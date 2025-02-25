import java.util.Scanner;

public class exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner;

        System.out.print("Digite o segundo número: ");
        double num2 = scanner;

        System.out.print("Escolha a operação (soma, subtração, multiplicação, divisão): ");
        String operacao = scanner;

        double resultado;

        switch (operacao) {
            case "soma":
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;

            case "subtração":
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case "multiplicação":
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case "divisão":
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