package animalitos;

public abstract class Animal {
    private String nombre;
    private String specie;


    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comunicarse() {
        System.out.println("Mi nombre es " + nombre);
    }


    public abstract void respirar();

    public abstract void moverse();

}
