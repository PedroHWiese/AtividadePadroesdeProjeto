package Strategy;

import Strategy.Estocador.EstocadorDeProdutos;
import Strategy.Estocador.FREEZER;
import Strategy.Estocador.PRATELEIRA;
import Strategy.Produto.Produto;

//método Strategy
//foi utilizado como cadastramento de vários produtos no supermercado, utilizando do padrão para termos o cadastro de produtos de forma unificada variando apenas
//o local de estoque


public class Main {
    public static void main(String[] args){

        //cadastro de dois produtos novos
        Produto produto1 = new Produto("Leite","5");
        Produto produto2 = new Produto("Arroz","3");

        //criação do objeto que faz a estocagem de produtos na classe
        EstocadorDeProdutos estocadorDeProdutos = new EstocadorDeProdutos();

        //impressao do local aonde os dois produtos foram alocados
        estocadorDeProdutos.estocar(produto1, new FREEZER() );
        estocadorDeProdutos.estocar(produto2, new PRATELEIRA() );

        System.out.println("O produto "+ produto1.nome +" está estocado em "+ produto1.categoria);
        System.out.println("O produto "+ produto2.nome +" está estocado em "+ produto2.categoria);




    }
}