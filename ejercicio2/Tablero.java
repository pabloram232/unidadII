package ejercicio2;

public class Tablero {

    private String tablero[][];
    private int minas[][];
    private boolean elegidos[][];
    private int filas;
    private int columnas;

    public Tablero() {
        filas = 6;
        columnas = 6;
        tablero = new String[filas][columnas];
        minas = new int[filas][columnas];
        elegidos = new boolean[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                elegidos[i][j] = false;
            }
        }

    }

    public int lanzarDado() {
        int numero = 0;
        do {
            numero = (int) (Math.random() * 10);
        } while (numero < 1 || numero > 6);
        return numero;
    }

    public void mostrarNumeroAleatorios() {
        for (int i = 0; i < 10; i++) {
            System.out.println("numero:" + lanzarDado());
        }
    }

    public void generarMinas() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (lanzarDado() % 2 == 0) {
                    minas[i][j] = 1;
                }
            }
        }
    }

    public int cantidadCasillerosSinMinas() {
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (!tablero[i][j].equals("M")) {
                    contador++;

                }
            }
        }
        return contador;
    }

    public void limpiarMinas() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                minas[i][j] = 0;
            }
        }
    }

    public void llenarTablero() {
        generarMinas();
        int numMinasAlrededor = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (minas[i][j] == 1) {
                    tablero[i][j] = "M";

                } else if (i == 0 || i == 5) {

                    if (i == 0) {

                        if (j == 0 || j == 5) {

                            if (j == 0) {

                                tablero[i][j] = "" + (minas[i][j] + minas[i][j + 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                            }
                            if (j == 5) {

                                tablero[i][j] = "" + (minas[i][j - 1] + minas[i][j] + minas[i + 1][j - 1] + minas[i + 1][j]);
                            }
                        } else {

                            tablero[i][j] = "" + (minas[i][j - 1] + minas[i][j] + minas[i][j + 1] + minas[i + 1][j - 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                        }
                    }
                    if (i == 5) {
                        if (j == 0 || j == 5) {
                            if (j == 0) {
                                tablero[i][j] = "" + (minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j] + minas[i][j + 1]);
                            }
                            if (j == 5) {

                                tablero[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i][j - 1] + minas[i][j]);
                            }
                        } else {

                            tablero[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j - 1] + minas[i][j] + minas[i][j + 1]);
                        }
                    }
                } else if (j == 0 || j == 5) {
                    if (j == 0) {
                        tablero[i][j] = "" + (minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j] + minas[i][j + 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                    }
                    if (j == 5) {

                        tablero[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i][j - 1] + minas[i][j] + minas[i + 1][j - 1] + minas[i + 1][j]);
                    }
                } else {
                    tablero[i][j] = "" + (minas[i - 1][j - 1] + minas[i - 1][j] + minas[i - 1][j + 1] + minas[i][j - 1] + minas[i][j] + minas[i][j + 1] + minas[i + 1][j - 1] + minas[i + 1][j] + minas[i + 1][j + 1]);
                }
            }
        }
    }

    public void mostrarTablero() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (elegidos[i][j] == false) {
                    if (j == 5) {
                        System.out.println(" [" + tablero[i][j] + "]");
                    } else {
                        System.out.print(" [" + tablero[i][j] + "]");
                    }
                } else if (j == 5) {
                    System.out.println(" [ ]");
                } else {
                    System.out.print(" [ ]");
                }
            }
        }
    }

    public boolean voltearCasillero(int fila, int columna) {
        boolean continuar = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (i == fila && j == columna) {

                    if (tablero[i][j].equals("M")) {
                        continuar = false;
                    } else {
                        elegidos[i][j] = true;
                        continuar = true;
                    }
                }
            }
        }
        return continuar;
    }
}
