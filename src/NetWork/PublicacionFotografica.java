package NetWork;

public class PublicacionFotografica  extends Publicacion {
    private String titulo;
    private String archivoImagen;


    PublicacionFotografica(String autor, String marcaTemporal, String titulo, String archivoImagen){
        super(autor, marcaTemporal);
        this.titulo = titulo;
        this.archivoImagen = archivoImagen;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getArchivoImagen(){
        return archivoImagen;
    }

    public String mostrarContenido(){
        return "Titulo: " + titulo + ", Imagen: " + archivoImagen;
    }









}
