package NullObject;

import NullObject.Produto.AbstractProduto;
import NullObject.Produto.NullProduto;
import NullObject.Produto.RealProduto;

//Data Acess Object
public class ProdutoDAO {

    //itens cadastrados e que estão no banco de dados
    //serão usados para verificar se são existentes ou se ainda estão dentro do banco

    public static final String[] nomes = {"Leite","Arroz"};
    public static final String[] categorias = {"FREEZER","PRATELEIRA"};


    public static AbstractProduto getProduto(String nome,String categoria) {
        for (int i = 0; i < nomes.length; i++)
            if (nomes[i].equalsIgnoreCase(nome) && categorias[i].equalsIgnoreCase((categoria)))
                return new RealProduto(nome,categoria);

        return new NullProduto();
    }





}
