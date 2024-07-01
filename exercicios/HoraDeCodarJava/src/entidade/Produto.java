package entidade;

public class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularValorVenda() {
        return quantidade * precoUnitario;
    }

    public double calcularDesconto() {
        double desconto;
        if (quantidade <= 5) {
            desconto = 0.02;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }
        return calcularValorVenda() * desconto;
    }

    public double calcularImposto() {
        return calcularValorVenda() * 0.20;
    }

    public double calcularTotalAPagar() {
        return calcularValorVenda() - calcularDesconto() + calcularImposto();
    }

    public void exibirRecibo() {
        System.out.println("Recibo:");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Quantidade Adquirida: " + quantidade);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Valor da Venda: " + calcularValorVenda());
        System.out.println("Desconto: " + calcularDesconto());
        System.out.println("Imposto: " + calcularImposto());
        System.out.println("Total a Pagar: " + calcularTotalAPagar());
    }
}
