public class Main {
    public static void main(String[] args) {
        // Cree sensores
        Sensor s1 = new SensorTemperatura("T1", "Bodega");
        Sensor s2 = new SensorHumedad("H1", "Bodega");
        Sensor s3 = new SensorCalidadAire("A1", "Oficina");
        Sensor s4 = new SensorLuminosidad("L1", "Oficina"); // reto final integrado sin tocar el for polimórfico

        Zona bodega = new Zona("Bodega");
        bodega.agregarSensor(s1);
        bodega.agregarSensor(s2);

        Zona oficina = new Zona("Oficina");
        oficina.agregarSensor(s3);
        oficina.agregarSensor(s4);

        ServicioEnvioDatos servicio = new ServicioEnvioDatos();
        EstacionMonitoreo estacion = new EstacionMonitoreo("Estacion Central", servicio);
        estacion.agregarZona(bodega);
        estacion.agregarZona(oficina);

        estacion.monitorear();
    }
}