package Aulas_Mitre.Loteria;

public class Principal01 {
    public static void main(String[] args) {
        Loteria loteria = new Loteria();

        // Criando participantes
        Pessoa p1 = new Pessoa("Ana", 5);
        Pessoa p2 = new Pessoa("Carlos", 12);
        Pessoa p3 = new Pessoa("Beatriz", 7);

        // Adicionando à loteria
        loteria.adicionarParticipante(p1);
        loteria.adicionarParticipante(p2);
        loteria.adicionarParticipante(p3);

        // Sorteando número até 20
        loteria.sortearNumero(20);

        // Verificando vencedor
        loteria.verificarGanhador();
    }
}
