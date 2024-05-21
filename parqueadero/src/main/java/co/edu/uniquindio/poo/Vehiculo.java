package co.edu.uniquindio.poo;

/**
 * La clase abstracta Vehiculo representa un vehículo genérico.
 * Contiene información básica como la placa, el modelo y el propietario del vehículo.
 * Esta clase debe ser extendida por tipos específicos de vehículos, que deben implementar el método abstracto getTarifaPorHora().
 */
public abstract class Vehiculo {

    // Placa del vehículo.
    private final String placa;
    // Modelo del vehículo.
    private final String modelo;
    // Propietario del vehículo.
    private final Propietario propietario;

    /**
     * Constructor de la clase Vehiculo.
     *
     * @param placa Placa del vehículo.
     * @param modelo Modelo del vehículo.
     * @param propietario Propietario del vehículo.
     */
    public Vehiculo(String placa, String modelo, Propietario propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    /**
     * Obtiene la placa del vehículo.
     *
     * @return La placa del vehículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el propietario del vehículo.
     *
     * @return El propietario del vehículo.
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * Método abstracto para obtener la tarifa por hora del vehículo.
     * Este método debe ser implementado por las clases que extiendan Vehiculo.
     *
     * @return La tarifa por hora del vehículo.
     */
    public abstract double getTarifaPorHora();
}

 