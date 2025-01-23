package biblioteca;

public class Main {
    public static void main(String[] args) {

        Autor cerv = new Autor(1, "Cervantes");
        Tema nov = new Tema(1, "Novela");
        Editorial ed = new Editorial(1, "Plaza");
        Libro quijote = new Libro(1, "Quijote", ed);

        ed.addLibro(quijote);
        cerv.addLibro(quijote);
        quijote.addAutor(cerv);
        quijote.addTema(nov);

        Ejemplar ejQuijote = new Ejemplar(1, quijote);
        Ejemplar ejQuijote2 = new Ejemplar(2, quijote);

        quijote.addEjemplar(ejQuijote);
        quijote.addEjemplar(ejQuijote2);

        Lector pere = new Lector(1, "Pere");
        pere.addEjemplar(ejQuijote);

        Historico historico = new Historico(1, pere, ejQuijote, "hoy", "mañana");
    }
}