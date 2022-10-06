package NullObject.Produto;

public class RealProduto extends AbstractProduto {

    public RealProduto(String nome,String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCategoria() {return categoria;
    }
}
