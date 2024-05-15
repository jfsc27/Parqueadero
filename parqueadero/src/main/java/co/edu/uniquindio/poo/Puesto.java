package co.edu.uniquindio.poo;

/**
* Clase Puesto.
*
*/
public class Puesto {

    /**
     * Atributos.
     *
     */

    private final int [][] puestos;
    private final int filas;
    private final int columnas;
    private final Vehiculo vehiculo;
    private boolean estado;

    public Puesto (int filas, int columnas, Vehiculo vehiculo, boolean estado) {
        this.puestos = new int[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
        this.vehiculo = vehiculo;
        this.estado = estado;
    }

    public int[][] getPuestos() {
        return puestos;
    }
    public int getFilas() {
        return filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
