package HookMethod;

public class ClienteSemCAD extends Cliente {

    public ClienteSemCAD(String nome, double compra){
        super(nome,compra);
    }


    @Override
    protected double calcularDesconto() {
        return 0.95;
    }
}
