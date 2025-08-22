package org.example;

public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private int numeroDeCreditos;
    private int version;

    public Curso() {
    }

    public Curso(int id, String nombre, String descripcion, int numeroDeCreditos, int version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroDeCreditos = numeroDeCreditos;
        this.version = version;
    }

    @Override
    public String toString() {
        return "CURSO " +
                "\n ID: " + id +
                "\n NOMBRE: " + nombre +
                "\n DESCRIPCION: " + descripcion +
                "\n CREDITOS: " + numeroDeCreditos +
                "\n VERSION: " + version;
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

    public int getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public void setNumeroDeCreditos(int numeroDeCreditos) {
        this.numeroDeCreditos = numeroDeCreditos;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
