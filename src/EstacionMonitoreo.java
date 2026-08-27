import java.util.ArrayList;
import java.util.List;

public class EstacionMonitoreo {
    private String nombre;

    private List<Zona> zonas = new ArrayList<>();

    // ASOCIACIÓN: el ServicioEnvioDatos existe de forma independiente,
    // se le integra a la estación y podría compartirse con otras estaciones.
    private ServicioEnvioDatos servicioEnvio;

    public EstacionMonitoreo(String nombre, ServicioEnvioDatos servicioEnvio) {
        this.nombre = nombre;
        this.servicioEnvio = servicioEnvio;
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public void monitorear() {
        for (Zona zona : zonas) {
            for (Sensor sensor : zona.getSensores()) {
                double valor = sensor.leer();
                Lectura lectura = new Lectura(sensor.getId(), valor, zona.getNombre());
                servicioEnvio.enviar(lectura);
            }
        }
    }
}