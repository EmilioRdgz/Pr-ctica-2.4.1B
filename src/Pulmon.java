public class Pulmon {
    private double capacidadPulmonar;
    private double cantidadOxigeno;
    private String estado;

    public Pulmon(double capacidadPulmonar, double cantidadOxigeno, String estado) {
        this.capacidadPulmonar = capacidadPulmonar;
        this.cantidadOxigeno = cantidadOxigeno;
        this.estado = estado;
    }

    public double getCapacidadPulmonar() {
        return capacidadPulmonar;
    }

    public double getCantidadOxigeno() {
        return cantidadOxigeno;
    }

    public String getEstado() {
        return estado;
    }
}

