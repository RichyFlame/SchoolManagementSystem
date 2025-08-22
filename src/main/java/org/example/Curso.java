package org.example;

public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private byte numeroDeCreditos;
    private byte version;

    public Curso() {
    }

    public Curso(int id, String nombre, String descripcion, byte numeroDeCreditos, byte version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroDeCreditos = numeroDeCreditos;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public byte getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public void setNumeroDeCreditos(byte numeroDeCreditos) {
        this.numeroDeCreditos = numeroDeCreditos;
    }

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }
}
