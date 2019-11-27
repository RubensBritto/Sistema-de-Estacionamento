package estacionamento;
import java.util.Date;
import java.util.Scanner;

public class Carro extends Veiculo{
	public Scanner input; 
	private String tipoCarro;

	
	public Carro(int id, String modelo, String marca, String placa, String tipo, String cor, Double preco,
			String dataVeiculo, String tipoCarro) {
		super(id, modelo, marca, placa, tipo, cor, preco, dataVeiculo);
		this.tipoCarro = tipoCarro;
	}

	public Carro(){
		input = new Scanner(System.in);
	}


	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, String dataVeiculo,String tipoCarro){
	}
	
	public String getTipoCarro() {
		return tipoCarro;
	}
	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	
	public int valoresestacionamento(){
		return 0;
	}
}
