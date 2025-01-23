package Proyectonetwork;

public class Mensaje extends Publicacion {

    private int id;
    private String texto;

    public Mensaje(Usuario usuarios, int id, String texto) {
        super(usuarios);
        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.getUsuario() + " - " + this.getTexto();
    }
}