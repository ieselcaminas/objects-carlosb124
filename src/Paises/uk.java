package Paises;


public class uk extends Paises {

    public uk(String nombre) {
        super(nombre);
    }


    public Object comunicarse() {
        System.out.println("Mi lengua es el inglés");
        return null;
    }


    public void bandera() {
        System.out.println("Mi bandera es roja, azul y blanca");
    }

    public void gobierno() {
        System.out.println("Mi forma de gobierno es una Monarquía");
    }

    public void himno() {
        System.out.println("Mi himno es del año 1802");
    }
}