import java.util.Scanner;

public class Main {
    public static void main(String agrs[])
    {
        Termometro a;
        Scanner sc = new Scanner(System.in);
        System.out.println("aprete (t) para tirar el termometro: ");
        String tirar = sc.nextLine();

        if (tirar.equals("t"))
        {
            int t1 = a.tirar();
            System.out.println("la temperatura marco: "+a.tirar());
        }

        System.out.println("aprete (u) para tirar el termometro segunda vez: ");
        String tirar2 = sc.nextLine();

        if (tirar2.equals("u"))
        {
            int t2 = a.tirar2();
            System.out.println("la temperatura marco: "+a.tirar2());
        }

        int temperaturapromedio;
        temperaturapromedio=
    }
}
