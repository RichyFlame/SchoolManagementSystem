package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements IServiciosAcademicos{
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private HashMap<Integer, ArrayList<Estudiante>> estudiantePorCurso = new HashMap<>();


    public GestorAcademico() {
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        Estudiante existeEstudiante = ExisteEstudiante(estudiante);

        if(existeEstudiante == null) {
            estudiante.setEstado(Estado.MATRICULADO);
            estudiantes.add(estudiante);
            System.out.println("El estudiante se ha matriculado correctamente.\n");
        }
        else System.out.println("El estudiante ya se encuentra matriculado.\n");
    }

    @Override
    public void agregarCurso(Curso curso) {
        Curso existeCurso = ExisteCurso(curso);

        if(existeCurso == null) {
            cursos.add(curso);
            System.out.println("El curso agrego correctamente.\n");
        }
        else System.out.println("El curso ya se encuentra agregado.\n");
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso){
        Estudiante e = ExisteEstudiante(estudiante.getId());
        Curso c = ExisteCurso(idCurso);

        if(e == null) System.out.println("El estudiante no se encuentra matriculado.\n");
        else if (c == null ) System.out.println("El curso no exsite.\n");
        else {
            try {
                ArrayList<Estudiante> lista = estudiantePorCurso.get(idCurso);

                if (lista == null) {
                    lista = new ArrayList<>();
                    estudiantePorCurso.put(idCurso, lista);
                }

                if (lista.contains(e)) {
                    throw new EstudianteYaInscritoException("El estudiante ya se encuentra inscrito.\n");
                }
                lista.add(e);
                System.out.println("Estudiante: " + e.getNombre() + " Asginado al Curso: " + c.getNombre() + "\n");

            } catch ( EstudianteYaInscritoException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {
        try {
            ArrayList<Estudiante> lista = estudiantePorCurso.get(idCurso);

            if (lista == null)  System.out.println("No existe alumnos asignados al curso.");
            else{
                Estudiante e = ExisteEstudiante(idEstudiante);
                Curso c = ExisteCurso(idCurso);

                if (e == null || !lista.contains(e)){
                    throw new EstudianteNoInscritoEnCursoException("El estudiante no se encuentra inscrito en el curso.\n");
                }

                lista.remove(e);
                System.out.println("Estudiante: " + e.getNombre() + " Desasignado del Curso: " + c.getNombre() + "\n");

            }
        } catch ( EstudianteNoInscritoEnCursoException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Estudiante ExisteEstudiante(Estudiante est){
        return estudiantes.stream()
                .filter( e -> e.getNombre().toUpperCase().equals(est.getNombre().toUpperCase()) && e.getApellido().toUpperCase().equals(est.getApellido().toUpperCase()))
                .findFirst()
                .orElse(null);
    }

    public Estudiante ExisteEstudiante(int idEstudiante){
        return estudiantes.stream()
                .filter( e -> e.getId() == idEstudiante)
                .findFirst()
                .orElse(null);
    }

    public Curso ExisteCurso(Curso curso){
        return cursos.stream()
                .filter( c -> c.getNombre().toUpperCase().equals(curso.getNombre().toUpperCase()))
                .findFirst()
                .orElse(null);
    }
    public Curso ExisteCurso(int idCurso){
        return cursos.stream()
                .filter( c -> c.getId() == idCurso)
                .findFirst()
                .orElse(null);
    }

    public void Cursos(){
        for (Curso c: cursos){
            System.out.println(c);
        }
    }

    public void Estudiantes(){
        for (Estudiante e: estudiantes){
            System.out.println(e);
        }
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}

class EstudianteNoInscritoEnCursoException extends Exception{
    public EstudianteNoInscritoEnCursoException(String message) {
        super(message);
    }
}

class EstudianteYaInscritoException extends Exception{
    public EstudianteYaInscritoException(String message) {
        super(message);
    }
}