import java.util.ArrayList;

public class Paciente {
    private String nombrepaciente;
    private int pesopaciente;
    private int alturapaciente;
    private float BMIpaciente;
    private String tiposangrepaciente;
    private ArrayList<Medico> lista = new ArrayList<Medico>();

    Paciente (String nombrepaciente, int pesopaciente, int alturapaciente, float BMIpaciente, String tiposangrepaciente)
    {
        this.nombrepaciente = nombrepaciente;
        this.pesopaciente = pesopaciente;
        this.alturapaciente = alturapaciente;
        this.BMIpaciente = BMIpaciente;
        this.tiposangrepaciente = tiposangrepaciente;
    }

    public void setNombrepaciente(String nombrepaciente)
    {
        this.nombrepaciente = nombrepaciente;
    }

    public String getNombrepaciente()
    {
        return nombrepaciente;
    }

    public void setPesopaciente(int pesopaciente)
    {
        this.pesopaciente = pesopaciente;
    }

    public int getPesopaciente()
    {
        return pesopaciente;
    }

    public void setAlturapaciente(int alturapaciente)
    {
        this.alturapaciente = alturapaciente;
    }

    public int getAlturapaciente()
    {
        return alturapaciente;
    }

    public void setBMIpaciente(float BMIpaciente)
    {
        this.BMIpaciente = BMIpaciente;
    }

    public float getBMIpaciente()
    {
        return BMIpaciente;
    }

    public void setTiposangrepaciente(String tiposangrepaciente)
    {
        this.tiposangrepaciente = tiposangrepaciente;
    }

    public String getTiposangrepaciente()
    {
        return tiposangrepaciente;
    }

    void agregarmedico (Medico x)
    {
        lista.add(x);
    }

    public ArrayList<Medico> getLista() {
        return lista;
    }
}
