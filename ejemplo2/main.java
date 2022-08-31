package campeonato;

import clases.jugador;

public class main
{
    public static void main(String[] args)
    {

        jugador jug1 = new jugador("joel", "condori", "2147084lp",21);
        jugador jug2 = new jugador("matt", "condori", "2312312lp", 23);

        jugador[] jugadores = new jugador[2];
        jugadores[0] = jug1;
        jugadores[1] = jug2;


        equipo eq1 = new equipo("club real","Varones",jugadores);
        eq1.mostrarEquipo();
    }
}
