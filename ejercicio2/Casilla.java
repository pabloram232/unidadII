package ejercicio2;


public class Casilla {
    private int fila;
    private int columna;
    private int numero;
    private boolean opcion;

    public Casilla() {
        numero=0;        
        fila=0;
        columna=0;
        opcion=false;
    }

    public Casilla(int fila, int columna, int numero) {
        this.fila = fila;
        this.columna = columna;
        this.numero = numero;
        this.opcion=false;
    }


    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion= opcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



}
