package estacionamento;


public abstract class Veiculo {

	private int id;
	private String modelo;
	private String marca;
	private String placa;
	private String tipo;
	private String cor;
	private Double preco;
			
	public Veiculo (int id, String modelo, String marca, String placa, String tipo, String cor, Double preco) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.tipo = tipo;
		this.cor = cor;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int valoresestacionamento() {
		return 0;
		// metodo faz polimofismo de overeding, onde cada tipo de veiculo vai possuir
		// um valor no estacionamento;
	}

}
