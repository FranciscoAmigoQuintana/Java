public class Candicato {

    private String nombre;
    private int suma;

    Candicato (String nombre)
    {
        this.nombre = nombre;
        this.suma = 0;
    }

    public void setnombre (String nombre)
    {
        this.nombre = nombre;
    }
    public String getnombre ()
    {
        return nombre;
    }


    public void sumacandidato()
    {
        suma = suma+1;
    }

    public int getsuma()
    {
        return this.suma;
    }

}
