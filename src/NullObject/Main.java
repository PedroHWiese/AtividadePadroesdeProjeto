package NullObject;

import NullObject.Produto.AbstractProduto;

//o padrão null.object foi implementado com a intenção que no estoque de um supermercado pode haver itens que estão faltando ou estoques que estão indisponíveis para o uso


public class Main {
    public static void main(String[] args) {

        AbstractProduto produto1 = ProdutoDAO.getProduto("Leite","FREEZER");
        AbstractProduto produto2 = ProdutoDAO.getProduto("Farofa","PRATELEIRA");
        AbstractProduto produto3 = ProdutoDAO.getProduto("Arroz","CARRO");




        System.out.println("Lista de Produtos");
        System.out.println(produto1.getNome());
        System.out.println(produto2.getNome());
        System.out.println(produto3.getNome());
        System.out.println("-----------------------");


        System.out.println("Lista de Estoques");
        System.out.println(produto1.getCategoria());
        System.out.println(produto2.getCategoria());
        System.out.println(produto3.getCategoria());
        System.out.println("-----------------------");



    }
}
