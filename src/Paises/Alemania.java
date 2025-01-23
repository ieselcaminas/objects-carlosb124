package Paises;

public class Alemania extends Paises {

    public Alemania(String nombre) {
        super(nombre);
    }


    public Object comunicarse() {
        System.out.println("Mi lengua es alemán");
        return null;
    }


    public void bandera() {
        System.out.println("Mi bandera es amarilla, roja y negra");
    }

    public void gobierno() {
        System.out.println("Mi forma de gobierno es una República");
    }

    public void himno() {
        System.out.println("Mi himno es del año 1848");
    }
}