package Strategy.Estocador;

import Strategy.Produto.Produto;

public class PRATELEIRA implements TipoEstoque {
    public String estocar(Produto produto){
        return produto.categoria="PRATELEIRA";
    }
}
