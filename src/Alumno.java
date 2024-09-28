public class Alumno {
    // Atributos
    private String nombre;
    private int[] calificaciones;

    // Constructor
    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir los resultados
    public void imprimirResultados(double promedio, char calificacionFinal) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Datos de ejemplo
        String nombre = "Juan Pérez";
        int[] calificaciones = {85, 90, 78, 92, 88};

        // Creación de un objeto de la clase Alumno
        Alumno alumno = new Alumno(nombre, calificaciones);

        // Calcular el promedio
        double promedio = alumno.calcularPromedio();

        // Obtener la calificación final
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);

        // Imprimir los resultados
        alumno.imprimirResultados(promedio, calificacionFinal);
    }
}
