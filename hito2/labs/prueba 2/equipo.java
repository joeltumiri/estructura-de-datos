package campeonato;

import clases.jugador;

public class equipo
{
    private String nombreCompleto;
    private String categoria;
    private jugador[] jugadores;
    private String nombreEquipo;


    public equipo(String nombreEquipo, String categoria,jugador[] jugadores)
    {
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }

    public String getnombreEquipo()
    {
       return this.nombreEquipo;
    }
    public String getcategoria()
    {
        return this.categoria;
    }
    public jugador[] getjugadores()
    {
        return this.jugadores;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setJugadores(jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void mostrarEquipo()
    {
        System.out.println(" MOSTRANDO DATOS DEL EQUIPO");
        System.out.println(" MOSTRAR CATEGORIA: " + this.getcategoria());
        System.out.println(" MOSTRAR EQUIPO: " + this.getnombreEquipo());

        for (int i=0; i < this.getjugadores().length; i++)
        {
            this.getjugadores()[i].mostrarJugadorDeHoy();
        }


    }
}
