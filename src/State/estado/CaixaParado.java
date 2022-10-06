package State.estado;

public class CaixaParado implements EstadoInterface {


    @Override
    public void fazerAcao(Estado estado) {
        System.out.println("Caixa esta Vazio");
        estado.setEstado(this);
    }
}
