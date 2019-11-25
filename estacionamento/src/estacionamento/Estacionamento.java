package estacionamento;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento{
    private boolean[] idsVeiculos;
	private static final int maxQt = 1000;
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private Double preco;
    private int qtdCarro;
    private int qtdCaminhao;
    private int qtdMoto;
    Veiculo ver = new Carro();
    Preco price = new Preco();
    public Estacionamento(){
        this.idsVeiculos = new boolean[maxQt];
    }

    public void addVeiculos(Veiculo v, int qtdCarro, int qtdCaminhao, int qtdMoto){
        getFreeId();
        //passar o parametro
        veiculos.add(v);
        this.idsVeiculos[v.getId()] = true;
        
        if("Carro".equalsIgnoreCase(ver.getModelo())){
            price.setQtdCarro(qtdCarro +=1);
            ver.setPreco(price.getPrecoCarro());
       }
       if("Caminhao".equalsIgnoreCase(ver.getModelo())){
            price.setQtdCaminhao(qtdCaminhao +=1);
            ver.setPreco(price.getPrecoCaminhao());
       }
       if("Moto".equalsIgnoreCase(ver.getModelo())){
            price.setQtdMoto(qtdMoto +=1);
            ver.setPreco(price.getPrecoMoto());
       }
       else{
            System.out.println("Tipo invalido");
            addVeiculos(v, qtdCarro, qtdCaminhao, qtdMoto);
       }
       
   }
    public void removeVeiculos(final int id) {
        for (Veiculo v : veiculos) {
            if (v.getId() == id) {
                this.idsVeiculos[id] = false;
                veiculos.remove(v);
                if("Carro".equalsIgnoreCase(ver.getModelo())){
                    price.setQtdCarro(qtdCarro -=1);
               }
               if("Caminhao".equalsIgnoreCase(ver.getModelo())){
                    price.setQtdCaminhao(qtdCaminhao -=1);
               }
               if("Moto".equalsIgnoreCase(ver.getModelo())){
                    price.setQtdMoto(qtdMoto -=1);
               }
            }
        }

    }

    public int getFreeId() {
        int aux = 0;
        for (int i = 0; i < this.idsVeiculos.length; i++) {
            if (this.idsVeiculos[i] != false){
                aux = i;
            }
        }
        return aux;
    }
        //throw new Exception("Este id não está disponivel.");
        // estudar melhor throw;
        // fazer o try, catch aqui, com os possiveis erro

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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(final Double preco) {
        this.preco = preco;
    }

    public static void setVeiculos(final ArrayList<Veiculo> veiculos) {
        Estacionamento.veiculos = veiculos;
    }

    public int getQtdCarro() {
        return qtdCarro;
    }

    public void setQtdCarro(int qtdCarro) {
        this.qtdCarro = qtdCarro;
    }

    public int getQtdCaminhao() {
        return qtdCaminhao;
    }

    public void setQtdCaminhao(int qtdCaminhao) {
        this.qtdCaminhao = qtdCaminhao;
    }

    public int getQtdMoto() {
        return qtdMoto;
    }

    public void setQtdMoto(int qtdMoto) {
        this.qtdMoto = qtdMoto;
    }

}