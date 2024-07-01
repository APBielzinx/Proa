package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        // write your code here

//        exercicio 1
//        String Planeta = "Plutão";
//        System.out.println("o Planeta é: " + Planeta);
//
//        secanners para entrada de dados
        Scanner scanner = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);

//        exercicio 2
//        System.out.print("informe seu nome: ");
//        String nomeUsuario = entrada.nextLine();
//
//        exercicio 3
//        System.out.print("informe seu nome: ");
//        String nomeUsuario = entrada.nextLine();
//        System.out.print("informe sua idade: ");
//        int idade = entrada.nextInt();
//        System.out.print("bom dia " + nomeUsuario + ", sua idade é " + idade);


//        exercicios 4
//        System.out.print("Digite a largura do retângulo: ");
//        double largura = entrada.nextDouble();
//        System.out.print("Digite a altura do retângulo: ");
//        double altura = entrada.nextDouble();
//        double area = largura * altura;
//        System.out.println("A área do retângulo é: " + area);
//        entrada.close();

//        System.out.print("Informe um lado: ");
//        double lado = entrada.nextDouble();
//        double area = lado * lado;
//        System.out.println("A soma do quadrado é: " + area);
//

//        System.out.print("Informe a diagonal maior: ");
//        double diagonanalMaior = entrada.nextDouble();
//        System.out.print("Informe a diagonal menor: ");
//        double diagonanalMenor = entrada.nextDouble();
//        double area = diagonanalMaior * diagonanalMenor / 2;
//        System.out.println("a area é: " + area);

//        System.out.println("Calculo da área do trapézio");
//        System.out.print("Informe a base maior: ");
//        double baseMaior = entrada.nextDouble();
//        System.out.print("Informe a base menor: ");
//        double baseMenor = entrada.nextDouble();
//        System.out.print("Informe a altura: ");
//        double altura = entrada.nextDouble();
//        double area = (baseMaior + baseMenor) * altura / 2;
//        System.out.println("a area é: " + area);


//        System.out.println("Calculo da área do paralelogramo");
//        System.out.print("informe a base: ");
//        double baseParalelogramo = scanner.nextDouble();
//        System.out.print("informe a altura: ");
//        double alturaParlelogramo = scanner.nextDouble();
//        double areaParalelogaramo = baseParalelogramo * alturaParlelogramo;
//        System.out.println("A área do paralelogramo é: " + areaParalelogaramo);
//

//        System.out.println("\nCálculo da área do triângulo");
//        System.out.print("informe a base: ");
//        double baseTriangulo = scanner.nextDouble();
//        System.out.print("informe a altura: ");
//        double alturaTriangulo= scanner.nextDouble();
//        double areaTriangulo = (baseTriangulo * alturaTriangulo) /2;
//        System.out.println("A área do triangulo é: " + areaTriangulo);
//

//        System.out.println("\nCalculo da área do círculo");
//        System.out.print("informe o raio: ");
//        double raio = scanner.nextDouble();
//        double areaCirculo = Math.PI * Math.pow(raio, 2);
//        System.out.println("á area do circulo é: " + areaCirculo);

//        exercicio 5
//        System.out.print("informe o valor: ");
//        double valor = entrada.nextDouble();
//        if(valor > 0)
//            System.out.println("o valor informado é positivo");
//        else if(valor < 0)
//            System.out.println("o valor informado é negativo");
//        else
//            System.out.println("o valor informado é neutro");

//        exercicio 6
//        System.out.print("Digite três valores diferentes: ");
//        double valor1 = scanner.nextDouble();
//        double valor2 = scanner.nextDouble();
//        double valor3 = scanner.nextDouble();
//        double maxValue = Math.max(valor1, Math.max(valor2, valor3));
//        System.out.println("o maior valor é: " + maxValue);

