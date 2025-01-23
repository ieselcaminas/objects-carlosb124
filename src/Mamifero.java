public class Mamifero extends Animal{

    public Mamifero(String nombre){
        super(nombre);
    }


    public Object comunicarse(){
        System.out.println("Hola que tal");
        return null;
    }

    public void respirar(){
        System.out.println("Respiro por los pulmones");
    }

    public void mamar(){
        System.out.println("Toma leche");

    }

    public static class Tiburon extends Animal {

        public Tiburon(String nombre){
            super(nombre);
        }


        public Object comunicarse(){
            System.out.println("Con las aletas");
            return null;
        }

        public void comerHumano(){
            System.out.println("Toma mordisco Amigo");

        }

        public void respirar(){
            System.out.println("Respiro por las branquias");
        }

        public void moverse()
        {
            System.out.println("Nado con aletas");
        }


    }
}
