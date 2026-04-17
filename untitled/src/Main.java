import Models.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade inicial em estoque: ");
        int estoqueInicial = sc.nextInt();

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = sc.nextInt();

        Produto produto = new Produto(nome, preco, estoqueInicial);

        produto.exibirInformacoes();

        produto.realizarVenda(quantidadeVendida);

        produto.exibirInformacoes();

        sc.close();
    }
}
