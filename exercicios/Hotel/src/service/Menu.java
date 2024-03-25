package service;

import model.*;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface Menu{

    static void menu(String nome){

        Scanner scanner = new Scanner(System.in);
        try {

            Evento evento = new Evento();
            Hotel hotel = new Hotel();
            Usuario usuario = new Usuario();
            Carro carro = new Carro();
            Servicos servicos = new Servicos();

            System.out.println("""
                1. Para fazer reserva
                2. para cadastrar
                3. Ações do usuario
                4. cadastrar evento
                5. Passeio
                6. Serviços
                """);
            int opcao = scanner.nextInt();

            switch (opcao){

                case 1: hotel.fazerReserva(nome);
                    break;

                case 2: usuario.cadastrar(nome);
                    break;
                case 3: hotel.menu(nome);
                    break;
                case 4: evento.auditorio(nome);
                    break;
                case 5: carro.abastecer(nome);
                    break;
                case 6: servicos.consultarServico(nome);
                    break;


            }
        }catch (InputMismatchException entradaInvlida){
            System.out.println("Entrada de dados invalida");
            System.out.println("Voltando para o menu...");
            menu(nome);
        }finally {
            System.out.println("Erro faltal, verifique se colocou os dados corretamente");
            System.out.println("Voltando para o menu...");
            menu(nome);
        }

    }

}
