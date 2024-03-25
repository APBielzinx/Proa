package model;

import service.Menu;

import java.util.Scanner;

public class Carro {

    private final int combustivel = 42;


    public int getCombustivel() {
        return combustivel;
    }

    Scanner scanner = new Scanner(System.in);
    public void abastecer(String nome) {

        System.out.println("Qual o valor do álcool no posto Wayne Oil?");
        double valorPostoWayneAlcool = scanner.nextDouble();
        System.out.println("Qual o valor da gasolina no posto Wayne Oil?");
        double valorPostoWayneGasolina = scanner.nextDouble();
        System.out.println("Qual o valor do álcool no posto Stark Petrol?");
        double valorPostoStarkAlcool = scanner.nextDouble();
        System.out.println("Qual o valor da gasolina no posto Stark Petrol?");
        double valorPostoStarkGasolina = scanner.nextDouble();

        double menorValorPostoStark = Math.min(valorPostoStarkGasolina,valorPostoStarkAlcool)*42;

        double menorValorPostoWayne= Math.min(valorPostoWayneGasolina,valorPostoWayneAlcool)*42;

        String postoMaisBarato;
        if (menorValorPostoStark < menorValorPostoWayne) {
            postoMaisBarato = "Stark Petrol";
        } else {
            postoMaisBarato = "Wayne Oil";
        }


        double diferencaPrecoStark = Math.abs(valorPostoStarkAlcool - valorPostoStarkGasolina);
        double diferencaPrecoWayne = Math.abs(valorPostoWayneAlcool - valorPostoWayneGasolina);
        String combustivelAtraente;
        if (diferencaPrecoStark / valorPostoStarkGasolina > 0.3 || diferencaPrecoWayne / valorPostoWayneGasolina > 0.3) {
            combustivelAtraente = "Álcool";
        } else {
            combustivelAtraente = "Gasolina";
        }


        System.out.println(nome+" É mais barato abastecer com " + combustivelAtraente + " no posto " + postoMaisBarato);


        Menu.menu(nome);
    }

}
