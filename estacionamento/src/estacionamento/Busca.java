package estacionamento;
import java.util.Scanner;


public class Busca{
    Scanner input = new Scanner(System.in);
    public int getIdVeiculos(int totalVeiculos, ArrayList<Veiculo>veiculos){
        System.out.println("---------------------Digite o ID do veiculo--------------------");
        int id= input.nextInt();
        for(int aux = 0; aux < totalVeiculos; aux++){
            if(id == veiculos.get(aux).getId()){
                return aux;
            }
            else{
                System.out.println("---------- ID invalido, digite novamente------------------");
                return -1;
            }
        }
      
    }
}