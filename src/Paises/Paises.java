package Paises;

/**
 * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas!
 */
public class Paises
{
    private String nombre;

    /**
     * Constructor para objetos de la clase Animal
     */
    public Paises(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * El método comunicarse es común para el gato y el perro, aunque cada uno lo hace de una forma
     *
     * @return
     */
    public Object comunicarse()
    {
        System.out.println("Mi lengua es " + nombre);
        return null;
    }

    /**
     * El método respirar es común para el gato y el perro
     *
     */
    public void bandera()
    {
        System.out.println("Mi bandera es");
    }
    /**
     * El método moverse es común para el gato y el perro
     *
     */
    public void gobierno()
    {
        System.out.println("Mi forma de gobierno es una República");
    }
    /**
     * El método mamar es común para el gato y el perro
     *
     */
    public void himno()
    {
        System.out.println("Mi himno es del año 1752");
    }
    /**
     *
     * toString() Representación como cadena de un objeto animal
     *
     * @returns  La representación como cadena de un objeto animal
     *
     */
    public String toString()
    {
        return "Animal: " + nombre;
    }



    public void main(String[] args) {
        System.out.println(this.comunicarse());
    }
}