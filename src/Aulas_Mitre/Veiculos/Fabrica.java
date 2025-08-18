package Aulas_Mitre.Veiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private final List<Carro> carros = new ArrayList<>();
    private final List<Moto> motos = new ArrayList<>();
    private double saldo;
    private final ControleChassi controleChassi;

    public Fabrica(double saldoInicial) {
        this.saldo = saldoInicial;
        this.controleChassi = new ControleChassi();
    }

    public void fabricarCarro(String modelo, int ano, int portas, double custo) {
        if (saldo >= custo) {
            String chassi = controleChassi.gerarNovoChassi();
            Carro carro = new Carro(modelo, ano, portas);
            carro.setChassi(chassi);
            carros.add(carro);
            saldo -= custo;
            System.out.println("✅ Carro fabricado: " + modelo + " | Chassi: " + chassi);
        } else {
            System.out.println("❌ Saldo insuficiente para fabricar carro.");
        }
    }

    public void fabricarMoto(String modelo, int ano, int cilindradas, double custo) {
        if (saldo >= custo) {
            String chassi = controleChassi.gerarNovoChassi();
            Moto moto = new Moto(modelo, ano, cilindradas);
            moto.setChassi(chassi);
            motos.add(moto);
            saldo -= custo;
            System.out.println("✅ Moto fabricada: " + modelo + " | Chassi: " + chassi);
        } else {
            System.out.println("❌ Saldo insuficiente para fabricar moto.");
        }
    }

    public void imprimirContabilidade() {
        System.out.println("\n===== CONTABILIDADE =====");
        System.out.println("Saldo: R$ " + saldo);

        System.out.println("\n--- Carros fabricados ---");
        if (carros.isEmpty()) System.out.println("Nenhum carro fabricado.");
        for (Carro c : carros) c.imprimir_dados();

        System.out.println("\n--- Motos fabricadas ---");
        if (motos.isEmpty()) System.out.println("Nenhuma moto fabricada.");
        for (Moto m : motos) m.imprimir_dados();
    }
}
