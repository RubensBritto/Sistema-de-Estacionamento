package estacionamento;

public class Moto extends Veiculo {
	
	private double cilindrada;
	
	public Moto() {
	}

	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, Date dataVeiculo ,Double cilindrada){
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

	public Moto(double cilindrada) {
		this.cilindrada = cilindrada;
	}

}
