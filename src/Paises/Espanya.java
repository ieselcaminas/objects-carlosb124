package Paises;


public class Espanya extends Paises {

    public Espanya(String nombre) {
        super(nombre);
    }


    public Object comunicarse() {
        System.out.println("Mi lengua es castellano");
        return null;
    }


    public void bandera() {
        System.out.println("Mi bandera es roja, amrailla y roja");
    }

    public void gobierno() {
        System.out.println("Mi forma de gobierno es una Monarquía");
    }

    public void himno() {
        System.out.println("Mi himno es del año 1767");
    }
}