package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

/**
* Clase Registro
*
*/
public class Registro {

    /**
     * Atributos.
     *
     */
    private final LocalDateTime entrada;
    private final LocalDateTime salida;
    private final Vehiculo vehiculo;
    private final Puesto puesto;

    /**
     * Constructor.
     *
     */
    public Registro(LocalDateTime entrada, LocalDateTime salida, Vehiculo vehiculo, Puesto puesto) {
        
        this.entrada = entrada;
        this.salida = salida;
        this.vehiculo = vehiculo;
        this.puesto = puesto;

    }


    /**
     * Getters.
     *
     */
    
     public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    private int valorParqueo(){
        int horaEntrada = getEntrada().getHour();
        int minutoEntrada = getEntrada().getMinute() / 60;
        int tiempoEntrada = horaEntrada + minutoEntrada;
        int horaSalida = getSalida().getHour();
        int minutoSalida = getSalida().getMinute();
        int tiempoSalida = horaSalida + minutoSalida;
        int tiempoTotal = tiempoSalida-tiempoEntrada;
        int tarifaTotal = (int) (tiempoTotal * vehiculo.getTarifa());
        return tarifaTotal;
    }
}
