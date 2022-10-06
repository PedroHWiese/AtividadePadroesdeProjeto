package State.estado;

public class Estado {

    private EstadoInterface estado;

    public Estado(){
        estado = null;
    }

    public EstadoInterface getEstado() {
        return estado;
    }

    public void setEstado(EstadoInterface estado) {
        this.estado = estado;
    }
}
