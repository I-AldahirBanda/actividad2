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
        // Ejemplo 1
        String nombre1 = "Aldahir Banda";
        int[] calificaciones1 = {85, 90, 78, 92, 88};
        Alumno alumno1 = new Alumno(nombre1, calificaciones1);
        double promedio1 = alumno1.calcularPromedio();
        char calificacionFinal1 = alumno1.obtenerCalificacionFinal(promedio1);
        alumno1.imprimirResultados(promedio1, calificacionFinal1);

        // Ejemplo 2
        String nombre2 = "Pavel Pardo";
        int[] calificaciones2 = {60, 70, 65, 68, 72};
        Alumno alumno2 = new Alumno(nombre2, calificaciones2);
        double promedio2 = alumno2.calcularPromedio();
        char calificacionFinal2 = alumno2.obtenerCalificacionFinal(promedio2);
        alumno2.imprimirResultados(promedio2, calificacionFinal2);

        // Ejemplo 3
        String nombre3 = "Jose Jose (El triste)";
        int[] calificaciones3 = {40, 50, 45, 55, 60};
        Alumno alumno3 = new Alumno(nombre3, calificaciones3);
        double promedio3 = alumno3.calcularPromedio();
        char calificacionFinal3 = alumno3.obtenerCalificacionFinal(promedio3);
        alumno3.imprimirResultados(promedio3, calificacionFinal3);
    }
}
