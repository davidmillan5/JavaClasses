package SeleccionFutbolEjercicio;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }


    public void Entrevista(){
        System.out.println("Ha sido un partido dificil, pero se ha logrado el resultado ...");
    }


}
