package Observer;

//O padrão observer foi implementada de modo a ser utilizado para verificar se caixas estão: ABERTOS,FECHADOS ou EM MANUTENÇÃO
//esse padrão é importante para saber a sua disponibilidade

public class Main {

    public static void main(String[] args) {

        Service CaixaAberto = new Service("CaixaAberto");
        Service CaixaFechado = new Service("CaixaFechado");
        Service CaixaEmManutenção = new Service("CaixaEmManutenção");



        Device Caixa1 = new Device("Caixa 1");
        Device Caixa2 = new Device("Caixa 2");
        Device Caixa3 = new Device("Caixa 3");
        Device Caixa4 = new Device("Caixa 4");
        Device Caixa5 = new Device("Caixa 5");

        CaixaAberto.addObserver(Caixa1);
        CaixaAberto.addObserver(Caixa2);
        CaixaFechado.addObserver((Caixa3));
        CaixaEmManutenção.addObserver((Caixa4));
        CaixaAberto.addObserver(Caixa5);


        CaixaAberto.notify("Caixa aberto e apto para atender");
        CaixaFechado.notify("Caixa está fechado");
        CaixaEmManutenção.notify("Caixa em Manutenção");
    }
}
