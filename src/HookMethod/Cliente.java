package HookMethod;

public abstract class Cliente {

    private String nome;
    private double compra;

    //o método abaixo vai calcular o valor final de uma compra de supermercado aplicando o desconto do cliente
    public double calcularVenda() {
        return calcularDesconto() * compra;
    }

    protected abstract double calcularDesconto();



    public Cliente(String nome, double compra) {
        this.nome = nome;
        this.compra = compra;
    }
    public String getNome() {
        return nome;
    }
    public double getCompra() {
        return compra;
    }

}
