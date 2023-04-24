public class Persona implements Comparable<Persona>{
    private String nombre;
    private int id;
    private int edad;
    private int prioridad;
    private int amigos;

    public Persona(String nombre, int id, int edad, int prioridad, int amigos) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.prioridad = prioridad;
        this.amigos = amigos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getAmigos() {
        return amigos;
    }

    public void setAmigos(int amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "ID: " + id + "\n" +
                "Edad: " + edad + "\n" +
                "Prioridad: " + prioridad + "\n" +
                "Amigos: " + amigos + "\n\n";
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(prioridad, o.prioridad);
    }
}
