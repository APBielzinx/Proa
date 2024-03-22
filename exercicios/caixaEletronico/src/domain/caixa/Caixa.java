package domain.caixa;

import domain.user.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface Caixa {

    Usuario usuario = new Usuario("Gabriel", 100.00);
    Scanner entrada = new Scanner(System.in);

    static void inicio() {
        try {
            System.out.println("Olá " + usuario.getNome() + "\n");

            System.out.println("escolha uma da opções abaixo " + "\n");

            System.out.println("""
                1. para Saldo
                2 para Extrato
                3 para Saque
                4 para fazer Depósito
                5 para ver Transferência\s
                6 para Sair""");
            int resposta = entrada.nextInt();

            switch (resposta) {
                case 1:
                    saldo();
                    break;

                case 2:
                    extrato();
                    break;

                case 3:
                    saque(usuario.getSaldo());
                    break;

                case 4:
                    deposito(usuario.getSaldo());
                    break;

                case 5:
                    transferencia(usuario.getSaldo());
                    break;

                case 6:
                    sair();
                    break;

                default:
                    throw new RuntimeException("dado invalido inserido tente novamente");

            }
        } catch (InputMismatchException error) {
            System.out.println("tipo de Entrada inesperada. Erro: " + error);
            entrada.nextLine(); // Limpar o buffer do scanner
            outraOperacao();
        }
    }

    static void sair() {
        System.out.println("Deseja mesmo sair do sistema? (S/N) ");
        Scanner entrada = new Scanner(System.in);

        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Saindo do sistema...");
            System.exit(0);
        } else if (resposta.equalsIgnoreCase("N")) {
            inicio();
        } else {
            System.out.println("Opção inválida. Por favor, escolha 'S' para sim ou 'N' para não.");
            sair();
        }
    }

    static void transferencia(Double saldo) {
        if (verificarSenha()) {
            System.out.println(" quanto deseja transferir hoje? ");
            double transferir = entrada.nextDouble();
            System.out.println(" para qual conta deseja transferir ? ");

            if (transferir >= saldo) {
                System.out.println("Operação não autorizada");
                transferencia(usuario.getSaldo());
                outraOperacao();
            } else {
                usuario.setSaldo(saldo - transferir);
                System.out.println("Operação autorizada");
                outraOperacao();
            }
        } else {
            System.out.println("SENHA INVALIDA");
            outraOperacao();
        }
    }

    static void deposito(Double saldo) {
        if (verificarSenha()) {
            System.out.println(" quanto deseja depositar hoje? ");
            double deposito = entrada.nextDouble();

            usuario.setSaldo(saldo + deposito);

            System.out.println("Operação autorizada");

            outraOperacao();
        } else {
            System.out.println("SENHA INVALIDA");
            outraOperacao();
        }
    }

    static void extrato() {
        if (verificarSenha()) {
            ArrayList<String> extrato = new ArrayList<>();

            extrato.add("Transação feita dia: " + LocalDate.now() + " no valor de R$800");
            extrato.add("Transação feita dia: " + LocalDate.now() + " no valor de R$900");
            extrato.add("Transação feita dia: " + LocalDate.now() + " no valor de R$90");
            extrato.add("Transação feita dia: " + LocalDate.now() + " no valor de R$9");

            System.out.println("o seu extrato é");
            for (String s : extrato) {
                System.out.println(s + "\n");
            }
            outraOperacao();
        } else {
            System.out.println("SENHA INVALIDA");
            outraOperacao();
        }
    }

    static void saldo() {
        if (verificarSenha()) {
            System.out.println("Seu saldo é de " + usuario.getSaldo());
            outraOperacao();
        } else {
            System.out.println("SENHA INVALIDA");
            outraOperacao();
        }
    }

    static void saque(Double saldo) {
        if (verificarSenha()) {
            System.out.println(" quanto deseja sacar hoje? ");
            double saque = entrada.nextDouble();

            if (saque >= saldo) {
                System.out.println("Operação não autorizada");
                outraOperacao();
            } else {
                usuario.setSaldo(saldo - saque);
                System.out.println("Operação autorizada");
            }
            outraOperacao();
        } else {
            System.out.println("SENHA INVALIDA");
            outraOperacao();
        }
    }

    static void outraOperacao() {
        System.out.println("Deseja realizar outra operação? (S/N) ");
        Scanner entrada = new Scanner(System.in);

        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            inicio();
        } else if (resposta.equalsIgnoreCase("N")) {
            sair();
        }else {
            System.out.println("Opção inválida. Por favor, escolha 'S' para sim ou 'N' para não.");
            outraOperacao();
        }
    }

    static boolean verificarSenha() {
        System.out.println("Qual é a senha?");
        int senha = entrada.nextInt();
        if (senha == 3589) {
            return true;
        }
        return false;
    }
}
