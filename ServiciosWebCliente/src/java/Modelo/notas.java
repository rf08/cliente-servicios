package Modelo;

public class notas {

    public notas() {
    }
    
    public String insetar(int nota) {
        WS.Insertar_Service service = new WS.Insertar_Service();
        WS.Insertar port = service.getInsertarPort();
        return port.insetar(nota);
    }

    public int generarPromedio() {
        WS1.Promedio_Service service = new WS1.Promedio_Service();
        WS1.Promedio port = service.getPromedioPort();
        return port.generarPromedio();
    }

    public String maxyMin() {
        WS2.MaximoyMinimo_Service service = new WS2.MaximoyMinimo_Service();
        WS2.MaximoyMinimo port = service.getMaximoyMinimoPort();
        return port.maxyMin();
    }
    
}
