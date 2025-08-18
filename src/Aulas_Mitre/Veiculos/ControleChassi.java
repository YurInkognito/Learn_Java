package Aulas_Mitre.Veiculos;

public class ControleChassi {
    private int contador = 0;

    public String gerarNovoChassi() {
        contador++;
        return String.format("ABC%05d", contador);
    }
}
