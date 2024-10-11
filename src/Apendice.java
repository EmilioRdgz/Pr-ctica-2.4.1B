public class Apendice {
    private double longitud;
    private String estado;
    private boolean funcionVestigial;

    public Apendice(double longitud, String estado, boolean funcionVestigial) {
        this.longitud = longitud;
        this.estado = estado;
        this.funcionVestigial = funcionVestigial;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getEstado() {
        return estado;
    }

    public boolean isFuncionVestigial() {
        return funcionVestigial;
    }
}

