package Models;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void realizarVenda(int quantidadeVendida) {
        if (quantidadeVendida > quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            this.quantidadeEmEstoque -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + quantidadeEmEstoque + " unidades");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque antes da venda: " + quantidadeEmEstoque + " unidades");
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
