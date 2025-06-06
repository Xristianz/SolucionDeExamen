package ec.edu.ups.poo;

public class Main {
    public static void main(String[] args) {
        Asignatura matematicas = new Asignatura("MAT101", "Matemáticas");
        Asignatura historia = new Asignatura("HIS201", "Historia");

        Curso curso1 = new Curso("Primer Año");

        Estudiante estudiante1 = new Estudiante("E001", "Carlos Pérez");
        Estudiante estudiante2 = new Estudiante("E002", "Ana García");

        estudiante1.agregarCalificacion(new Calificacion(85.5, matematicas));
        estudiante1.agregarCalificacion(new Calificacion(90.0, historia));

        estudiante2.agregarCalificacion(new Calificacion(78.0, matematicas));
        estudiante2.agregarCalificacion(new Calificacion(88.5, historia));

        curso1.agregarEstudiante(estudiante1);
        curso1.agregarEstudiante(estudiante2);

        System.out.println(curso1);
        for (Estudiante estudiante : curso1.getEstudiantes()) {
            System.out.println("  " + estudiante);
            for (Calificacion calificacion : estudiante.getCalificaciones()) {
                System.out.println("    " + calificacion);
            }
        }
    }
}