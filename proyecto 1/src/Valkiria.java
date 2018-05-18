import java.util.Scanner;

public class Valkiria {


    private Pierna PI;
    private Pierna PD;
    private Alas A;
    private Brazo BD;
    private Brazo BI;
    private Superior SU;
    private Arma AR;
    private LanzaMisiles LA;
    private int modo;
    private double velocidad = 0;
    private double altura = 0;
    private int anterior=0;



    /* definicion de estados:
        1 - fighter
        2 - Gerwalk
        3 - Battleloid
     */


    public Valkiria() {
        this.PD = new Pierna();
        this.PI = new Pierna();
        this.A = new Alas();
        this.BD = new Brazo();
        this.BI = new Brazo();
        this.SU = new Superior();
        this.AR = new Arma();
        this.LA = new LanzaMisiles();


        //estado por defecto - fighter de inicio
        setModo(5);
        estadoFigther();

    }

    public void estadoFigther(){

        this.PD.setEstado(false);        //Pierna derecha = false
        this.PI.setEstado(false);        //Pierna izquierda = false
        this.A.setEstado(true);         //Alas = true
        this.BD.setEstado(false);        //Brazo derecho = false
        this.BI.setEstado(false);        //Brazo izquierdo = false
        this.SU.setEstado(true);        //laser = true
        this.AR.setEstado(false);       //Arma de Mano = false
        this.LA.setEstado(true);
        System.out.println("ESTA EN MODO FIGHTER");
        setModo(5);

    }

    public void estadoGerwalk(){

        this.PD.setEstado(true);        //Pierna derecha = true
        this.PI.setEstado(true);        //Pierna izquierda = true
        this.A.setEstado(true);         //Alas = true
        this.BD.setEstado(true);        //Brazo derecho = true
        this.BI.setEstado(true);        //Brazo izquierdo = true
        this.SU.setEstado(true);        //laser = true
        this.AR.setEstado(false);       //Arma de Mano = false
        this.LA.setEstado(true);
        System.out.println("ESTA EN MODO GERWALK");
        setModo(6);
    }


    public void estadoBattleloid(){

        this.PD.setEstado(true);        //Pierna derecha = true
        this.PI.setEstado(true);        //Pierna izquierda = true
        this.A.setEstado(false);         //Alas = false
        this.BD.setEstado(true);        //Brazo derecho = true
        this.BI.setEstado(true);        //Brazo izquierdo = true
        this.SU.setEstado(false);        //laser = false
        this.AR.setEstado(true);       //Arma de Mano = true
        this.LA.setEstado(false);
        System.out.println("ESTA EN MODO BATTLOID");
        setModo(7);
    }




    public double aumentarAltura(){

        if (getModo() == 5 || getModo() == 6) {
            altura = altura + 50;

        }
        else{
            altura = 0;
        }
        return altura;
    }

    public double descenderAltura(){

        if (getModo() == 5 || getModo() == 6) {
            altura = altura - 50;
        }
        else{
            altura = 0;
        }
        if (altura <= 0){
            altura = 0;
            return altura;
        }
        else{
            return altura;
        }

    }

    public double aumentarVelocidad(){
        if ((getModo() == 5 || getModo() == 6)) {
            velocidad = velocidad + 50;
            if (velocidad > 750){
                velocidad = 750;
            }
        }
        else{
            velocidad = 0;
        }
        return velocidad;
    }

    public double bajarVelocidad(){

        if((getModo() == 5 || getModo() == 6)) {
            velocidad = velocidad - 50;
        }
        else {
            velocidad = 0;
        }
        if (velocidad <= 0){
            velocidad = 0;
            return velocidad;
        }
        else{
            return velocidad;
        }

    }


    public void cambioestadoF()  //funcion cambio de estado a fighter
    {
        if ((getModo() == 5)&&(anterior==1))
        {

            estadoFigther();
        }
        else
        {
            System.out.println("pase a estado Gerwalk primero");
        }
    }

    public void cambioestadoG()  //funcion cambio de estado a gerwalk
    {
        if ((getModo()==6))
        {
            anterior=1;
            estadoGerwalk();
            if (altura == 0){
                velocidad = 0;
            }
        }
    }

    public void cambioestadoB() //funcion cambio de estado a battleloid
    {
        if ((getModo()==7)&&(altura<=200))
        {
            anterior=0;

            estadoBattleloid();
            velocidad = 0;
            altura = 0;
        }
        else
        {
            System.out.println("se requiere altura <= 200 metros");
        }
    }

    public void robotDispara(){


        getAR().dispararArma();


    }  //funcion para que el robot dispare

    public void robotDisparaLA(){

        getLA().dispararMisiles();

    }  //funcion para que el robot lanzemisiles

    public Pierna getPI() {
        return PI;
    }

    public void setPI(Pierna PI) {
        this.PI = PI;
    }

    public Pierna getPD() {
        return PD;
    }

    public void setPD(Pierna PD) {
        this.PD = PD;
    }

    public Alas getA() {
        return A;
    }

    public void setA(Alas a) {
        A = a;
    }

    public Brazo getBD() {
        return BD;
    }

    public void setBD(Brazo BD) {
        this.BD = BD;
    }

    public Brazo getBI() {
        return BI;
    }

    public void setBI(Brazo BI) {
        this.BI = BI;
    }

    public Superior getSU() {
        return SU;
    }

    public Arma getAR() { return AR; }

    public void setAR(Arma AR) { this.AR = AR; }

    public void setSU(Superior SU) {
        this.SU = SU;
    }

    public LanzaMisiles getLA() {
        return LA;
    }

    public void setLA(LanzaMisiles LA) {
        this.LA = LA;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}



