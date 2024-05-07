package co.edu.uniquindio.poo;

/**
* Clase enumeracion Tarifa.
*
*/
public enum Tarifa {
    MOTO (1000.0),
    CARRO (1800.0);

    final double valorTarifa;
    private Tarifa (double valorTarifa){
        this.valorTarifa = valorTarifa;
    }
    public double getValorTarifa() {
        return valorTarifa;
    }

    
}
