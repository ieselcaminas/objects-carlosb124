package ProyectoTrabajadores;

public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return "Cargo: " + this.getNombre();
    }
}