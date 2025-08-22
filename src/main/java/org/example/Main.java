package org.example;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante ricardo = new Estudiante(1, "Ricardo", "Villatoro", LocalDate.of(1998, 8,31));
        Estudiante javier = new Estudiante(2, "Javier", "Bamaca", LocalDate.of(2000, 7,20));

        Curso mate = new Curso(1, "Matematicas 1", "Matematicas basicas", 5, 1);
        Curso fisica = new Curso(2, "Fisica basica", "Funadamentos de fisica", 5, 1);

        GestorAcademico gestorAcademico = new GestorAcademico();

        // Cursos
        gestorAcademico.agregarCurso(mate);
        gestorAcademico.agregarCurso(fisica);
        gestorAcademico.Cursos();

        // Estudiantes
        gestorAcademico.matricularEstudiante(ricardo);
        gestorAcademico.matricularEstudiante(javier);
        gestorAcademico.Estudiantes();

        // Inscribir estudiante
        gestorAcademico.inscribirEstudianteCurso(ricardo, 1);
        gestorAcademico.inscribirEstudianteCurso(ricardo, 1);
        gestorAcademico.inscribirEstudianteCurso(ricardo, 2);

        gestorAcademico.inscribirEstudianteCurso(javier, 1);
        gestorAcademico.inscribirEstudianteCurso(javier, 2);
        gestorAcademico.inscribirEstudianteCurso(javier, 2);

        // Desinscribir estudiante
        Estudiante prueba = new Estudiante(3, "Prueba", "Eliminar", LocalDate.of(2020, 2,7));
        gestorAcademico.desinscribirEstudianteCurso(2, 2);
        gestorAcademico.desinscribirEstudianteCurso(3,2);
    }
}