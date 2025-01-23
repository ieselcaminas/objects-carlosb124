package NetWork;

public class PublicaciónTexto extends Publicacion {

    private String mensaje;
    private String mostrarContenido;

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMostrarContenido() {
        return mostrarContenido;
    }

    public void setMostrarContenido(String mostrarContenido) {
        this.mostrarContenido = mostrarContenido;
    }

    public PublicacionTexto(String autor, String marcaTemporal, String mensaje) {
        super(autor, marcaTemporal);
        this.mensaje = mensaje;
    }

    @Override
    public  String mostrarContenido (){
        return "mensaje: " + mensaje;
    }




}
