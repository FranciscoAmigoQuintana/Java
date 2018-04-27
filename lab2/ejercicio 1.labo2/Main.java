import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String agrs[])
    {
        Medico m;
        Paciente a;
        int j=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Paciente> listapacientes = new ArrayList<Paciente>();


        while (j <= 20)
        {
            System.out.println("ingrese el nombre: ");
            String nombrepaciente = sc.nextLine();
            //System.out.println(nombrepaciente);

            System.out.println("ingrese peso: ");
            int pesopaciente = sc.nextInt();
            //int a=pesopaciente*10;
            //System.out.println(pesopaciente);
            //System.out.println(a);

            System.out.println("ingrese la altura: ");
            int alturapaciente = sc.nextInt();

            System.out.println("ingrese BMI: ");
            float BMIpaciente = sc.nextFloat();

            System.out.println("ingrese el tipo de sangre ");
            String tiposangrepaciente = sc.nextLine();

            a = new Paciente (nombrepaciente,pesopaciente,alturapaciente,BMIpaciente,tiposangrepaciente);

            System.out.println("ingrese el numero de medicos del siguiente paciente: " + nombrepaciente);
            int numeromedicos = sc.nextInt();
            for (int i = 0; i <= numeromedicos; i++) {
                System.out.println("ingrese nombre del medico ");
                String nombremedico = sc.nextLine();
                if (!nombremedico.equals(nombrepaciente))
                {
                    m = new Medico(nombremedico);
                    a.agregarmedico(m);
                }
            }
            listapacientes.add(a);
            j=j+1;
        }

        System.out.println("ingrese el nombre del paciente buscado: ");
        String buscarnombre = sc.nextLine();

        System.out.println("ingrese el intervalo de busqueda del peso: ");
        int buscarpeso = sc.nextInt();

        System.out.println("ingrese el intervalo de busqueda de altura: ");
        int buscaraltura = sc.nextInt();


        //System.out.println("nombre: "+a.getNombrepaciente()+ " . peso: "+a.getPesopaciente()+ " . altura: "+a.getAlturapaciente()+ " . BMI: "+a.getBMIpaciente()+" .tipo sangre: "+a.getTiposangrepaciente()+ " .Medicos que lo trataron: "a.printearmedicos());

        for (Paciente p : listapacientes) {
            if (p.getNombrepaciente().equals(buscarnombre) && (p.getAlturapaciente() < buscaraltura) && (p.getPesopaciente() < buscarpeso))
            {
                System.out.println(p.getNombrepaciente()+" "+p.getAlturapaciente()+" "+p.getPesopaciente()+" "+p.getBMIpaciente()+ " "+ p.getTiposangrepaciente()+ ""+p.getLista());
            }
        }
    }
}
