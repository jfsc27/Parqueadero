package co.edu.uniquindio.poo;

/**
* Clase Puesto.
*
*/
public class Puesto {

    /**
     * Atributos.
     *
     */

    private final PosicionPuesto puestos;
    private final Vehiculo vehiculo;

    /**
     * Constructor.
     *
     */

    public Puesto(PosicionPuesto puestos, Vehiculo vehiculo) {
        this.puestos = puestos;
        this.vehiculo = vehiculo;
    }

    /**
     * Getters.
     *
     */
    
    public PosicionPuesto getPuestos() {
        return puestos;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
}
