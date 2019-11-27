package estacionamento;
import java.util.Date;

public class Moto extends Veiculo {
	
	private double cilindrada;
	
	public Moto(int id, String modelo, String marca, String placa, String tipo, String cor, Double preco,
			String dataVeiculo, double cilindrada) {
		super(id, modelo, marca, placa, tipo, cor, preco, dataVeiculo);
		this.cilindrada = cilindrada;
	}
	public Moto(){
		
	}
	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, String dataVeiculo ,Double cilindrada){
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
