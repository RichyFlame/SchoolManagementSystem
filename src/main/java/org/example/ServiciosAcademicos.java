package org.example;

public interface ServiciosAcademicos {
    void matricularEstudiante(Estudiante estudiante);
    void agregarCurso(Curso curso);
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso);
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso);
}
