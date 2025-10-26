package appidiomas;

import java.util.List;

public class Curso {
    private int idCurso;
    private String idioma;
    private String nivel;
    private List<Leccion> lecciones;

    public Curso(int idCurso, String idioma, String nivel) {
        this.idCurso = idCurso;
        this.idioma = idioma;
        this.nivel = nivel;
    }

    public void iniciarCurso() {
        System.out.println("Iniciando curso de " + idioma);
    }

    public void mostrarLecciones() {
        System.out.println("Mostrando lecciones del curso " + idioma);
    }

    // Getters y setters
    public int getIdCurso() { return idCurso; }
    public void setIdCurso(int idCurso) { this.idCurso = idCurso; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public List<Leccion> getLecciones() { return lecciones; }
    public void setLecciones(List<Leccion> lecciones) { this.lecciones = lecciones; }
}
