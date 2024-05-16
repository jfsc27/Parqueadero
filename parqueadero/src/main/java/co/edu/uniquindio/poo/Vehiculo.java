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
    private double tarifa;
    private final String placa;
    private final String modelo;
    private Propietario propietario;

    /**
     * Constructor.
     *
     */
    public Vehiculo(String placa, String modelo, Propietario propietario, double tarifa) {
        this.placa = placa;
        this.tarifa = tarifa;
        this.modelo = modelo;
        this.propietario = propietario;
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

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    
}
