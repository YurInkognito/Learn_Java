package Aulas_Ronald.Lab02;
 import java.util.Scanner;

public class RefeicoesVoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: Quantidade de refeições disponíveis
        System.out.print("Quantidade de refeições disponíveis - Frango: ");
        int disponivelFrango = scanner.nextInt();
        System.out.print("Quantidade de refeições disponíveis - Bife: ");
        int disponivelBife = scanner.nextInt();
        System.out.print("Quantidade de refeições disponíveis - Massa: ");
        int disponivelMassa = scanner.nextInt();

        // Entrada: Quantidade de refeições pedidas pelos passageiros
        System.out.print("Quantidade de refeições pedidas - Frango: ");
        int pedidoFrango = scanner.nextInt();
        System.out.print("Quantidade de refeições pedidas - Bife: ");
        int pedidoBife = scanner.nextInt();
        System.out.print("Quantidade de refeições pedidas - Massa: ");
        int pedidoMassa = scanner.nextInt();

        // Cálculo de quantos passageiros não serão atendidos para cada refeição
        int faltamFrango = Math.max(pedidoFrango - disponivelFrango, 0);
        int faltamBife = Math.max(pedidoBife - disponivelBife, 0);
        int faltamMassa = Math.max(pedidoMassa - disponivelMassa, 0);

        // Total de passageiros não atendidos
        int totalNaoAtendidos = faltamFrango + faltamBife + faltamMassa;

        // Saída: Total de passageiros não atendidos
        System.out.println("Número total de passageiros que não poderão ser atendidos: " + totalNaoAtendidos);

        scanner.close();
    }
}