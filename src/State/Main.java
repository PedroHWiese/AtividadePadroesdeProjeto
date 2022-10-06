package State;

import State.estado.CaixaOcupado;
import State.estado.CaixaParado;
import State.estado.Estado;

//o padrão state foi implementado de modo a fazer a troca de estado de um caia, que pode estar parado ou ocupado

public class Main {
    public static void main(String[] args) {

        //criação do objeto que altera o estado do caixa
        Estado estado = new Estado();

        CaixaParado caixaParado = new CaixaParado();
        CaixaOcupado caixaOcupado = new CaixaOcupado();


        caixaParado.fazerAcao(estado);

        caixaOcupado.fazerAcao(estado);

        caixaParado.fazerAcao(estado);

    }
}
