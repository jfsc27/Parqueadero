package co.edu.uniquindio.poo;

public class PosicionPuesto {
    private final int [][] puestos;
    private final int filas;
    private final int columnas;

    public PosicionPuesto (int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        this.puestos = new int[filas][columnas];
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

    
}
