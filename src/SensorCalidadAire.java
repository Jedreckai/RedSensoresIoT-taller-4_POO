public class SensorCalidadAire extends Sensor {

    public SensorCalidadAire(String id, String zona) {
        super(id, zona);
    }

    @Override
    public double leer() {
        double valor = Math.random() * 500; // simula índice AQI 0-500
        setUltimaLectura(valor);
        return valor;
    }
}
