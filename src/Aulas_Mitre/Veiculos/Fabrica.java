package Aulas_Mitre.Veiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private List<Carro> carros = new ArrayList<>();
    private List<Moto> motos = new ArrayList<>();
    private double saldo;
    private ControleChassi controleChassi;

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
            System.out.println("Carro fabricado: " + modelo + " | Chassi: " + chassi);
        } else {
            System.out.println("Saldo insuficiente para fabricar carro.");
        }
    }

    public void fabricarMoto(String modelo, int ano, int cilindradas, double custo) {
        if (saldo >= custo) {
            String chassi = controleChassi.gerarNovoChassi();
            Moto moto = new Moto(modelo, ano, cilindradas);
            moto.setChassi(chassi);
            motos.add(moto);
            saldo -= custo;
            System.out.println("Moto fabricada: " + modelo + " | Chassi: " + chassi);
        } else {
            System.out.println("Saldo insuficiente para fabricar moto.");
        }
    }

    public void imprimirContabilidade() {
        System.out.println("\n===== CONTABILIDADE =====");
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Carros fabricados:");
        for (Carro c : carros) c.imprimir_dados();
        System.out.println("Motos fabricadas:");
        for (Moto m : motos) m.imprimir_dados();
    }
}

