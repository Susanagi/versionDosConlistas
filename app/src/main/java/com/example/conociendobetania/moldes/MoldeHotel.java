package com.example.conociendobetania.moldes;

public class MoldeHotel {

    private String nombre;
    private String precio;
    private String contacto;
    private Integer foto;

    public MoldeHotel() {
    }

    public MoldeHotel(String nombre, String precio, String contacto, Integer foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.contacto = contacto;
        this.foto = foto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
