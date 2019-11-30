package estacionamento;

import java.util.ArrayList;
import java.util.Scanner;
import estacionamento.Adm;

public class Main {
	ArrayList<Veiculo> veiculos;
	public Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		start();
	}

	private static void start() {
		Adm adm = new Adm();
	   adm.criarVeiculo();

	}
}
