package Paises;


public class Francia extends Paises {

    public Francia(String nombre) {
        super(nombre);
    }


    public Object comunicarse() {
        System.out.println("Mi lengua es francés");
        return null;
    }


    public void bandera() {
        System.out.println("Mi bandera es azul, blanca y roja");
    }

    public void gobierno() {
        System.out.println("Mi forma de gobierno es una República");
    }

    public void himno() {
        System.out.println("Mi himno es del año 1792");
    }
}