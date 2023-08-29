package com.example.conociendobetania.moldes;

public class Molderestaurante {

    private String nombre;
    private String foto;
    private String telefono;
    private String rangoprecio;
    private String platorecomendado;

    public Molderestaurante() {
    }

    public Molderestaurante(String nombre, String foto, String telefono, String rangoprecio, String platorecomendado) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        this.rangoprecio = rangoprecio;
        this.platorecomendado = platorecomendado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoprecio() {
        return rangoprecio;
    }

    public void setRangoprecio(String rangoprecio) {
        this.rangoprecio = rangoprecio;
    }

    public String getPlatorecomendado() {
        return platorecomendado;
    }

    public void setPlatorecomendado(String platorecomendado) {
        this.platorecomendado = platorecomendado;
    }
}

