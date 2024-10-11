// Clase que representa el cuerpo humano, el TODO en esta estructura
public class CuerpoHumano {
    // Atributos que representan las partes del cuerpo
    private Corazon corazon;  // Instancia de la clase Corazon
    private Pulmon pulmon;     // Instancia de la clase Pulmon
    private Higado higado;     // Instancia de la clase Higado
    private Apendice apendice; // Instancia de la clase Apendice

    // Constructor que inicializa las partes del cuerpo
    public CuerpoHumano(Corazon corazon, Pulmon pulmon, Higado higado, Apendice apendice) {
        this.corazon = corazon;
        this.pulmon = pulmon;
        this.higado = higado;
        this.apendice = apendice;
    }

    // Métodos de acceso (getters) para obtener las partes del cuerpo
    public Corazon getCorazon() {
        return corazon; // Devuelve la instancia de Corazon
    }

    public Pulmon getPulmon() {
        return pulmon; // Devuelve la instancia de Pulmon
    }

    public Higado getHigado() {
        return higado; // Devuelve la instancia de Higado
    }

    public Apendice getApendice() {
        return apendice; // Devuelve la instancia de Apendice
    }
}
