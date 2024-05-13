package co.edu.uniquindio.poo;

import java.util.Collection;

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
    private final Puesto[][] listaPuestos;
    private final int filas;
    private final int columnas;
    private final Collection<Vehiculo> listaVehiculos;
    private final Collection<Registro> listaRegistroDiario;
    private final Collection<Registro> listaRegistroMensual;

    public Parqueadero(String nombre, int filas, int columnas, Collection<Vehiculo> listaVehiculos,
            Collection<Registro> listaRegistroDiario, Collection<Registro> listaRegistroMensual) {
        this.nombre = nombre;
        this.columnas=columnas;
        this.filas=filas;
        this.listaPuestos = new Puesto[filas][columnas];
        this.listaVehiculos = listaVehiculos;
        this.listaRegistroDiario = listaRegistroDiario;
        this.listaRegistroMensual = listaRegistroMensual;
    }

    public String getNombre() {
        return nombre;
    }
    public Puesto[][] getListaPuestos() {
        return listaPuestos;
    }
    public int getFilas() {
        return filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public Collection<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    public Collection<Registro> getListaRegistroDiario() {
        return listaRegistroDiario;
    }
    public Collection<Registro> getListaRegistroMensual() {
        return listaRegistroMensual;
    }

    public boolean puestoEstaOcupado(int filas, int columnas) {
    
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                if (listaPuestos[i][j].isEstado()==true) {
                    return true;
                }
            }
        }
        return false;
    }

    private Propietario obtenerPropietarioVehiculo (Puesto puesto){
        assert puesto.isEstado()==true;
        return puesto.getVehiculo().getPropietario();

    }
}
