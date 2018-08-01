import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Controlador {


    private Scanner leer;

    public Controlador()
    {
        this.leer= new Scanner(System.in);
    }


    public int Menu()
    {
        int opciones=0;

        System.out.println("1 ver datos del sistema");
        System.out.println("2 mostrar ususarios reales");
        System.out.println("3 buscar usuarios");
        System.out.println("4 mostrar ficheros ordenados");
        System.out.println("5 mostrar directorios ordenados");
        System.out.println("6 nombres de archivos y tamaño en orden de mayor a menor");
        System.out.println("7 busqueda de fichero o directorio");
        System.out.println("8 mostrar 3 procesos que ocupan mas cpu y 3 que ocupan mas memoria");
        System.out.println("9 mostrar archivos y directorios modificados en las ultimas 24 horas");
        System.out.println("10 informacion del numero de conexiones y el tiempo total de conexion por cada usuario en la ultima semana");
        opciones = this.leer.nextInt();
        return opciones;
    }

    public void MenuOpciones()
    {
        SistemaDatos();
        while (true)
        {
            int opcion = this.Menu();

            switch (opcion)
            {
                case 1:
                    SistemaDatos();
                    break;
                case 2:
                    MostrarUsuario();
                    break;
                case 3:
                    BuscarUsuario();
                    break;
                case 4:
                    FicherosOrdenados();
                    break;
                case 5:
                    DirectoriosOrdenados();
                    break;
                case 6:
                    DatosArchivos();
                    break;
                case 7:
                    BusquedaFicheroDirectorio();
                    break;
                case 8:
                    ProcesosCpuMemoria();
                    break;
                case 9:
                    ArchivosDirectoriosHoras();
                    break;
                case 10:
                    Conexiones();
                    break;
            }
        }
    }

    public void SistemaDatos()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/SistemaDatos.bash");
            BufferedReader SistemaDatos = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = SistemaDatos.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void MostrarUsuario()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/MostrarUsuario.bash");
            BufferedReader MostrarUsuario = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = MostrarUsuario.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void FicherosOrdenados()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/FicherosOrdenados.bash");
            BufferedReader FicherosOrdenados = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = FicherosOrdenados.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void DirectoriosOrdenados()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/DirectoriosOrdenados.bash");
            BufferedReader DirectoriosOrdenados = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = DirectoriosOrdenados.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void DatosArchivos()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/DatosArchivos.bash");
            BufferedReader DatosArchivos = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = DatosArchivos.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void BusquedaFicheroDirectorio()
    {
        try{
            Scanner scanner = new Scanner(System.in);
            String nombre;
            System.out.println("ingrese el nombre director o archivo");
            nombre = scanner.nextLine();

            Process p = Runtime.getRuntime().exec("./bash/BusquedaFicheroDirectorio.bash "+nombre);
            BufferedReader BusquedaFicheroDirectorio = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = BusquedaFicheroDirectorio.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void ProcesosCpuMemoria()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/ProcesosCpuMemoria.bash");
            BufferedReader ProcesosCpuMemoria = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = ProcesosCpuMemoria.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void ArchivosDirectoriosHoras()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/ArchivosDirectoriosHoras.bash");
            BufferedReader ArchivosDirectoriosHoras = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = ArchivosDirectoriosHoras.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void Conexiones()
    {
        try{
            Scanner scanner = new Scanner(System.in);

            Process p = Runtime.getRuntime().exec("./bash/Conexiones.bash");
            BufferedReader Conexiones = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = Conexiones.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void BuscarUsuario()
    {
        try{
            System.out.println("ingrese la letra");
            Scanner scanner = new Scanner(System.in);
            String letra;
            letra = scanner.nextLine();


            Process p = Runtime.getRuntime().exec("./bash/BuscarUsuario.bash " +letra);
            BufferedReader BuscarUsuario = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = BuscarUsuario.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
