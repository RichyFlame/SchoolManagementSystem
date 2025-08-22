package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private HashMap<Integer, ArrayList<Estudiante>> estudiantePorCurso = new HashMap<>();

    public GestorAcademico() {
    }


    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

}
