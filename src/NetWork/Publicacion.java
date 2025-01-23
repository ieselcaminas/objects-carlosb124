package NetWork;

import java.util.ArrayList;
import java.util.List;

abstract class Publicacion {
    private static int contadorId = 1;
    private static int id;
    private String autor;
    private String marcaTemporal;
    private int numerolikes;
    private List<String> comentarios;

    public Publicacion (String autor, String marcaTemporal){
        this.id = contadorId++;
        this.autor = autor;
        this.marcaTemporal = marcaTemporal;
        this.numerolikes = 0;
        this.comentarios = new ArrayList<>();
    }

    public Publicacion(String usuario) {
    }

    public static int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getMarcaTemporal() {
        return marcaTemporal;
    }

    public int getNumerolikes() {
        return numerolikes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void darLikes(){
        numerolikes++;
    }
    public void agregarComentario(String comentario){
        comentario.add(comentario);
    }
}
