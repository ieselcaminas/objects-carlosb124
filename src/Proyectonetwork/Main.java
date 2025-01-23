package Proyectonetwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Publicacion> lista = new ArrayList<>();

        Usuario Juan = new Usuario("Illoju","Juan", 1);
        Mensaje mensaje = new Mensaje(Juan, 1, "Grande juan");
        lista.add(mensaje);


        Usuario Kike = new Usuario("ErKike","Kike", 2);
        Foto fotografia = new Foto(Kike,"kikada.jpg", "literalmente kike");
        lista.add(fotografia);

        System.out.println(mensaje);
        System.out.println(fotografia);

    }
}