public class SensorHumedad extends Sensor {

    public SensorHumedad(String id, String zona) {
        super(id, zona);
    }

    @Override
    public double leer() {
        double valor = 30 + Math.random() * 50; // simula 30-80 % humedad
        setUltimaLectura(valor);
        return valor;
    }
}
