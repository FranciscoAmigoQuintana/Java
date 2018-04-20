import java.util.ArrayList;

public class Main {

    public static void main(String agrs[])
    {
        ArrayList<Ingredientes> lista = new ArrayList<Ingredientes>();

        Ingredientes i1 = new Ingredientes ("pollo",800);
        Ingredientes i2 = new Ingredientes ("papas",500);
        Ingredientes i3 = new Ingredientes ("pure", 300);
        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        Comida a = new Comida ("pollo frito con papas","almuerzo", lista);
    }
}
