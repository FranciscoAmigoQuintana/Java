import java.util.ArrayList;

public class Prueba {

    private ArrayList<Pregunta> cincopreguntas = new ArrayList<Pregunta>();
    private int numeropregunta=0;
    private int numero;

    Prueba (int numero)
    {
        this.numero=numero;
    }

    public void correrprueba(ArrayList cincopreguntas)
    {
        for (int i=0;i<=numero;i++)
        {
            numeropregunta=numeropregunta+1;
            System.out.println("pregunta"+numeropregunta);
            System.out.println(cincopreguntas.get(i)+" puntos");
            System.out.println("         ");
        }
    }
}
