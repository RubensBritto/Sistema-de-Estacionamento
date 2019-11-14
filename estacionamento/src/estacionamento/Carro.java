package estacionamento;

public class Carro extends Veiculo{
	private String tipoCarro;
	
	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, String tipoCarro){
		this.tipoCarro = tipoCarro;
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
