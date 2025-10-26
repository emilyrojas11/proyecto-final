package appidiomas;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(1, "Emily", "emily@example.com");
        u1.registrarse();
        u1.iniciarSesion();

        Curso curso = new Curso(1, "Inglés", "Básico");
        curso.iniciarCurso();

        Progreso progreso = new Progreso(1, 50, 5);
        progreso.actualizarProgreso();
    }
}
