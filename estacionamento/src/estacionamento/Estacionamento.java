package estacionamento;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento{
    private boolean[] idsVeiculos;
	private static final int maxQt = 1000;
    private ArrayList<Veiculo> veiculos;
    private int[] quantidades;
    private Double preco;
    //ver o array quantidade
    public void Estacionamento(){
        this.veiculos = new ArrayList<Veiculo>();
        this.idsVeiculos = new boolean[maxQt];
        this.quantidades = new int[maxQt];
    }

    public void addVeiculos(Veiculo veiculos, int quatidades){
        this.veiculos.add(veiculos);
        this.quantidades[veiculos.getId()] += this.quantidades[];
        this.idsVeiculos[veiculos.getId()] = true;
        if("Carro".equalsIgnoreCase(veiculos.getNome(5))){
            //fazer os ifs para add automaticamente o valor dos veiculos

       }
    }

    public void removeVeiculos(int id){
        for(Veiculo veiculos : this.veiculos){
            if(veiculos.getId() == id){
                this.veiculos.remove(veiculos);
                this.idsVeiculos[id] = false;
                this.quantidades[id] -= 1;
            }
        }

    }
    
    public int getFreeId(){
        for(int i = 0; i < this.idsVeiculos.length; i++){
            if(!this.idsVeiculos[i]) return i;
        }
        throw new Exception("Este id não está disponivel.");
        //estudar melhor throw;
        //fazer o try, catch aqui, com os possiveis erro
        }
    }
    public boolean[] getIdsVeiculos() {
		return idsVeiculos;
	}

	public void setIdsVeiculos(boolean[] idsVeiculos) {
		this.idsVeiculos = idsVeiculos;
	}

	public static int getMaxqt() {
		return maxQt;
	}

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public int[] getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(int[] quantidades) {
        this.quantidades = quantidades;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}