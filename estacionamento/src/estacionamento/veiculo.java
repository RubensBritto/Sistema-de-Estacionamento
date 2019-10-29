package estacionamento;

public class veiculo {
	
	private int id;
	private String tipo;
	private String modelo;
	private String marca;
	private String cor;
	private String placa;
	private int preco;
		
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int valoresestacionamento(){
		return 0;
		//metodo faz polimofismo de overeding, onde cada tipo de veiculo vai possuir
		// um valor no estacionamento;
	}
	
	

}
