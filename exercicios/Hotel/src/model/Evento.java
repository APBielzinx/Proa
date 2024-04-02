package model;


import service.Menu;

import java.util.Scanner;

public class Evento  {

    private int auditorioLaranja = 150;
    private int auditorioColorado = 350;
    private int cadeirasAMais = 70;
    private int totalConvidados;
    private String local;
    private String empresa;
    private int horario;
    private int duracao;
    private int garcons;
    private double custoGarcons;

    private String diaDaSemana;

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getGarcons() {
        return garcons;
    }

    public void setGarcons(int garcons) {
        this.garcons = garcons;
    }

    public double getCustoGarcons() {
        return custoGarcons;
    }

    public void setCustoGarcons(double custoGarcons) {
        this.custoGarcons = custoGarcons;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getTotalConvidados() {
        return totalConvidados;
    }

    public void setTotalConvidados(int totalConvidados) {
        this.totalConvidados = totalConvidados;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCadeirasAMais() {
        return cadeirasAMais;
    }

    public void setCadeirasAMais(int cadeirasAMais) {
        this.cadeirasAMais = cadeirasAMais;
    }

    public int getAuditorioLaranja() {
        return auditorioLaranja;
    }

    public void setAuditorioLaranja(int auditorioLaranja) {
        this.auditorioLaranja = auditorioLaranja;
    }

    public int getAuditorioColorado() {
        return auditorioColorado;
    }

    public void setAuditorioColorado(int auditorioColorado) {
        this.auditorioColorado = auditorioColorado;
    }
    Scanner scanner = new Scanner(System.in);

    public void auditorio(String nome) {

        System.out.println("Qual o número de convidados para o seu evento");
        int numeroDeConvidados = scanner.nextInt();

        if (numeroDeConvidados > getAuditorioColorado() || numeroDeConvidados <= 0) {
            System.out.println("Número de convidados inválido");
            auditorio(nome);
        } else if (numeroDeConvidados > getAuditorioLaranja() + getCadeirasAMais()) {
            System.out.println("use o auditório Colorado");
            System.out.println("agora vamos ver a agenda do evento");
            setLocal("auditorio Colorado");
            setTotalConvidados(numeroDeConvidados);
            horario(nome);
        } else if (numeroDeConvidados <= getAuditorioLaranja() + getCadeirasAMais()) {
            if (numeroDeConvidados <= getAuditorioLaranja()) {
                System.out.println("use o auditório laranja sem cadeiras a mais");
                System.out.println("agora vamos ver a agenda do evento");
                setTotalConvidados(numeroDeConvidados);
                setLocal("auditorio laranja");
                horario(nome);
            } else {
                int cadeirasAMais = numeroDeConvidados - getAuditorioLaranja();
                System.out.println("use o auditório laranja com " + cadeirasAMais + " cadeiras a mais");
                System.out.println("agora vamos ver a agenda do evento");
                setTotalConvidados(numeroDeConvidados);
                setLocal("auditorio laranja");
                horario(nome);
            }
        }
    }
    public void horario(String nome){
        System.out.println("Qual o dia da semana do seu evento");
        String diaDaSemana = scanner.next();
        if (diaDaSemana.equalsIgnoreCase("sabado") || diaDaSemana.equalsIgnoreCase("domingo")){

            System.out.println("Qual o horario do seu evento");
            int horario = scanner.nextInt();

            if (horario > 15 || horario < 7){
                System.out.println("Auditório indisponível");
            }else {
                System.out.println("qual o nome da empresa?");
                String nomeDaEmpresa = scanner.next();

                System.out.println("Auditório reservado para "+nomeDaEmpresa+"."+diaDaSemana+" às"+horario);
                setEmpresa(nomeDaEmpresa);
                setHorario(horario);
               setDiaDaSemana(diaDaSemana);
                contratarGarcons(nome);
            }
        }else if (diaDaSemana.equalsIgnoreCase("segunda") || diaDaSemana.equalsIgnoreCase("terça")
                 || diaDaSemana.equalsIgnoreCase("quarta") || diaDaSemana.equalsIgnoreCase("quinta")
                 || diaDaSemana.equalsIgnoreCase("sexta")){
            System.out.println("Qual o horario do seu evento");
            int horario = scanner.nextInt();
            if (horario < 7 || horario > 23){
                System.out.println("Auditório indisponível");
            }else {
                System.out.println("qual o nome da empresa?");
                String nomeDaEmpresa = scanner.next();

                System.out.println("Auditório reservado para "+nomeDaEmpresa+". "+diaDaSemana+" às "+horario);
                setEmpresa(nomeDaEmpresa);
                setHorario(horario);
                setDiaDaSemana(diaDaSemana);
                contratarGarcons(nome);

            }
        }else {
            System.out.println("Dia da semanda invalido");
        }
    }

    private void contratarGarcons(String nome) {

        System.out.println("Qual a duração do evento em horas?");
        int duracao = scanner.nextInt();

        int numGarcons = (int) Math.ceil(getTotalConvidados() / 12.0); // Arredonda para cima
        numGarcons += duracao / 2;

        setGarcons(numGarcons);

        double custoTotal = numGarcons * 10.50 * duracao;

        setCustoGarcons(custoTotal);

        System.out.println("São necessários "+getGarcons()+" garçons");
        System.out.println("Custo: R$"+getCustoGarcons());
        System.out.println("Agora vamos calcular o custo do buffet do hotel para o evento.");

        setDuracao(duracao);

        buffet(nome);

    }

    private void buffet(String nome) {

        double qtdCafe = 0.2 * getTotalConvidados();
        double qtdAgua = 0.5 * getTotalConvidados();
        int qtdSalgado = (int) Math.ceil(getTotalConvidados() * 7.0 / 100.0) * 100;

        double custoCafe = qtdCafe * 0.80;
        double custoAgua = qtdAgua * 0.40;
        double custoSalgados = qtdSalgado / 100.0 * 34.0;
        double custoTotalComida = custoCafe + custoAgua + custoSalgados;

        System.out.println("O evento precisará de "+qtdCafe +" litros de café, "+qtdAgua +" litros de água,"+qtdSalgado +" salgados.");

        System.out.println("Evento no "+getLocal());
        System.out.println("Nome da Empresa: "+getEmpresa());
        int horarioFinal = getHorario() + getDuracao();
        System.out.println("Data: "+getDiaDaSemana()+", "+getHorario()+"h às "+horarioFinal+"h.");
        System.out.println("Duração do evento: "+getDuracao());
        System.out.println("Quantidade de garçons: "+getGarcons());
        System.out.println("Quantidade de Convidados: "+getTotalConvidados());
        System.out.println("Custo do garçons: "+getCustoGarcons());
        System.out.println("Custo do Buffet: "+custoTotalComida);
        double valorTotalDoEvento = getCustoGarcons()+custoTotalComida;
        System.out.println("Valor total do Evento: "+valorTotalDoEvento);

        System.out.println("Gostaria de efetuar a reserva? S/N ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")){
            System.out.println(nome+" reserva efetuada com sucesso.");
            Menu.menu(nome);
        }else {
            System.out.println(nome+" Reserva não efetuada.");
            Menu.menu(nome);
        }


    }
}