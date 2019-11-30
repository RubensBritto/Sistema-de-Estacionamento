package estacionamento;
import java.util.ArrayList;

public class Relatorio{
    ArrayList<Tipo> tipos;
    ArrayList<Valor> valores;

    public void addRelatorio(String tipo, Double preco){
        tipos.add(tipo);
        valores.add(preco);
    }
    public void printarRelatorio(Tipo tipos, Valor valores ){
        int aux1, aux2, aux3 = 0;
        for(int i = 0; i < tipos.leght; i++){
            if("Carro".equalsIgnoreCase(tipos.get(i))){
                aux1 += 1;
                if(aux1 <= 1){
                    System.out.println("---------------------Valores dos carros------------");
                    System.out.println(valores.get(i));
                    aux1++;
                }else{
                    System.out.println(valores.get(i));
                    aux1++;
                }
                
            }
            if("Moto".equalsIgnoreCase(tipos.get(i))){
                aux2 += 1;
                if(aux2 <= 1){
                    System.out.println("---------------------Valores das Motos------------");
                    System.out.println(valores.get(i));
                    aux2++;
                }else{
                    System.out.println(valores.get(i));
                    aux2++;
                }
            }
            if("Caminhao".equalsIgnoreCase(tipos.get(i))){
                aux3 += 1;
                if(aux3 <= 1){
                    System.out.println("---------------------Valores dos Caminhãoes------------");
                    System.out.println(valores.get(i));
                    aux3++;
                }else{
                    System.out.println(valores.get(i));
                    aux3++;
                }
                
            }
        }
        System.out.printf("Total de veiculos que entraram no estacionamento: %i", aux1+aux2+aux3);
    }
}