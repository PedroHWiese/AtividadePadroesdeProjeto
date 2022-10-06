package State.estado;

public class CaixaOcupado implements EstadoInterface {

    @Override
    public void fazerAcao(Estado estado) {
        System.out.println("Caixa esta ocupado");

        estado.setEstado(this);
    }
}
