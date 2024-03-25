package model;

import service.Menu;

import java.util.Scanner;

public class Usuario {

    private String nome;
    private int idade;

    private double diaria;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Scanner scanner = new Scanner(System.in);
    public void cadastrar(String nome){



        System.out.println("Qual o valor padrão da diaria");
        Double diaria = scanner.nextDouble();

        setDiaria(diaria);

        boolean i = true;
        int totalDeHospedagens = 0;
        int totalGratuidade = 0;
        int totalMeias = 0;
        while (i) {
            System.out.println("qual o nome do hospede?");
            String nomeDoHospede = scanner.next();
            if (nomeDoHospede.equalsIgnoreCase("PARE")){
                i = false;
            }else {
                setNome(nomeDoHospede);

                System.out.println("Qual a idade do Hóspede?");
                int idade = scanner.nextInt();
                setIdade(idade);
                if (getIdade() < 6 ){
                    System.out.println(nomeDoHospede+" possui gratuidad");
                    totalGratuidade++;
                } else if (getIdade() > 60) {
                    System.out.println(nomeDoHospede+" paga meia");
                    totalMeias++;
                }
                System.out.println(nomeDoHospede+" cadastrada(o) com sucesso.");
                totalDeHospedagens++;
            }
        }

        System.out.println(nome+", o valor total das hospedagens é "+totalDeHospedagens * getDiaria() +"; "
                +totalGratuidade+" gratuidade(s); "+totalMeias+" meia(s)" );
        Menu.menu(nome);
    }
}