//        exercicio 6.1
//        System.out.println("Digite o primeiro valor");
//        double valor1 = entrada.nextDouble();
//        System.out.println("Digite o segundo valor");
//        double valor2 = entrada.nextDouble();
//        System.out.println("Digite o terceiro valor");
//        double valor3 = entrada.nextDouble();
//        System.out.println("Digite o quarto valor");
//        double valor4 = entrada.nextDouble();
//        if(valor1 > valor2 && valor1 > valor3 && valor1 > valor4){
//            System.out.println("O maior valor digitado é: " + valor1);
//        }else if(valor2 > valor3 && valor2 > valor4){
//            System.out.println("O maior valor digitado é: " + valor2);
//        }else if(valor3 > valor4){
//            System.out.println("O maior valor digitado é: " + valor3);
//        }else{
//            System.out.println("O maior valor digitado é: " + valor4);
//        }


//        exercicio 7
//        System.out.print("informe três valores distintos: ");
//        int valor1 = scanner.nextInt();
//        int valor2 = scanner.nextInt();
//        int valor3 = scanner.nextInt();
//
//        int soma;
//
//        if (valor1 < valor2 && valor1 < valor3) {
//            soma = valor2 + valor3;
//        } else if (valor2 < valor3) {
//            soma = valor1 + valor3;
//        } else {
//            soma = valor2 + valor1;
//        }
//
//        System.out.println("a soma dos valores é: " + soma);


//        exercicio 7.1
//        System.out.println("informe o primeiro valor ");
//        double valor1 = scanner.nextDouble();
//        System.out.println("informe o segundo valor ");
//        double valor2 = scanner.nextDouble();
//        System.out.println("informe o terceiro valor ");
//        double valor3 = scanner.nextDouble();
//        System.out.println("informe o quarto valor ");
//        double valor4 = scanner.nextDouble();
//        System.out.println("informe o quinto valor ");
//        double valor5 = scanner.nextDouble();
//
//        double primeiroValorMaior = Math.max(valor1,valor2);
//        double segundoValorMaior = Math.max(valor3,valor4);
//
//        if (primeiroValorMaior < valor5){
//            primeiroValorMaior = valor5;
//        }else if(segundoValorMaior < valor5){
//            segundoValorMaior = valor5;
//        }
//
//        double somaMaiorValor = primeiroValorMaior + segundoValorMaior;
//        System.out.println("o maior valor dos cinco é: "+somaMaiorValor);

//        exercicio 8
//        int valor1 = 0;
//        int valor2 = 0;
//        do{
//            System.out.println("Informe um valor");
//            valor1 = sc.nextInt();
//            valor2 = sc.nextInt();
//        }while(valor2<=0);
//        double resultado = valor1/valor2;
//        System.out.println("Resultado: "+resultado);

//        exercicio 9
//        double soma = 0;
//        int quantidade = 10;
//        System.out.println("Digite " + quantidade + " valores:");
//        for (int i = 1; i <= quantidade; i++) {
//            System.out.print("Valor " + i + ": ");
//            double valor = entrada.nextDouble();
//            soma += valor;
//        }
//        double media = soma / quantidade;
//        System.out.println("\nA média aritmética é: " + media);


//        exercicio 10
//        double n1, n2, n3, n4, media;
//        System.out.print("digite a primeira média: ");
//        n1 = scanner.nextDouble();
//        System.out.print("digite a segunda média: ");
//        n2 = scanner.nextDouble();
//        System.out.print("digite a terceira média: ");
//        n3 = scanner.nextDouble();
//        System.out.print("digite a quarta média: ");
//        n4 = scanner.nextDouble();
//        media = (n1+n2+n3+n4) / 4;
//        System.out.println("a média do semestre " + media);
//        if(media >= 6){
//            System.out.println("Parabens você foi aprovado");
//        }else{
//            System.out.println("forte abraço");
//        }

//  exercicio 11
//    int contador = 30;
//    for(int i = 0; contador >= i; contador--){
//        System.out.println(contador);
//        if(contador == 0){
//            System.out.println("Explodiu");
//        }
//    }
//}

//  exercicio 12
//        for(int i = 10; i > 0; i--){
//            System.out.println(i);
//        }

