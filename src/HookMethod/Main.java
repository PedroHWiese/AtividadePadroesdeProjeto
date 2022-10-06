package HookMethod;

//padrão hookMethod
//O padrão foi utilizado com o conceito de que existem clientes com cadastro ligado ao supermercado e clientes sem,
//clientes que são cadastrados tem direito a um desconto maior em suas compras


public class Main {
    public static void main(String[] args) {

        //craiação de clientes com e sem cadastro
        Cliente pedro = new ClienteCAD("Pedro", 1300);
        Cliente paulo = new ClienteSemCAD("Paulo", 1300);

        //prints do dados
        System.out.println("O cliente "+ pedro.getNome() + " fez uma compra no total de " +pedro.getCompra()+ " que após os descontos fica " +pedro.calcularVenda());
        System.out.println("O cliente "+ paulo.getNome() + " fez uma compra no total de " +paulo.getCompra()+ " que após os descontos fica " +paulo.calcularVenda());

    }
}
