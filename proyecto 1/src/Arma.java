public class Arma {

    private String arma; // pregunta el nombre del arma
    private double municiones;
    private boolean estado;


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public double getMuniciones() {
        return municiones;
    }

    public void setMuniciones(double municiones) {
        this.municiones = municiones;
    }

    public double dispararArma(){

        if (municiones != 0){
            System.out.println("TIENE "+municiones+" balas");
            municiones = municiones - 1;

        }
        else{
            municiones = 0;
        }

        return municiones;
    }


}