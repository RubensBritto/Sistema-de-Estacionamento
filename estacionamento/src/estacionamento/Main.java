package estacionamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import estacionamento.*;

public class Main {
	ArrayList<Veiculo> veiculos;
	public Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		Veiculo carros = new Carro();
		Veiculo motos = new Moto();
		Veiculo caminhao = new Caminhao();
		Adm adm = new Adm();

	
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
		//Date data = new Date();
		//String result = sdf.format(new Date());
	   //System.out.println(result);
	   adm.criarVeiculo();
	}

}
