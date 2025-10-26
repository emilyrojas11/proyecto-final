package appidiomas;

import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correo;
    private int puntos;
    private List<Curso> cursos;
    private List<Logro> logros;
    private Progreso progreso;

    public Usuario(int idUsuario, String nombre, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.puntos = 0;
    }

    // Métodos del UML
    public void registrarse() {
        System.out.println(nombre + " se ha registrado.");
    }

    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void completarLeccion() {
        System.out.println(nombre + " completó una lección.");
    }

    public void verLogros() {
        System.out.println("Logros de " + nombre + ": " + logros);
    }

    // Getters y setters
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }

    public List<Curso> getCursos() { return cursos; }
    public void setCursos(List<Curso> cursos) { this.cursos = cursos; }

    public List<Logro> getLogros() { return logros; }
    public void setLogros(List<Logro> logros) { this.logros = logros; }

    public Progreso getProgreso() { return progreso; }
    public void setProgreso(Progreso progreso) { this.progreso = progreso; }
}
