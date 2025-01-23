public class PezPayaso extends Animal{


    public PezPayaso(String nombre){
        super(nombre);
    }


    public Object comunicarse(){
        System.out.println("Glu glu");
        return null;
    }

    public void perderse(){
        System.out.println("Amego donde estoy");

    }

    public void respirar(){
        System.out.println("Respiro por las branquias");
    }

    public void moverse()
    {
        System.out.println("Nado con aletas");
    }


}
