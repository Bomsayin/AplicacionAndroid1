package com.intercambiophoto.aplicacionandroi;

public class ListElement {
    public String nombre;
    public String descripcion;

    public ListElement(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion= descripcion;
    }

    public ListElement(String nombre, String descripcion, Integer integer, Integer integer1) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
