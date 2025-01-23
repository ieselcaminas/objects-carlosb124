package NetWork;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Publicacion>publicacions;

    public Network() {
        this.publicacions = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion)  {
        publicacions.add(publicacion);
    }


    public List <Publicacion> buscarPorAutor (String autor) {
         List<Publicacion> resultado = new ArrayList<>();

        for (Publicacion publicacion : publicacions) {
            if (publicacion.getAutor().equalsIgnoreCase(autor)) {

                resultado.add(publicacion);
            }
        }
        return resultado;
    }

    public void mostrarPublicaciones() {

        for (Publicacion publicacion:publicacions){
            System.out.println("ID: " + publicacion.getID());
            System.out.println("Autor: " +publicacion.getAutor());
            System.out.println("Fecha: " +publicacion.getMarcaTemporal());
            System.out.println("Likes: " +publicacion.getNumerolikes());
        }

    }
}
