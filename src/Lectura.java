// dato simple: representa una medición de un sensor
public class Lectura {
    private String sensorId;
    private double valor;
    private String zona;

    public Lectura(String sensorId, double valor, String zona) {
        this.sensorId = sensorId;
        this.valor = valor;
        this.zona = zona;
    }

    public String getSensorId() { return sensorId; }
    public double getValor() { return valor; }
    public String getZona() { return zona; }

    @Override
    public String toString() {
        return "[" + zona + "] " + sensorId + " -> " + valor;
    }
}