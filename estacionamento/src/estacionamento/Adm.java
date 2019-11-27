package estacionamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.Position;

import estacionamento.Validador;
import sun.security.util.Length;
import estacionamento.Preco;
import estacionamento.Busca;

public class Adm{
    ArrayList<Veiculo> veiculos = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    Validador validador = new Validador();
    Preco price = new Preco();
    //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
    //Date data = new Date();
    Busca busca = new Busca();

    private Double preco;
    private int qtdCarro;
    private int qtdCaminhao;
    private int qtdMoto;
    private int qtdTotal;
    private static final int maxQt = 1000;
    private boolean [] postionID = new boolean [maxQt];
     
    public Adm(){
    }
    
    public void criarVeiculo(){
        int id;
        String modelo;
        String marca;
        String placa;
        String tipo;
        String cor;
        Double preco;
        String dataVeiculo;
        

        try{
            int aux = getFreeId();
            if(aux < 0){
                throw new Exception("ID ocupado");
            }
            id = aux;
            postionID[id] = true;
            System.out.println("---------Digite o Modelo do veiculo------------");
            modelo = input.nextLine();
            System.out.println("---------Digite a Placa do veiculo------------");
            System.out.println(">>>>>>>>> No formato (AAA-9999)<<<<<<<<<<<<<<<<");
            placa = input.nextLine();
            boolean retorno = validador.validador(placa);
            if(retorno == true){
                System.out.println("-----------------------Placa aceita--------------------");
            }
            else{
                System.out.println("----------------Placa invalida, comece o cadastro novamente----------------");
                criarVeiculo();
            }
            System.out.println("---------Digite a Cor do veiculo------------");
            cor = input.nextLine();
            System.out.println("---------Digite o tipo do veiculo------------");
            tipo = input.nextLine();
            //dataVeiculo = sdf.format(new Date());
            
            if("Carro".equalsIgnoreCase(tipo)){
                preco = price.getPrecoCarro();
                String tipoCarro;
                System.out.println("---------Digite o tipo do carro------------");
                tipoCarro = input.nextLine();;

                veiculos.add(new Carro(id, modelo, marca, placa, tipo, cor, preco, dataVeiculo,tipoCarro));
                qtdCarro +=1;
            }
            else if("Caminhao".equalsIgnoreCase(tipo)){
                preco = price.getPrecoCaminhao();
                Double carga;
                System.out.println("---------Digite o tipo a Carga que o Caminhão suportar------------");
                carga = input.nextDouble();
                veiculos.add(new Caminhao(id, modelo, marca, placa, tipo, cor, preco, dataVeiculo,carga));
                qtdCaminhao +=1;
            }
            else if("Moto".equalsIgnoreCase(tipo)){
                preco = price.getPrecoMoto();
                Double cilindrada;
                cilindrada = input.nextDouble();
                System.out.println("---------Digite a cilindrada da moto------------");
                veiculos.add(new Moto(id, modelo, marca, placa, tipo, cor, preco, dataVeiculo,cilindrada));
                qtdMoto +=1;
            }
            qtdTotal = qtdCaminhao+qtdCarro+qtdMoto;
        }catch(InputMismatchException e){
            System.out.println("Tipo invalido");
        }
   
}
    public int getFreeId() {
        for(int i= 0; i < postionID.length; i++){
            if (this.postionID[i] != true)
                return i;
            else
                return -1;
        }
        
    }
    public void removerVeiculo(){
        int id = input.nextInt();
        int retorno = busca.getIdVeiculos(qtdTotal, veiculos);
        if(retorno != -1){
            if("Carro".equalsIgnoreCase(veiculos.get(id).getTipo()))
                qtdCarro-=1;
             else if("Caminhao".equalsIgnoreCase((veiculos.get(id).getTipo())))
                qtdCaminhao-=1;
             else if("Moto".equalsIgnoreCase((veiculos.get(id).getTipo())))
                qtdMoto-=1;        
            veiculos.remove(id);
            System.out.println("---------Veiculo removido com sucesso----------------");
        }else{
            System.out.println("-----------ID não cadastrado-----------------");
        }
     
    }
    public void alterarVeiculos(){
        try{
            System.out.println("-----------------Alterar veiculos----------------");
            System.out.println("--------------Digite um ID para modificar--------");
            int id = input.nextInt();
            int retorno = busca.getIdVeiculos(qtdTotal, veiculos);
            if(retorno != -1){
                while(true){
                    System.out.println("Digite o número da operação\n"+
                                    "[1] Alterar modelo\n"+
                                    "[2] Alterar marca\n"+
                                    "[3] Alterar placa\n"+
                                    "[4] Alterar o tipo\n"+
                                    "[5] Alterar cor\n"+
                                    "[6] Encerrar operação\n");
                    String indice = input.nextLine();
                    if(indice.equals(1)){
                        System.out.println("------------Insira o novo modelo------------------");
                        veiculos.get(id).setModelo(input.nextLine());
                    }
                    else if(indice.equals(2)){
                        System.out.println("---------------Insira a nova marca-----------------");
                        veiculos.get(id).setMarca(input.nextLine());
                    }
                    else if(indice.equals(3)){
                        System.out.println("------------------Insira a nova placa----------------");
                        System.out.println(">>>>>>>>> No formato (AAA-9999)<<<<<<<<<<<<<<<<");
                        String placa = input.nextLine();
                        boolean retorno2 = validador.validador(placa);
                        if(retorno2 == true){
                            System.out.println("-----------------------Placa aceita--------------------");
                            veiculos.get(id).setPlaca(placa);
                        }
                        else{
                            System.out.println("----------------Placa invalida, comece o cadastro novamente----------------");
                            alterarVeiculos();
                        }
                    }
                    else if(indice.equals(4)){
                        System.out.println("------------------Insira o novo Tipo---------------");
                        if("Carro".equalsIgnoreCase(veiculos.get(id).getTipo())){
                            String tipo = input.nextLine();
                            Veiculo aux = new Veiculo(veiculos.get(id).getId(), veiculos.get(id).getModelo(), veiculos.get(id).getMarca(), veiculos.get(id).getPlaca(), tipo, veiculos.get(id).getCor(), veiculos.get(id).getPreco(), veiculos.get(id).getDataVeiculo(), veiculos.get(id).getTipoCarro());
                            veiculos.set(id, aux);
                        }
                        else if("Caminhao".equalsIgnoreCase(veiculos.get(id).getTipo())){
                            String tipo = input.nextLine();
                            Veiculo aux = new Veiculo(veiculos.get(id).getId(), veiculos.get(id).getModelo(), veiculos.get(id).getMarca(), veiculos.get(id).getPlaca(), tipo, veiculos.get(id).getCor(), veiculos.get(id).getPreco(), veiculos.get(id).getDataVeiculo(), veiculos.get(id).getCarga());
                            veiculos.set(id, aux);
                        }
                        else if("Moto".equalsIgnoreCase(veiculos.get(id).getTipo())){
                            String tipo = input.nextLine();
                            Veiculo aux = new Veiculo(veiculos.get(id).getId(), veiculos.get(id).getModelo(), veiculos.get(id).getMarca(), veiculos.get(id).getPlaca(), tipo, veiculos.get(id).getCor(), veiculos.get(id).getPreco(), veiculos.get(id).getDataVeiculo(), veiculos.get(id).getCilindrada());
                            veiculos.set(id, aux);
                        }
                    }
                    else if(indice.equals(5)){
                        System.out.println("------------------Insira a nova Cor---------------");
                        veiculos.get(id).setCor(input.nextLine());
                    }
                    else if(indice.equals(6)){
                        System.exit(0);
                    }
                }
        
            }
            else{
                System.out.println("-----------ID não existe-----------------------");
            }
            
        }catch(InputMismatchException e){
            System.out.println("Tipo invalido");
        }
       
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
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