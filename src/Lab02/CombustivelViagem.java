package Lab02;
import java.util.Scanner;

public class CombustivelViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double CONSUMO = 12.0; // km/L

        System.out.print("Digite o tempo da viagem (em horas): ");
        double tempo = scanner.nextDouble();
        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;

        double litrosGastos = distancia / CONSUMO;

        System.out.printf("Quantidade de litros de combustível gastos: %.3f\n", litrosGastos);

        scanner.close();
    }
}