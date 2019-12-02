package estacionamento;
import java.util.Scanner;
import java.util.ArrayList;
import estacionamento.Veiculo;


public class Busca{
    Scanner input = new Scanner(System.in);
    public int getIdVeiculos(ArrayList<Veiculo> veiculos){
        System.out.println("---------------------Digite o ID do veiculo--------------------");
        int id = input.nextInt();
        for(int aux = 0; aux < veiculos.size(); aux++){
            if(id == veiculos.get(aux).getId()){
                return aux;
            }
        }
        System.out.println("---------- ID invalido------------------");
        return -1;  
    }
}