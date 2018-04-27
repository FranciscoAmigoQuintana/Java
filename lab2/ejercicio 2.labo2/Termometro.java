import java.util.Random;

public class Termometro {

    private int temperaturater;
    private int temperaturaper;

    public int tirar()
    {
        temperaturater=(int) (Math.random()*10);
        temperaturaper= new Random().nextInt((40-35)+1)+35;
        return temperaturaper;
    }

    public int tirar2()
    {
        temperaturater=(int) (Math.random()*10);
        temperaturaper = new Random().nextInt((40-35)+1)+35;
        return temperaturaper;
    }
}
