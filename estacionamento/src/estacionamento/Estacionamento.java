package estacionamento;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento{
    private boolean[] idsVeiculos;
	private static final int maxQt = 1000;
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private int[] quantidades;
    private Double preco;
    Carro ver = new Veiculo();
    //ver o array quantidade
    public Estacionamento(){
        this.idsVeiculos = new boolean[maxQt];
        this.quantidades = new int[maxQt];
    }

    public void addVeiculos(final Veiculo v, final int quatidades){
        veiculos.add(v);
        this.quantidades[v.getId()] += this.quantidades[];
        this.idsVeiculos[v.getId()] = true;

        if("Carro".equalsIgnoreCase(v.getNome(5))){
            //fazer os ifs para add automaticamente o valor dos veiculos

       }
    }

    public void removeVeiculos(final int id) {
        for (Veiculo v : veiculos) {
            if (v.getId() == id) {
                veiculos.remove(v);
                this.idsVeiculos[id] = false;
                this.quantidades[id] -= 1;
            }
        }

    }

    public int getFreeId() {
        for (int i = 0; i < this.idsVeiculos.length; i++) {
            if (!this.idsVeiculos[i])
                return i;
        }
        throw new Exception("Este id não está disponivel.");
        // estudar melhor throw;
        // fazer o try, catch aqui, com os possiveis erro
    }

    }

    public boolean[] getIdsVeiculos() {
        return idsVeiculos;
    }

    public void setIdsVeiculos(final boolean[] idsVeiculos) {
        this.idsVeiculos = idsVeiculos;
    }

    public static int getMaxqt() {
        return maxQt;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public int[] getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(final int[] quantidades) {
        this.quantidades = quantidades;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(final Double preco) {
        this.preco = preco;
    }

    public static void setVeiculos(final ArrayList<Veiculo> veiculos) {
        Estacionamento.veiculos = veiculos;
    }

}