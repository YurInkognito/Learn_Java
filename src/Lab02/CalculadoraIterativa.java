package Lab02;

import java.util.Scanner;

public class CalculadoraIterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacao;

        do {
            // Exibindo o menu de operações
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("S. Sair");
            System.out.print("Digite sua escolha: ");
            operacao = scanner.next().charAt(0);

            if (operacao == 's' || operacao == 'S') {
                System.out.println("Saindo da calculadora.");
                break;
            }

            double num1, num2, resultado;

            // Solicitando os números ao usuário
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            // Executando a operação escolhida
            switch (operacao) {
                case '1':
                case '+':
                    resultado = num1 + num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case '2':
                case '-':
                    resultado = num1 - num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case '3':
                case '*':
                    resultado = num1 * num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case '4':
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("Resultado: %.2f\n", resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            System.out.println();

        } while (true);

        // Fechando o scanner
        scanner.close();
    }
}