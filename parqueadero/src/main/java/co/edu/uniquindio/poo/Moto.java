package co.edu.uniquindio.poo;

/**
* Clase moto que hereda de vehiculo
*
*/

public class Moto extends Vehiculo{

    /**
     * Atributos.
     *
     */

    private final double velocidadMaxima;
    private final TipoMoto tipoMoto;

    /**
     * Constructor.
     *
     */

    public Moto(String placa, String modelo, Propietario propietario, double tarifa, double velocidadMaxima, TipoMoto tipoMoto) {
        super(placa, modelo, propietario, tarifa);
        this.tipoMoto = tipoMoto;
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Getters
     *
     */
    
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    
}
