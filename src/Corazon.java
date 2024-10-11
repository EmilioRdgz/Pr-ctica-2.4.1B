public class Corazon {
    private int frecuenciaCardiaca;
    private double tamaño;
    private String estado;

    public Corazon(int frecuenciaCardiaca, double tamaño, String estado) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.tamaño = tamaño;
        this.estado = estado;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getEstado() {
        return estado;
    }
}

