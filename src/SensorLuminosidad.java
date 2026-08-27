// RETO FINAL:
public class SensorLuminosidad extends Sensor {

    public SensorLuminosidad(String id, String zona) {
        super(id, zona);
    }

    @Override
    public double leer() {
        double valor = Math.random() * 1000; // simula 0-1000 lux
        setUltimaLectura(valor);
        return valor;
    }
}