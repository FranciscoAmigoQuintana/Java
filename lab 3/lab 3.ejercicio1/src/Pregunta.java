public class Pregunta {

    private String pregunta;
    private int puntaje;

    Pregunta(String pregunta)
    {
        this.pregunta=pregunta;
        this.puntaje=20;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getPuntaje() {
        return puntaje;
    }

}
