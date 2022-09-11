package campeonato;

public class campeonato1
{
    private String nombreCampeonato;

    private equipo[] equipo;


    public campeonato1 (String nombreCampeonato, equipo[] equipo)
    {
        this.nombreCampeonato = nombreCampeonato;
        this.equipo = equipo;
    }

    public String getNombreCampeonato()
    {
        return this.nombreCampeonato;
    }
    public equipo[] getEquipo()
    {
        return this.equipo;
    }

    public void setNombreCampeonato(String nombreCampeonato)
    {
        this.nombreCampeonato = nombreCampeonato;
    }

    public void setEquipo(campeonato.equipo[] equipo)
    {
        this.equipo = equipo;
    }

    public void mostrarCampeonato()
    {
        System.out.println("MOSTRANDO DATOS DEL CAMPEONATO1");
        System.out.println("MOSTRANDO nombreCampeonato: " + this.getNombreCampeonato());
        System.out.println("MOSTRANDO equipo: " + this.getEquipo());

       // for (int i=0; i < this.getEquipo().length; i++)
        {
            //this.getEquipo()[i].();
        }
    }

}