//   exercicio 13
//        int nUm, nDois, count = 0;
//        double media = 0;
//        System.out.print("adicione o primeiro numero  menor que o segundo: ");
//        nUm = scanner.nextInt();
//        System.out.print("adicione o segundo numero: ");
//        nDois = scanner.nextInt();
//        do{
//            count ++;
//            media += nUm;
//            nUm++;
//        }while(nDois >= nUm);
//        media = media / count;
//        System.out.println("A média é: " + media);

//  exercicio 14
//        double n1, n2, n3, n4, n5, n6, media = 0,aprovados = 0, reprovados = 0;
//        String resp = "sim";
//        while(resp.equals("sim")){
//            System.out.println("digite a Primeira nota");
//            n1 = scanner.nextDouble();
//            System.out.println("digite a segunda nota");
//            n2 = scanner.nextDouble();
//            System.out.println("digite a terceira nota");
//            n3 = scanner.nextDouble();
//            System.out.println("digite a quarta nota");
//            n4 = scanner.nextDouble();
//            System.out.println("digite a quinta nota");
//            n5 = scanner.nextDouble();
//            System.out.println("digite a sextaa nota");
//            n6 = scanner.nextDouble();
//            media = (n1+n2+n3+n4+n5+n6) / 6;
//            System.out.println("a média foi de: " + media);
//            if(media <= 6.5) {
//                System.out.println("faz o L");
//                reprovados++;
//            }else {
//                System.out.println("aprovation");
//                aprovados++;
//            }
//            System.out.println("deseja calcular outra média? ");
//             resp = scanner.next();
//        }
//
//        System.out.println("a quantidade de alunos aprovados foi: " + aprovados);
//        System.out.println("a quantidade de alunos reprovados foi: " + reprovados);


//  exercicio 16
//        System.out.println("\nVamos calcular os votos! \nDigite o total de eleitores: ");
//        int totalEleitores = entrada.nextInt();
//        System.out.println("Digite o percentual de votos brancos");
//        double pBrancos = entrada.nextDouble();
//        System.out.println("Digite o percentual de votos válidos: ");
//        double pValidos = entrada.nextDouble();
//        System.out.println("Digite o percentual de votos nulos: ");
//        double pNulos = entrada.nextDouble();
//        double vBrancos = totalEleitores * (pBrancos / 100);
//        double vValidos = totalEleitores * (pValidos / 100);
//        double vNulos = totalEleitores * (pNulos / 100);
//        System.out.println("\nQuantidade de votos de cada categoria: ");
//        System.out.println("Votos brancos: " + vBrancos);
//        System.out.println("Votos válidos: " + vValidos);
//        System.out.println("Votos nulos: " + vNulos);

//        exercicio 17
//        double fabrica, distribuidora, custoFinal;
//        System.out.print("informe o valor do carro na fabrica: ");
//        fabrica = scanner.nextDouble();
//        System.out.print("informe o valor cobrado pela distribuidora: ");
//        distribuidora = scanner.nextDouble();
//        fabrica += fabrica * 0.28;
//        distribuidora = distribuidora * 1.45;
//        custoFinal = fabrica + distribuidora;
//        System.out.println("O Consumidor final pagará: " + custoFinal);


//        exercicio 18
//        double salarioFixo = 5000.00;
//        System.out.println("Informe o número de carros vendidos: ");
//        int carrosVendidos = scanner.nextInt();
//        System.out.println("Informe o valor total das vendas: ");
//        double valorTotalVendas = scanner.nextDouble();
//        System.out.println("Informe a comissão fixa por carro vendido: ");
//        double comissaoFixaPorCarro = scanner.nextDouble();
//        double comissaoTotalPorCarros = carrosVendidos * comissaoFixaPorCarro;
//        double comissaoPercentualSobreVendas = valorTotalVendas * 0.05;
//        double salarioFinal = salarioFixo + comissaoTotalPorCarros + comissaoPercentualSobreVendas;
//        System.out.println("Detalhes do salário do vendedor:");
//        System.out.println("Salário fixo mensal: R$ " + salarioFixo);
//        System.out.println("Número de carros vendidos: " + carrosVendidos);
//        System.out.println("Comissão fixa por carro vendido: R$ " + comissaoFixaPorCarro);
//        System.out.println("Comissão total por carros vendidos: R$ " + comissaoTotalPorCarros);
//        System.out.println("5% do valor total das vendas: R$ " + comissaoPercentualSobreVendas);
//        System.out.println("Salário final do vendedor: R$ " + salarioFinal);

