package Subasta;

public class Main {
    public static void main(String[] args) {

        Subasta subasta1 = new Subasta(1, "Subasta1");
        Lote lote1 = new Lote(11, "lote1", subasta1);
        Puja puja1 = new Puja(111,350.50, lote1, subasta1);
        Pujador pujador1 = new Pujador("75489546J", "Pepe", puja1);
        Articulo articulo1 = new Articulo(1111, "Jarron", 87.20, lote1);

//        System.out.println(subasta1.toString());
//        System.out.println(lote1.toString());
//        System.out.println(articulo1.toString());
//        System.out.println(puja1.toString());
//        System.out.println(pujador1.toString());

        for(Puja pujas: subasta1.getPujas()){
            System.out.println(pujas);
            for(Pujador pujadores: pujas.getPujadores()){
                System.out.println(pujadores);
            }
        }



    }


}