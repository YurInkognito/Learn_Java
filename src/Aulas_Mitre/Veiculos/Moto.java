package Aulas_Mitre.Veiculos;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}

	@Override
	protected void imprimir_dados() {
		super.imprimir_dados();
		System.out.println("Cilindradas: " + cilindradas);
	}
}
