import java.util.Scanner;

public class Controlador {

    private Scanner tecla;
    private Pista pista;
    int x;
    int y;
    boolean a = true;
    boolean b = true;
    boolean d = true;

    Controlador() {
        this.tecla = new Scanner(System.in);
        this.pista = new Pista();
    }

    public void existePista(){
        System.out.println("Existe Pista? :   1: Si   -  0: NO   ");
        x = this.tecla.nextInt();
        if (x == 1){
            this.pista.setPista(true);
            System.out.println("DE CUANTOS METROS ES LA PISTA?:   ");
            y = this.tecla.nextInt();
            this.pista.setMetros(y);
        }
        else if(x == 0){
            this.pista.setPista(false);
        }
        else{
            System.out.println("Ingrese una opcion valida");
        }
    }       //verificador si existe o no pista




    public int Menu() {

        int decision = 0;


        System.out.println("<1> Aumentar Velocidad - <2> Disminuir Velocidad");
        System.out.println("<3> Ascender Altura - <4> Descender Altura");
        System.out.println("<5> (Cambiar Modo Fighter) <6> (Cambiar Modo Gerwalk) <7> (Cambiar Modo Battleloid )");
        System.out.println("<8> Disparar");
        System.out.println("<9> Empezar a Caminar");
        decision = this.tecla.nextInt();
        return decision;
    }       //menu principal de acciones

    public int MenuCaminar() {

        int caminar = 0;


        System.out.println("<1> Mover Pierna Izquierda - <2> Mover Pierna Derecha");
        System.out.println("<3> dejar de caminar");
        caminar = this.tecla.nextInt();
        return caminar;
    }  //menu exclusivo para caminar

    public int MenuDisparar(){

        int disparar = 0;


        System.out.println("<1> Disparar Laser");
        System.out.println("<2> Disparar LanzaMisiles");
        System.out.println("<3> Disparar Arma de Mano");
        System.out.println("<4> Dejar de Disparar");
        disparar = this.tecla.nextInt();
        return disparar;
    }  //menu exculivo para disparar arma

    public int MenuARMADEMANO(){
        int arma = 0;

        System.out.println("<1> Rifle");
        System.out.println("<2> Escopeta");
        System.out.println("<3> Pistola");

        arma = this.tecla.nextInt();

        return arma;
    }  //menu para dispara con la arma de mano





    public void Opciones(Valkiria valkiria) {

        existePista();

        while (true && pista.getPista() == true &&  pista.getMetros() >= 100) {


            int decision = this.Menu();

            switch (decision) {

                case 1:
                    System.out.println("VELOCIDAD: " + valkiria.aumentarVelocidad());
                    break;
                case 2:
                    System.out.println("VELOCIDAD: " + valkiria.bajarVelocidad());

                    break;
                case 3:

                    if (valkiria.getVelocidad() >= 350) {
                        System.out.println("ALTURA: " + valkiria.aumentarAltura());
                    } else {
                        System.out.println("NECESITA AUMENTAR LA VELOCIDAD");
                    }
                    break;
                case 4:
                    System.out.println("ALTURA: " + valkiria.descenderAltura());
                    break;
                case 5:
                    if (valkiria.getModo() == decision) {
                        System.out.println("esta ya en ese modo");
                    } else {
                        valkiria.setModo(5);
                        valkiria.cambioestadoF();
                    }
                    break;
                case 6:
                    if (valkiria.getModo() == decision) {
                        System.out.println("esta ya en ese modo");
                    } else {
                        valkiria.setModo(6);
                        valkiria.cambioestadoG();
                    }
                    break;
                case 7:
                    if (valkiria.getModo() == decision) {
                        System.out.println("esta ya en ese modo");
                    } else {
                        valkiria.setModo(7);
                        valkiria.cambioestadoB();
                    }
                    break;
                case 8:
                    while (a==true){
                        int disparar = this.MenuDisparar();
                        switch (disparar){
                            case 1:
                                if(valkiria.getModo() == 5 || valkiria.getModo() == 6){
                                    valkiria.getSU().disLaser();
                                }
                                else{
                                    System.out.println("El robot no tiene laser");
                                }
                                break;
                            case 2:
                                if(valkiria.getModo() == 5 || valkiria.getModo() == 6){
                                    valkiria.robotDisparaLA();
                                }
                                else{
                                    System.out.println("El robot no tiene lanza misiles");
                                }
                                break;
                            case 3:
                                if (valkiria.getModo()==7) {
                                    if (d == true) {
                                        int arma = this.MenuARMADEMANO();
                                        switch (arma) {
                                            case 1:
                                                valkiria.getAR().setArma("Rifle");
                                                System.out.println("Ha elegido el rifle");
                                                valkiria.getAR().setMuniciones(100);
                                                d = false;
                                                break;
                                            case 2:
                                                valkiria.getAR().setArma("Escopeta");
                                                System.out.println("Ha elegido la escopeta");
                                                valkiria.getAR().setMuniciones(10);
                                                d = false;
                                                break;
                                            case 3:
                                                valkiria.getAR().setArma("Pistola");
                                                System.out.println("Ha elegido la pistola");
                                                valkiria.getAR().setMuniciones(30);
                                                d = false;
                                                break;
                                        }
                                    }
                                    valkiria.robotDispara();
                                }
                                else{
                                    System.out.println("El robot no puede ocupar arma de mano");
                                }

                            case 4:
                                a = false;
                                break;
                        }

                    }
                    a=true;

                    break;
                case 9:
                    if (valkiria.getAltura() == 0 && (valkiria.getModo() == 6 || valkiria.getModo() == 7)) {
                        while (b == true) {
                            int caminar = this.MenuCaminar();
                            switch (caminar) {
                                case 1:
                                    valkiria.getPI().caminarIzq();
                                    break;
                                case 2:
                                    valkiria.getPD().caminarDer();
                                    break;
                                case 3:
                                    b = false;
                                    break;
                            }
                        }
                        b = true;
                    }
            }



        }
        System.out.println("ADIOS!");
    }       //pregunta al usuario lo que quiere hacer dependiendo a los menus
}