//        exercicio 19
//        System.out.println("Digite o primeiro numero: ");
//        double num1 = leitor.nextDouble();leitor.nextLine();
//
//        System.out.println("Digite o segundo numero: ");
//        double num2 = leitor.nextDouble();leitor.nextLine();
//
//        System.out.println("Digite o terceiro numero: ");
//        double num3 = leitor.nextDouble();leitor.nextLine();
//
//        if (num1 < (num2 + num3) && num2 < (num1 + num3) && num3 < (num2 + num1)){
//            System.out.println("Foi possível formar um triângulo! ");
//            return;
//        }
//        System.out.println("Não foi possível formar um triângulo! ");

//        exercicio 22
//        int k=0;
//            for (int i = 1; i <= 20; i++) {
//            System.out.print("(" + i);
//            for (int j = 1; j <= 10 ; j++) {
//                k++;
//                    System.out.print(", " + k);
//                if (k == i*10) {
//                    System.out.print(")");
//                    System.out.println();
//                }
//            }
//        }


//        exercicio 23
//        for (int i = 1; i <= 20; i++) {
//            System.out.print("(" + i + ", ");
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(j);
//                if (j == 10) {
//                    System.out.print(")");
//                    System.out.println();
//                }
//            }
//        }

//        exercicio 24
//        System.out.println("Informe quantas horas você trabalhou esse mês");
//        int horasTrabalhadas = scanner.nextInt();
//
//        System.out.println("Informe seu salário por hora");
//        double salarioHora = scanner.nextDouble();
//
//        if (horasTrabalhadas < 160) {
//            throw new RuntimeException("Um trabalhador não pode ter menos que 160 horas por mês");
//        }
//
//        int horasNormais = 160;
//        int horasExtras = horasTrabalhadas - horasNormais;
//
//        double salarioHoraExtra = salarioHora * 1.5;
//        double valorHorasExtras = horasExtras * salarioHoraExtra;
//
//        double salarioTotal = (horasNormais * salarioHora) + valorHorasExtras;
//
//        System.out.println("Seu salário deve ser de " + salarioTotal);


//        exercicio 25
//        String[] array = new String[12];
//        System.out.println("Informe doze elementos (letras ou números):");
//        for (int i = 0; i < 12; i++) {
//            array[i] = scanner.next();
//        }
//
//        // Saída 1: Inversão simples
//        String[] invertidoSimples = new String[12];
//        for (int i = 0; i < 12; i++) {
//            invertidoSimples[i] = array[11 - i];
//        }
//        System.out.println("Saída 1: Inversão simples");
//        for (String elemento : invertidoSimples) {
//            System.out.print(elemento + " ");
//        }
//        System.out.println();
//
//        String[] numeros = new String[12];
//        String[] letras = new String[12];
//        int numCount = 0;
//        int letraCount = 0;
//
//        for (String elemento : array) {
//            if (Character.isDigit(elemento.charAt(0))) {
//                numeros[numCount++] = elemento;
//            } else {
//                letras[letraCount++] = elemento;
//            }
//        }
//
//        String[] numerosInvertidos = new String[numCount];
//        for (int i = 0; i < numCount; i++) {
//            numerosInvertidos[i] = numeros[numCount - 1 - i];
//        }
//
//        String[] letrasInvertidas = new String[letraCount];
//        for (int i = 0; i < letraCount; i++) {
//            letrasInvertidas[i] = letras[letraCount - 1 - i];
//        }
//        System.out.println("Saída 2: Inversão separada por tipo");
//        for (String numero : numerosInvertidos) {
//            System.out.print(numero + " ");
//        }
//        System.out.print(" - ");
//        for (String letra : letrasInvertidas) {
//            System.out.print(letra + " ");
//        }
//        System.out.println();
    }
}