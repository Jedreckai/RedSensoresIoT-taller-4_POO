// HERENCIA:
public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String id, String zona) {
        super(id, zona); // reutiliza el constructor de Sensor
    }

    // SOBREESCRITURA
    @Override
    public double leer() {
        double valor = 18 + Math.random() * 10; // simula 18-28 °C
        setUltimaLectura(valor);
        return valor;
    }
}
 