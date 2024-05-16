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
    private final Puesto[][] listaPuestos;
    private final int filas;
    private final int columnas;
    private final Collection<Vehiculo> listaVehiculos;
    private final Collection<Registro> listaRegistroGeneral;
    private final Collection<Registro> listaRegistroDiario;
    private final Collection<Registro> listaRegistroMensual;
    private final Collection<Vehiculo> listaVehiculosTotalesParqueados;

    public Parqueadero(String nombre, int filas, int columnas) {
        this.nombre = nombre;
        this.columnas=columnas;
        this.filas=filas;
        this.listaPuestos = new Puesto[filas][columnas];
        this.listaVehiculos = new LinkedList<>();
        this.listaRegistroDiario = new LinkedList<>();
        this.listaRegistroMensual = new LinkedList<>();
        this.listaVehiculosTotalesParqueados = new LinkedList<>();
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
    public Collection<Vehiculo> getListaVehiculosTotalesParqueados() {
        return listaVehiculosTotalesParqueados;
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

    public void parquearVehiculo (Vehiculo vehiculo, int filas, int columnas){
        assert puestoEstaOcupado(filas, columnas) == false;
        listaPuestos[filas][columnas].setVehiculo(vehiculo);
        listaPuestos[filas][columnas].setEstado(true);
        listaVehiculosTotalesParqueados.add(vehiculo);
    }

    public void desocuparPuesto (int filas, int columnas){
        assert puestoEstaOcupado(filas, columnas) == true;
        listaPuestos[filas][columnas].setEstado(false);
    }


    private Propietario obtenerPropietarioVehiculo (Puesto puesto){
        assert puestoEstaOcupado(filas, columnas) == true;
        return puesto.getVehiculo().getPropietario();


    } 

    private double reporteCarro(){
        double total= 0;
        for(Vehiculo vehiculo: listaVehiculosTotalesParqueados){
            if(vehiculo instanceof Carro){
            total+= Registro.valorParqueo();
            
            }
        }
    }



}
