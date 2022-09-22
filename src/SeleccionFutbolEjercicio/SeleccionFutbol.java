package SeleccionFutbolEjercicio;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Concentrarse(){
        System.out.println(getNombre()+ " "+ getApellido()+ " debes concentrar para la proxima fecha");
    }

    public void Viajar(){
        System.out.println(getNombre()+ " "+ getApellido()+" la proxima fecha viajas a Monteria ....");
    }

    public void Entrenar(){
        System.out.println(getNombre()+ " "+ getApellido()+" esta semana entrenamos a doble turno ...");
    }

    public void JugarPartido(){
        System.out.println(getNombre()+ " "+ getApellido()+ " esta semana debemos jugar para ganar ....");
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
