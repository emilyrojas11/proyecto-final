package appidiomas;

public class Logro {
    private int idLogro;
    private String nombre;
    private String descripcion;
    private int puntosRequeridos;

    public Logro(int idLogro, String nombre, String descripcion, int puntosRequeridos) {
        this.idLogro = idLogro;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puntosRequeridos = puntosRequeridos;
    }

    public void otorgar() {
        System.out.println("Logro obtenido: " + nombre);
    }

    // Getters y setters
    public int getIdLogro() { return idLogro; }
    public void setIdLogro(int idLogro) { this.idLogro = idLogro; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getPuntosRequeridos() { return puntosRequeridos; }
    public void setPuntosRequeridos(int puntosRequeridos) { this.puntosRequeridos = puntosRequeridos; }
}
