import java.util.Scanner;
public class Main {

    public static void main(String agrs[])
    {
        Candicato a = new Candicato ("Felipe");
        Candicato b = new Candicato ("Sebastian");
        Candicato c = new Candicato ("Marcos");

        int sumanula=-1;
        int votostotales=-1;
        float porcentajeprimero;
        float porcentajesegundo;
        float porcentajetercero;

        Scanner sc = new Scanner (System.in);

        char voto = 'x';

        while (voto != 'f')
        {
            System.out.println("elija a que candidato va el voto: a, b o c");
            voto = sc.nextLine().charAt(0);
            if (voto == 'a') {
                a.sumacandidato();
            }
            if (voto == 'b') {
                b.sumacandidato();
            }
            if (voto == 'c') {
                c.sumacandidato();
            }
            if ((voto != 'a') && (voto != 'b') && (voto != 'c'))
            {
                sumanula = sumanula+1;
            }
            votostotales=votostotales+1;

            System.out.println(voto);
        }

        if (a.getsuma() > b.getsuma())
        {
            if (a.getsuma() > c.getsuma())
            {
                System.out.println("gano candidato " + a.getnombre());
            }
        }

        if (c.getsuma() > b.getsuma())
        {
            if (c.getsuma() > a.getsuma())
            {
                System.out.println("gano candidato " + c.getnombre());
            }
        }

        if (b.getsuma() > a.getsuma()) {
            if (b.getsuma() > c.getsuma()) {
                System.out.println("gano candidato " + b.getnombre());
            }
        }

        System.out.println("el candidato " + b.getnombre() + " tiene " + b.getsuma() + " votos");
        System.out.println("el candidato " + a.getnombre() + " tiene " + a.getsuma() + " votos");
        System.out.println("el candidato " + c.getnombre() + " tiene " + c.getsuma() + " votos");

        System.out.println("hay " + sumanula + " nulos" );


        porcentajeprimero=((float)a.getsuma()/(float)votostotales)*100;
        porcentajesegundo=((float)b.getsuma()/(float)votostotales)*100;
        porcentajetercero=((float)c.getsuma()/(float)votostotales)*100;

        System.out.println("el candidato " + a.getnombre() + " tiene un porcentaje de " + porcentajeprimero + " de votos");
        System.out.println("el candidato " + b.getnombre() + " tiene un porcentaje de " + porcentajesegundo + " de votos");
        System.out.println("el candidato " + c.getnombre() + " tiene un porcentaje de " + porcentajetercero + " de votos");
    }

}
