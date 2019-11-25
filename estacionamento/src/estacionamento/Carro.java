package estacionamento;

public class Carro extends Veiculo{
	private String tipoCarro;
	
	public Carro(int id, String modelo, String marca, String placa, String tipo, String cor, Double preco,
			String tipoCarro) {
	super(id, modelo, marca, placa, tipo, cor, preco);
	this.tipoCarro = tipoCarro;
}
	
	public Carro() {
	}

	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, String tipoCarro){
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
