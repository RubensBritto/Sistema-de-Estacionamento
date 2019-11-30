package estacionamento;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Preco{
	public Scanner input = new Scanner(System.in);
    private Double precoCarro;
    private Double precoMoto;
    private Double precoCaminhao;
    private Double horaAdicional;
    private int escolha;
    private int qtdCarro;
    private int qtdMoto;
    private int qtdCaminhao;



    public void addPreco(){
        System.out.println("Digite o valor do preço dos Carros");
        setPrecoCarro(input.nextDouble());
        System.out.println("Digite o valor do preço das motos");
        setPrecoMoto(input.nextDouble());
        System.out.println("Digite o valor do preço dos Caminhoes");
        setPrecoCaminhao(input.nextDouble());
        System.out.println("Digite o valor do preço das horas adicionais");
        setHoraAdicional(input.nextDouble());      
    }
    public void alterarPreco(){
        System.out.println("Digite a opção desejada\n"+
                "[1]- Para alterar o valor dos carros\n"+
                "[2]- Para altera o valor das motos\n"+
                "[3]- Para alterar o valor dos Caminhões\n"+
                "[4]- Para alterar o valor das horas adicionais");
        try {
            setEscolha(input.nextInt());       
        } catch (NumberFormatException e) {
            System.out.println("O campo espera um número");
            alterarPreco();       
        }
        if(getEscolha() == 1){
            setPrecoCarro(input.nextDouble()); 
        }
        else if (getEscolha() == 2) {
            setPrecoMoto(input.nextDouble()); 
        } 
        else if (getEscolha() == 3) {
            setPrecoMoto(input.nextDouble()); 
        }
        else if (getEscolha() == 4) {
            setHoraAdicional(input.nextDouble()); 
        }
        else{
            System.out.println("Opção invalida");
            alterarPreco();
        }         

    }
    public Double getPrecoCarro() {
        return precoCarro;
    }

    public void setPrecoCarro(Double precoCarro) {
        this.precoCarro = precoCarro;
    }

    public Double getPrecoMoto() {
        return precoMoto;
    }

    public void setPrecoMoto(Double precoMoto) {
        this.precoMoto = precoMoto;
    }

    public Double getPrecoCaminhao() {
        return precoCaminhao;
    }

    public void setPrecoCaminhao(Double precoCaminhao) {
        this.precoCaminhao = precoCaminhao;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public Double getHoraAdicional() {
        return horaAdicional;
    }

    public void setHoraAdicional(Double horaAdicional) {
        this.horaAdicional = horaAdicional;
    }

    public int getQtdCarro() {
        return qtdCarro;
    }

    public void setQtdCarro(int qtdCarro) {
        this.qtdCarro = qtdCarro;
    }

    public int getQtdMoto() {
        return qtdMoto;
    }

    public void setQtdMoto(int qtdMoto) {
        this.qtdMoto = qtdMoto;
    }

    public int getQtdCaminhao() {
        return qtdCaminhao;
    }

    public void setQtdCaminhao(int qtdCaminhao) {
        this.qtdCaminhao = qtdCaminhao;
    }

    public static double calcularPagamento(Date entrou, Date saiu, double valPHora) {
        int inicio, fim, tempoDecorrido;
        inicio = getHoraFormatada(entrou, "mm");
        fim = getHoraFormatada(saiu, "mm");
        inicio += 60 * getHoraFormatada(entrou, "HH");
        fim += 60 * getHoraFormatada(saiu, "HH");
        tempoDecorrido = fim - inicio;
        if (tempoDecorrido < 0) {
            tempoDecorrido = (tempoDecorrido - 24 * 60) * -1;
        }
        double asw = tempoDecorrido/60 * valPHora;
        return (tempoDecorrido < 60) ? valPHora : asw;
    }

    private static int getHoraFormatada(Date h, String formato) {
        String fh = new SimpleDateFormat(formato).format(h);
        return Integer.parseInt(fh);
    }

}