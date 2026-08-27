// ABSTRACCIÓN: define el "contrato"
public abstract class Sensor {
    // ENCAPSULACIÓN: atributos privados
    private String id;
    private String zona;
    private double ultimaLectura;

    public Sensor(String id, String zona) {
        this.id = id;
        this.zona = zona;
    }

    public String getId() { return id; }
    public String getZona() { return zona; }
    public double getUltimaLectura() { return ultimaLectura; }

    // protected: solo las subclases pueden actualizar la lectura
    protected void setUltimaLectura(double valor) {
        this.ultimaLectura = valor;
    }

    // Método abstracto: cada subclase DEBE implementarlo a su manera
    public abstract double leer();
}