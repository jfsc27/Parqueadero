package co.edu.uniquindio.poo;

/**
* Clase Vehiculo.
*
*/
public abstract class Vehiculo {

    /**
     * Atributos.
     *
     */
    private final String placa;
    private final String modelo;
    private Propietario propietario;
    private final Tarifa tarifa;

    /**
     * Constructor.
     *
     */
    public Vehiculo(String placa, String modelo, Propietario propietario, Tarifa tarifa) {
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
        this.tarifa = tarifa;
    }

    /**
     * Getters
     *
     */
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    
}
