import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args)
    {

        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        ArrayList<Pregunta> cincopreguntasantes = new ArrayList<Pregunta>();
        Scanner tecla = new Scanner(System.in);
        Pregunta a;
        String pregun;
        int b=0;
        int random;
        ArrayList lista = new ArrayList();
        int contador=0;


        System.out.println("ingrese de cuantas preguntas sera la lista");
        int numero = tecla.nextInt();

        if (numero>=5) {
            while (b<=numero)
            {
                System.out.println("ingrese la pregunta");
                pregun = tecla.nextLine();
                a = new Pregunta(pregun);
                preguntas.add(a);
                b=b+1;
            }
        }
        else
            {
                System.out.println("no puede crearse la prueba tiene menos de 5 preguntas");
                System.out.println("ingrese el numero de preguntas");
                numero = tecla.nextInt();
            }

        for(int j=0;j<=numero;j++)
        {
            lista.add(j,"B");
        }

        while(contador<5)
        {
            random=(int)(Math.random()*numero);

            for (int i=0;i<=numero;i++)
            {
                if (lista.get(i)=="B")
                {
                    System.out.println("paso");
                    lista.add(random);
                    contador=contador+1;
                }
            }
        }

        for(int i=0;i<numero;i++)
        {
            if(lista.get(i).equals(i)) {
                System.out.println("paso 2");
                cincopreguntasantes.add(i, preguntas.get(i));
            }
        }

        Prueba p = new Prueba(numero);

        System.out.println("ingrese b para correr la lista de preguntas al azar");
        String correrprueba = tecla.nextLine();

        if (correrprueba=="b")
        {
            p.correrprueba(cincopreguntasantes);
        }

    }

}
