package campeonato;

import clases.jugador;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Main 3");
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DE JUGADORES");
        String nombreCompleto1, apellidos1, ci1;
        int edad1, i, nJugadores = 2;

        jugador[] jugadores = new jugador[nJugadores];
        //int nJUGADORES = 3;
        //for (int i = 0; i < 5; i++)
        for (i = 0; i < nJugadores; i = i + 1)
        {

            System.out.println("ingrese nombre del jugador1: " + (i + 1)+": ");
            nombreCompleto1 = leer.next();
            System.out.println("ingrese apellidos del jugador1: " + (i + 1)+": ");
            apellidos1 = leer.next();
            System.out.println("ingrese ci del jugador1: " + (i + 1)+": ");
            ci1 = leer.next();
            System.out.println("ingrese edad del jugador1: " + (i + 1)+": ");
            edad1 = leer.nextInt();

            jugador jug = new jugador();
            jug.setNombreCompleto(nombreCompleto1);
            jug.setApellidos(apellidos1);
            jug.setCi(ci1);
            jug.setEdad(edad1);
            jug.mostrarJugadorDeHoy();

            jugadores[1] = jug;



        }
        equipo eq1 = new equipo("Always Ready", "Varones", jugadores);
        eq1.mostrarEquipo();
    }
}
