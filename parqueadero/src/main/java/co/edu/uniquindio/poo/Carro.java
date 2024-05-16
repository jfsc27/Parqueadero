package co.edu.uniquindio.poo;
/**
 * Clase carro que hereda de vehiculo.
 *
 */
public class Carro extends Vehiculo {

    /**
     * Constructor.
     *
     */
    public Carro(String placa, String modelo, Propietario propietario, double tarifa) {
        super(placa, modelo, propietario, tarifa);
    }
    
}
