package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private final double velocidadMaxima;
    private final TipoMoto tipoMoto;

    public Moto(String placa, String modelo, Propietario propietario, Tarifa tarifa, double velocidadMaxima, TipoMoto tipoMoto) {
        super(placa, modelo, propietario, tarifa);
        this.tipoMoto = tipoMoto;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    
}
