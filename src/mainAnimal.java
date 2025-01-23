public class mainAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal("Pedro");

        System.out.println(animal.getNombre());

        animal.comunicarse();

        System.out.println("----------------------------------");


        Perro perro = new Perro(  "Pola");
        perro.comunicarse();
        perro.traerZapatillas();
        perro.respirar();
        perro.mamar();
        perro.moverse();

        System.out.println("----------------------------------");



        Gato gato = new Gato("Mordisquitos");
        gato.comunicarse();
        gato.jugarConOvillos();
        gato.respirar();
        gato.mamar();
        gato.moverse();

        System.out.println("----------------------------------");


        Tiburon tiburon = new Tiburon("Albert");
        tiburon.comunicarse();
        tiburon.comerHumano();
        tiburon.respirar();
        tiburon.moverse();

        System.out.println("----------------------------------");



        Mamifero mamifero = new Mamifero("Corleone");
        mamifero.comunicarse();
        mamifero.mamar();
        mamifero.respirar();
        mamifero.moverse();

        System.out.println("----------------------------------");


        PezPayaso pezPayaso = new PezPayaso("Nemo");
        pezPayaso.comunicarse();
        pezPayaso.perderse();
        pezPayaso.respirar();
        pezPayaso.moverse();

        System.out.println("----------------------------------");


        System.out.println(animal);
    }

}
