public class Superior {

    private String laser; //Y = Si -- D = No
    private boolean estado;


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getLaser() {

        return laser;
    }

    public void setLaser(String laser) {


        this.laser = laser;
    }

    void disLaser(){

        System.out.println("El Robot Disparo su laser");

    }
}