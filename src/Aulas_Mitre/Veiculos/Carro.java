package Aulas_Mitre.Veiculos;

public class Carro extends Veiculo {
	private int num_portas;

	public Carro(String modelo, int ano, int num_portas) {
		super(modelo, ano);
		this.num_portas = num_portas;
	}

	@Override
	protected void imprimir_dados() {
		super.imprimir_dados();
		System.out.println("Portas: " + num_portas);
	}
}
