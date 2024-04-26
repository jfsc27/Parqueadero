package co.edu.uniquindio.poo;

public class Puesto {
    private final PosicionPuesto puestos;
    private final Vehiculo vehiculo;

    public Puesto(PosicionPuesto puestos, Vehiculo vehiculo) {
        this.puestos = puestos;
        this.vehiculo = vehiculo;
    }

    public PosicionPuesto getPuestos() {
        return puestos;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
}
