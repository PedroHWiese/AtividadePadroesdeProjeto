package Strategy.Estocador;


import Strategy.Produto.Produto;

public class EstocadorDeProdutos {

  public String estocar(Produto produto, TipoEstoque tipoEstoque){
        return tipoEstoque.estocar(produto);
      }
  }

