package Paises;
public class mainPaises {

    public static void main(String[] args) {




        System.out.println("----------------------------------");


        Alemania alemania = new Alemania(  "Alemania");
        alemania.comunicarse();
        alemania.himno();
        alemania.bandera();
        alemania.gobierno();

        System.out.println("----------------------------------");



        uk uk= new uk("Reino Unido");
        uk.comunicarse();
        uk.bandera();
        uk.himno();
        uk.gobierno();


        System.out.println("----------------------------------");


         Espanya espanya = new Espanya("Reino de España");
        espanya.comunicarse();
        espanya.bandera();
        espanya.himno();
        espanya.gobierno();


        System.out.println("----------------------------------");



        Francia francia = new Francia("Republica de Francia");
        francia.comunicarse();
        francia.himno();
        francia.gobierno();
        francia.bandera();

        System.out.println("----------------------------------");


        Holanda holanda = new Holanda("Monarquía de los Países Bajos");
        holanda.bandera();
        holanda.himno();
        holanda.comunicarse();
        holanda.gobierno();


        System.out.println("----------------------------------");


    }

}