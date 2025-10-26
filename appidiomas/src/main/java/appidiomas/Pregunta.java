package appidiomas;

import java.util.List;

public class Pregunta {
    private int idPregunta;
    private String texto;
    private List<String> opciones;
    private String respuestaCorrecta;

    public Pregunta(int idPregunta, String texto, List<String> opciones, String respuestaCorrecta) {
        this.idPregunta = idPregunta;
        this.texto = texto;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public boolean verificarRespuesta(String respuesta) {
        return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }

    // Getters y setters
    public int getIdPregunta() { return idPregunta; }
    public void setIdPregunta(int idPregunta) { this.idPregunta = idPregunta; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public List<String> getOpciones() { return opciones; }
    public void setOpciones(List<String> opciones) { this.opciones = opciones; }

    public String getRespuestaCorrecta() { return respuestaCorrecta; }
    public void setRespuestaCorrecta(String respuestaCorrecta) { this.respuestaCorrecta = respuestaCorrecta; }
}
