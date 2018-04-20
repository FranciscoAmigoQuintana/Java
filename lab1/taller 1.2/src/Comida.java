import java.util.ArrayList;

public class Comida {

    private String nombre;
    private String tipoplato;
    private ArrayList<Ingredientes> ingredientes;

    Comida (String nombre, String tipoplato, ArrayList<Ingredientes> ingredientes) {
        this.nombre = nombre;
        this.tipoplato = tipoplato;
        this.ingredientes = ingredientes;
    }


    /*
    public void setTipoplato (String tipoplato) {

        this.tipoplato = tipoplato;
    }

    public String getTipoplato () {

        return tipoplato;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    public String getNombre () {

        return nombre;
    }

    public void setTipo (String tipo) {

        this.tipoplato = tipoplato;
    }

    public String getTipo () {

        return tipoplato;
    }

    void daringrediente ()
    {
        for (Ingredientes i : ingredientes)
        {
            System.out.println("El ingrediente ");
            System.out.println(i.getTipo());
            System.out.println(" se necesita con esta cantidad en gramos ");
            System.out.println(i.getCantidad());
        }
    }
    */




}
