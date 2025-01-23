package Proyectonetwork;

public class Foto extends Publicacion {
    private String nombreImagen;
    private String tituloFotografia;

    public Foto(Usuario usuario, String nombreImagen, String tituloFotografia) {
        super(usuario);
        this.nombreImagen = nombreImagen;
        this.tituloFotografia = tituloFotografia;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }
    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getTituloFotografia() {
        return tituloFotografia;
    }

    @Override
    public String toString() {
        return nombreImagen + " - " + tituloFotografia;
    }
}