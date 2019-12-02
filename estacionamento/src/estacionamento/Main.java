package estacionamento;

import java.util.ArrayList;
import java.util.Scanner;
import estacionamento.Menu;

public class Main {
	ArrayList<Veiculo> veiculos;
	public Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		Menu menu = new Menu();
		menu.start();
	}
}
