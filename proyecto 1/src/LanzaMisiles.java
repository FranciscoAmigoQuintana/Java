public class LanzaMisiles {
    public String misiles;
    public boolean isEstado;

    public String getMisiles() {
        return misiles;
    }

    public void setMisiles(String misiles) {
        this.misiles = misiles;
    }

    public boolean isEstado() {
        return isEstado;
    }

    public void setEstado(boolean estado) {
        isEstado = estado;
    }


    void dispararMisiles(){

        System.out.println("El robot lanzo un misil");
    }
}