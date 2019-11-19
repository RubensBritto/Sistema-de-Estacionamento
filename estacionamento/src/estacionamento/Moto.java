package estacionamento;

public class Moto extends Veiculo {
	
	private double cilindrada;

	public Moto(int id, String modelo, String marca, String placa, String tipo, String cor, Double preco,
			double cilindrada) {
		super(id, modelo, marca, placa, tipo, cor, preco);
		this.cilindrada = cilindrada;
	}
	
	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, Double cilindrada){
	}
	
	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int valoresestacionamento(){
		return 0;
	}

}
