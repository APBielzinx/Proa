package model;

import service.Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hotel {

    Double valorDiaria;

    static final int NumeroDeQuartos = 20;
   static ArrayList<Boolean>quartosLivres  = new ArrayList<>();

    public static void iniciarQuartos() {
        for (int i = 0; i < NumeroDeQuartos; i++) {
            quartosLivres.add(true);
        }
    }
    public ArrayList<Boolean> getQuartosLivres() {
        return quartosLivres;
    }

    public void setQuartosLivres(ArrayList<Boolean> quartosLivres) {
        Hotel.quartosLivres = quartosLivres;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    Scanner scanner = new Scanner(System.in);
    ArrayList<String>hospedes = new ArrayList<>();


   public void fazerReserva(String nome){

        System.out.println("Qual o valor padrão da diaria");
        Double diaria = scanner.nextDouble();

        System.out.println("quantas diarias são necessarias?");
        int qtdDiarias = scanner.nextInt();

        setValorDiaria(qtdDiarias * diaria);

        System.out.println("o valor de "+qtdDiarias +" de hospedagem é de "+getValorDiaria());

        System.out.println("qual o nome do hospede?");
        String nomeDoHospede = scanner.next();

        Hotel.iniciarQuartos();
        boolean i = true;
        int numQuarto = 0;
        while (i){
            System.out.println("Qual o quarto para reserva? (1 - 20)?");
            numQuarto = scanner.nextInt();
            if (numQuarto > 20 ||  numQuarto < 0 ){
                System.out.println("Quarto invalido");
                Menu.menu(nome);
            }
            if (getQuartosLivres().get(numQuarto)){
                ArrayList<Boolean> ocuparQuarto = new ArrayList<>();
                for (int index = 0; index < NumeroDeQuartos; index++) {
                    ocuparQuarto.add(true);
                }
                ocuparQuarto.set(numQuarto,false);
                setQuartosLivres(ocuparQuarto);
                i = false;
            }else {
                System.out.println("Quarto está ocupado. Escolha outro");
            }
        }
        System.out.println(nome+" você confirma a hospedagem para "+nomeDoHospede+" por "+qtdDiarias+" dias para o quarto"+numQuarto+ " no valor de: "+getValorDiaria()+"? S/N");
        String confirmacao = scanner.next();

        if (confirmacao.equalsIgnoreCase("S")) {
            System.out.println(nome+"reserva efetuada para "+nomeDoHospede);
            Menu.menu(nome);

        }else {
            System.out.println(nome+"reserva Cancelada");
            Menu.menu(nome);
        }
    }

    public void menu(String nome) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("""
                    1. Cadastar
                    2. pesquisar
                    3. sair
                    """);
            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    cadastrar(nome);
                    break;

                case 2:
                    pesquisar(nome);
                    break;

                case 3:
                    Menu.menu(nome);
                    break;


            }
        } catch (
                InputMismatchException entradaInvlida) {
            System.out.println("Entrada de dados invalida");
            System.out.println("Voltando para o menu...");
            menu(nome);
        }
    }

    public void pesquisar(String nome) {

        System.out.println("qual o nome do hospede?");
        String nomeDoHospede = scanner.next();

        if (hospedes.contains(nomeDoHospede)){
            System.out.println(nomeDoHospede+" foi encontrada(o)");
            menu(nome);
        }

        System.out.println("Hospede "+nomeDoHospede+"  não foi encontrada(o)!");
        menu(nome);
    }

    public void cadastrar(String nome){
        System.out.println("qual o nome do hospede?");
        String nomeDoHospede = scanner.next();
        if (hospedes.size() >= 15){
            System.out.println("Máximo de cadastros atingido");
        }
        hospedes.add(nomeDoHospede);
        System.out.println("Hospede "+nomeDoHospede+" foi cadastrada(o) com sucesso!");
        menu(nome);
    }


}
