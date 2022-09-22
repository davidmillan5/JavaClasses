package SeleccionFutbolEjercicio;

public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }


    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }


    public void PlanificarEntrenamiento(){
        System.out.println("Esta semana entrenamos a doble turno ....");
    }



}
