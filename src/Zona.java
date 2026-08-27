import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;

    // AGREGACIÓN: los Sensor existen de forma independiente a la Zona
    private List<Sensor> sensores = new ArrayList<>();

    public Zona(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public String getNombre() { return nombre; }
    public List<Sensor> getSensores() { return sensores; }
}