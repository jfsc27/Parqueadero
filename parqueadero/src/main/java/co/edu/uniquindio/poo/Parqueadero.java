package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
* Clase parqueadero.
*
*/
public class Parqueadero {

    /**
     * Atributos.
     *
     */

    private final String nombre;
    private final Collection<Puesto> listaPuestos;
    private final Collection<Vehiculo> listaVehiculos;
    private final Collection<Registro> listaRegistroDiario;
    private final Collection<Registro> listaRegistroMensual;

    /**
     * Constructor.
     *
     */
    public Parqueadero(String nombre) {

        this.nombre = nombre;
        this.listaPuestos = new LinkedList<>();
        this.listaVehiculos = new LinkedList<>();
        this.listaRegistroDiario = new LinkedList<>();
        this.listaRegistroMensual = new LinkedList<>();

    }

    /**
     * Getters
     *
     */

    public Collection<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public Collection<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Registro> getListaRegistroDiario() {
        return listaRegistroDiario;
    }

    public Collection<Registro> getListaRegistroMensual() {
        return listaRegistroMensual;
    }
    
}
