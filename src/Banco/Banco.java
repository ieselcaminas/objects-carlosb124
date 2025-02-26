package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int n_ent;
    private String nombre;
    private List<Sucursal> sucursales;

    public Banco(int n_ent, String nombre) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public int getN_ent() {
        return n_ent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    public List<Sucursal> getSucursales() {
        return this.sucursales;
    }

    @Override
    public String toString(){
        return this.n_ent + " - " + this.nombre;
    }
}