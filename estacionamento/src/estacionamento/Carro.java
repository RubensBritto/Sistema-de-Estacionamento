package estacionamento;

public class Carro extends Veiculo{
	private String tipoCarro;
<<<<<<< HEAD
	
	public Carro(int id, String modelo, String marca, String placa, String tipo, String cor, Double preco,
			String tipoCarro) {
	super(id, modelo, marca, placa, tipo, cor, preco);
	this.tipoCarro = tipoCarro;
}
	
	public Carro() {
	}

=======
		
>>>>>>> 68c9b5fa64813f773b23afa8c5074c1532e903a6
	//Override
	public void Veiculo(int id, String modelo,  String marca, String placa, String tipo, String cor, Double preco, Date dataVeiculo,String tipoCarro){
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

	public Carro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

}
