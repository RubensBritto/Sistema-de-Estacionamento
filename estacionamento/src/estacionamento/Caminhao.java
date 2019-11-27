package estacionamento;

public class Caminhao extends Veiculo {
	
	private Double carga;
	
	public Caminhao(int id, String modelo, String marca, String placa, String tipo, String cor, Double preco,
			String dataVeiculo, Double carga) {
		super(id, modelo, marca, placa, tipo, cor, preco, dataVeiculo);
		this.carga = carga;
	}
	public Caminhao(){		
	}

	public int valoresestacionamento(){
		return 0;
	}

	public Double getCarga() {
		return carga;
	}

	public void setCarga(Double carga) {
		this.carga = carga;
	}

}
