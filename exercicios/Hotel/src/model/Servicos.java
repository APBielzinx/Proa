package model;

import service.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicos {

    private String empresa;

    private double valorPorAparelho;

    private int quantidadeDeAparelhos;

    private double porcentagemDeDesconto;

    private double valorTotalDoServico;


    public Servicos() {
    }

    public Servicos(String empresa, double valorPorAparelho, int quantidadeDeAparelhos, double porcentagemDeDesconto, double valorTotalDoServico) {
        this.empresa = empresa;
        this.valorPorAparelho = valorPorAparelho;
        this.quantidadeDeAparelhos = quantidadeDeAparelhos;
        this.porcentagemDeDesconto = porcentagemDeDesconto;
        this.valorTotalDoServico = valorTotalDoServico;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getValorPorAparelho() {
        return valorPorAparelho;
    }

    public void setValorPorAparelho(double valorPorAparelho) {
        this.valorPorAparelho = valorPorAparelho;
    }

    public int getQuantidadeDeAparelhos() {
        return quantidadeDeAparelhos;
    }

    public void setQuantidadeDeAparelhos(int quantidadeDeAparelhos) {
        this.quantidadeDeAparelhos = quantidadeDeAparelhos;
    }

    public double getPorcentagemDeDesconto() {
        return porcentagemDeDesconto;
    }

    public void setPorcentagemDeDesconto(double porcentagemDeDesconto) {
        this.porcentagemDeDesconto = porcentagemDeDesconto;
    }

    public double getValorTotalDoServico() {
        return valorTotalDoServico;
    }

    public void setValorTotalDoServico(double valorTotalDoServico) {
        this.valorTotalDoServico = valorTotalDoServico;
    }

    public void consultarServico(String nome) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Servicos> servicos = new ArrayList<>();

        boolean index = true;
        while (index) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Qual o nome da empresa?");
                String nomeEmpresa = scanner.next();

                System.out.println("Qual o valor por aparelho?");
                double valorPorAparelho = scanner.nextDouble();

                System.out.println("Qual a quantidade de aparelhos?");
                int quantidadeAparelhos = scanner.nextInt();

                System.out.println("Qual a porcentagem de desconto?");
                double porcentagemDesconto = scanner.nextDouble();

                System.out.println("Qual o número mínimo de aparelhos para conseguir o desconto?");
                int minimoAparelhosDesconto = scanner.nextInt();

                double valorTotalDoServico;
                if (quantidadeAparelhos > minimoAparelhosDesconto) {
                    valorTotalDoServico = valorPorAparelho * quantidadeAparelhos * (1 - porcentagemDesconto / 100);
                } else {
                    valorTotalDoServico = valorPorAparelho * quantidadeAparelhos;
                }

                System.out.println("O serviço de Empresa " + nomeEmpresa + " custará R$ " + valorTotalDoServico);

                Servicos servico = new Servicos(nomeEmpresa, valorPorAparelho, quantidadeAparelhos, porcentagemDesconto, valorTotalDoServico);
                servicos.add(servico);

                if (i == 1){
                    System.out.println(" Deseja informar novos dados, " + nome + "? (S/N)");
                    String escolha = scanner.next();

                    if (escolha.equalsIgnoreCase("N")) {
                        double menorValor = Double.MAX_VALUE;
                        String empresaMenorValor = "";

                        for (Servicos s : servicos) {
                            if (s.getValorTotalDoServico() < menorValor) {
                                menorValor = s.getValorTotalDoServico();
                                empresaMenorValor = s.getEmpresa();
                            }
                        }

                        System.out.println("O orçamento de menor valor é o da empresa " + empresaMenorValor + " por R$ " + menorValor);
                        index = false;
                        Menu.menu(nome);

                    }
                }
            }

            System.out.println("Qual o nome da empresa?");
            String nomeEmpresa = scanner.next();

            System.out.println("Qual o valor por aparelho?");
            double valorPorAparelho = scanner.nextDouble();

            System.out.println("Qual a quantidade de aparelhos?");
            int quantidadeAparelhos = scanner.nextInt();

            System.out.println("Qual a porcentagem de desconto?");
            double porcentagemDesconto = scanner.nextDouble();

            System.out.println("Qual o número mínimo de aparelhos para conseguir o desconto?");
            int minimoAparelhosDesconto = scanner.nextInt();

            double valorTotalDoServico;
            if (quantidadeAparelhos > minimoAparelhosDesconto) {
                valorTotalDoServico = valorPorAparelho * quantidadeAparelhos * (1 - porcentagemDesconto / 100);
            } else {
                valorTotalDoServico = valorPorAparelho * quantidadeAparelhos;
            }

            System.out.println("O serviço de Empresa " + nomeEmpresa + " custará R$ " + valorTotalDoServico);

            Servicos servico = new Servicos(nomeEmpresa, valorPorAparelho, quantidadeAparelhos, porcentagemDesconto, valorTotalDoServico);
            servicos.add(servico);

            System.out.println(" Deseja informar novos dados, " + nome + "? (S/N)");
            String escolha = scanner.next();

            if (escolha.equalsIgnoreCase("N")) {
                double menorValor = Double.MAX_VALUE;
                String empresaMenorValor = "";

                for (Servicos s : servicos) {
                    if (s.getValorTotalDoServico() < menorValor) {
                        menorValor = s.getValorTotalDoServico();
                        empresaMenorValor = s.getEmpresa();
                    }
                }

                System.out.println("O orçamento de menor valor é o da empresa " + empresaMenorValor + " por R$ " + menorValor);
                Menu.menu(nome);
            }
        }

    }
}
