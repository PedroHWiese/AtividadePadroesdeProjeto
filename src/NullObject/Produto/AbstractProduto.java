package NullObject.Produto;


//produto abstrato para a criação do Real e do Null (funciona como um molde para as classes)
public abstract class AbstractProduto {

    protected String nome;
    protected String categoria;

    public abstract String getNome();

    public abstract String getCategoria();


}
