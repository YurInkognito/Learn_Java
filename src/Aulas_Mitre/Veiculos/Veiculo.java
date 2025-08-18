package Aulas_Mitre.Veiculos;

public class Veiculo {
	private String chassi;
	private String modelo;
	private int ano;
	private int tam_tanque;	

	protected Veiculo(String modelo, int ano){
		this.modelo = modelo;
        this.ano = ano;

        //System.out.println("Fabricar veículo");
	}

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
	
	protected void imprimir_dados(){

        System.out.println("Modelo: "+modelo+"| Ano: "+ano+"| Chassi: "+chassi);
	}
}
