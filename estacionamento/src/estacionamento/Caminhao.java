package estacionamento;

public class Caminhao extends Veiculo {
	
	private Double carga;
			
	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, Date dataVeiculo,Double carga){
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

	public Caminhao(Double carga) {
		this.carga = carga;
	}
}
