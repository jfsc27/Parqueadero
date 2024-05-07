package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
* Clase Registro
*
*/
public class Registro {

    /**
     * Atributos.
     *
     */
    private final double horaEntrada;
    private final double horaSalida;
    private final LocalDate fecha;
    private final Vehiculo vehiculo;
    private final PosicionPuesto puesto;

    /**
     * Constructor.
     *
     */
    public Registro(double horaEntrada, double horaSalida, LocalDate fecha, Vehiculo vehiculo, PosicionPuesto puesto) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.puesto = puesto;
    }

    /**
     * Getters.
     *
     */
    public double getHoraEntrada() {
        return horaEntrada;
    }
    public double getHoraSalida() {
        return horaSalida;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public PosicionPuesto getPuesto() {
        return puesto;
    }

}
