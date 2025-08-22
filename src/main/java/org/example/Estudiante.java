package org.example;
import java.time.LocalDate;

public class Estudiante extends Persona{

    private Estado estado;

    public Estudiante(int id, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(id, nombre, apellido, fechaNacimiento);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ESTUDIANTE: "
                + "\nID: " + super.getId()
                + "\nNOMBRE: " + super.getNombre() + " " + super.getApellido()
                + "\n FECHA NACIMIENTO: " + super.getFechaNacimiento()
                + "\n ESTADO: " + estado;

    }
}
