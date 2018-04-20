public class Ingredientes {

    private String tipo;
    private int cantidad;

    Ingredientes (String tipo, int cantidad)
    {
        this.tipo=tipo;
        this.cantidad=cantidad;
    }

    public void setTipo (String tipo) {

        this.tipo = tipo;
    }

    public String getTipo () {

        return tipo;
    }

    public void setCantidad (int cantidad) {

        this.cantidad = cantidad;
    }

    public int getCantidad () {

        return cantidad;
    }
}
