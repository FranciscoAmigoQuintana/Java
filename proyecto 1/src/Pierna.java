public class Pierna {


    private String pierna;
    private boolean estado;
    int pasos= 0;
    boolean pasosI = true;
    boolean pasosD = true;


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getPierna() {
        return pierna;
    }

    public void setPierna(String pierna) {
        this.pierna = pierna;
    }



    void caminarIzq(){



        if(pasos==0 ) {
            System.out.println("Elrobot avanzo un paso");



        }
        else{
            System.out.println("El robot retrocedio un paso");



        }
    }       //funcion para caminar con pierna izquierda

    void caminarDer(){


            if (pasos == 0) {
                System.out.println("El robot avanzo un paso");



            } else {
                System.out.println("El robot retrocedio un paso");


            }


    } //funcion para caminar con pierna derecha

}