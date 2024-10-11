public class Main {
    public static void main(String[] args) {
        // Crear partes del cuerpo
        Corazon corazon = new Corazon(70, 0.3, "Sano");
        Pulmon pulmon = new Pulmon(5.5, 98.7, "Normal");
        Higado higado = new Higado("Desintoxicación", 100, "Funcional");
        Apendice apendice = new Apendice(9.0, "Sano", true);

        // Crear el cuerpo humano
        CuerpoHumano cuerpo = new CuerpoHumano(corazon, pulmon, higado, apendice);

        // Utilizar atributos de las partes
        System.out.println("Frecuencia cardíaca: " + cuerpo.getCorazon().getFrecuenciaCardiaca() + " bpm");
        System.out.println("Capacidad pulmonar: " + cuerpo.getPulmon().getCapacidadPulmonar() + " litros");
        System.out.println("Función del hígado: " + cuerpo.getHigado().getFuncion());
        System.out.println("Longitud del apéndice: " + cuerpo.getApendice().getLongitud() + " cm");
        System.out.println("Estado del apéndice: " + cuerpo.getApendice().getEstado());
        System.out.println("Función vestigial del apéndice: " + cuerpo.getApendice().isFuncionVestigial());
    }
}
