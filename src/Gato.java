public class Gato extends Animal{

    public Gato(String nombre){
        super(nombre);
    }

    public Object comunicarse(){
        System.out.println("miau");
        return null;
    }

    public void jugarConOvillos(){
        System.out.println("Me gusta jugar con ovillos");

    }

    public void respirar(){
        System.out.println("Respiro por los pulmones");
    }

}
