package co.edu.uniquindio.poo;

/**
* Clase posicionPuesto.
*
*/
public class PosicionPuesto {

    /**
     * Atributos.
     *
     */
    private final int [][] puestos;
    private final int filas;
    private final int columnas;

    /**
     * Constructor.
     *
     */
    public PosicionPuesto (int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        this.puestos = new int[filas][columnas];
    }

    /**
     * Getters
     *
     */
    public int[][] getPuestos() {
        return puestos;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

}
