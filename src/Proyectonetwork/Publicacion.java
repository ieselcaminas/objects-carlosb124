package Proyectonetwork;

import java.util.Date;

public abstract class Publicacion {
    private Usuario usuario;
    private Date fecha;
    private Mensaje mensaje;
    private int like;

    public Publicacion (Usuario usuarios){
        this.usuario = usuarios;
        this.fecha = new Date();
        this.like = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha(){
        return fecha;
    }

    public int getLike(){
        return like;
    }

    public void setLike(int like){
        this.like = like + 1;
    }
    public void setDislike(int like){
        this.like = like - 1;
    }
}