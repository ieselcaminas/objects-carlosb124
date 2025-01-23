package Paises;

public class Holanda extends Paises {

    public Holanda(String nombre) {
        super(nombre);
    }


    public Object comunicarse() {
        System.out.println("Mi lengua es el holandés");
        return null;
    }


    public void bandera() {
        System.out.println("Mi bandera es azul, roja y blanca");
    }

    public void gobierno() {
        System.out.println("Mi forma de gobierno es una Monarquía");
    }

    public void himno() {
        System.out.println("Mi himno es del año 1603");
    }
}