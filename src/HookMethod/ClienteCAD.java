package HookMethod;

//as classes clienteCAD e ClienteSemCAD são a mesma classe, elas extende da classe principal Cliente e a suas única diferenã é o retorno do desconto que tem um pequena variação

public class ClienteCAD extends Cliente {

    public ClienteCAD(String nome, double compra){
        super(nome,compra);
    }

    @Override
    protected double calcularDesconto() {
        return 0.90;
    }
}
