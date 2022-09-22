package SeleccionFutbolEjercicio;

public class Main {
    public static void main(String[] args) {

        Futbolista delantero9 = new Futbolista(1,"Ronaldo","Nazario",28,9,"Delantero");
        System.out.println(delantero9);
        delantero9.Concentrarse();
        delantero9.Viajar();
        delantero9.Entrenar();


        Entrenador mister = new Entrenador(2,"Jurgen","Klopp",56,12);
        System.out.println(mister);
        mister.Viajar();


        Masajista masajista = new Masajista(3,"Anna","Kournikova",34,"Fisio",5);
        System.out.println(masajista);
        masajista.Viajar();

    }
}
