package Strategy.Estocador;

import Strategy.Produto.Produto;

public class FREEZER implements TipoEstoque {
    public String estocar(Produto produto){
        return produto.categoria="FREEZER";
    }
}
