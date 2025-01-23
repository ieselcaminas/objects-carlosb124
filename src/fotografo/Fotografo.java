package fotografo;

public class Fotografo {
    private String nombre;
    private TomarFoto dispositivo;

    public Fotografo(String nombre, TomarFoto dispositico) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TomarFoto getCamara() {
        return dispositivo;
    }

    public void setCamara(TomarFoto aparatoQueTomaFoto) {
        this.dispositivo = aparatoQueTomaFoto;
    }

    public void tomarFoto(){
        this.dispositivo.tomarFoto();
    }
}