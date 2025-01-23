package fotografo;


public class Main {
    public static void main(String[] args) {
        Camara c = new Camara("Canon");
        Fotografo pepe = new Fotografo("Alberto", c);
        pepe.tomarFoto();

        Movil movil = new Movil("Motorola");
        Fotografo juan = new Fotografo("pepe", movil);
        juan.tomarFoto();

        GoPro goPro = new GoPro("modelo");
        Fotografo andres = new Fotografo("Samu", goPro);
        andres.tomarFoto();

    }
}