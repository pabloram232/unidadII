package ejercicio2;

import java.util.Scanner;

public class Jugar {

    private Tablero T; 
    private Scanner leerDato;

    public Jugar() {
        T = new Tablero(); 
        leerDato = new Scanner(System.in);
    }

    public void menu() {
    }

    public void jugar() {
        
        T.llenarTablero();
        T.mostrarTablero();
        int fila, columna;
        int aciertos = 0;
        int objetivo = T.cantidadCasillerosSinMinas();
        boolean salir = false;

        do {
            System.out.println("Elige una casilla : ");
            System.out.println("coordenadas");
            System.out.println("FILA: ");
            fila = leerDato.nextInt();
            System.out.println("Columna:");
            columna = leerDato.nextInt();

            if (T.voltearCasillero(fila, columna)) {
                T.mostrarTablero();
                aciertos++;
                System.out.println("aciertos: " + aciertos);
                if (aciertos == objetivo) {
                    System.out.println("Has Ganado el Juego");
                    salir = true;
                }
            } else {
                System.out.println("Ha perdido");
                salir = true;
            }
        } while (!salir);
    }
}
