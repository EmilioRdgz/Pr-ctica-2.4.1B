public class Higado {
    private String funcion;
    private int nivelEnzimas;
    private String estado;

    public Higado(String funcion, int nivelEnzimas, String estado) {
        this.funcion = funcion;
        this.nivelEnzimas = nivelEnzimas;
        this.estado = estado;
    }

    public String getFuncion() {
        return funcion;
    }

    public int getNivelEnzimas() {
        return nivelEnzimas;
    }

    public String getEstado() {
        return estado;
    }
}

