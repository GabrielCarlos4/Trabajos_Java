import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese su condicion fisica (principiante, intermedio, avanzado)");
        String nivel= scanner.next().toLowerCase();

        switch (nivel){
            case "principiante":
                generarRutinaPrincipiante();
                break;
            case "intermedio":
                generarRutinaIntermedio();
                break;
            case "avanzado":
                generarRutinaAvanzado();
                break;
            default:
                System.out.println("No reconocido.");
                return;
        }
    }
    public static void generarRutinaPrincipiante() {
        System.out.println("\nRutina para Principiantes:");
        System.out.println("Lunes: Caminata rápida - 30 minutos");
        System.out.println("Martes: Ejercicios de fuerza (flexiones, abdominales) - 20 minutos");
        System.out.println("Miércoles: Descanso");
        System.out.println("Jueves: Nadar - 20 minutos");
        System.out.println("Viernes: Caminata rápida - 30 minutos");
        System.out.println("Sábado: Ejercicios de flexibilidad (yoga) - 20 minutos");
        System.out.println("Domingo: Descanso");
    }

    public static void generarRutinaIntermedio() {
        System.out.println("\nRutina para Intermedios:");
        System.out.println("Lunes: Correr - 40 minutos");
        System.out.println("Martes: Ejercicios de fuerza (flexiones, abdominales, sentadillas) - 30 minutos");
        System.out.println("Miércoles: Bicicleta - 40 minutos");
        System.out.println("Jueves: Descanso");
        System.out.println("Viernes: Correr - 40 minutos");
        System.out.println("Sábado: Ejercicios de fuerza (pesas) - 30 minutos");
        System.out.println("Domingo: Descanso");
    }

    public static void generarRutinaAvanzado() {
        System.out.println("\nRutina para Avanzados:");
        System.out.println("Lunes: Correr - 60 minutos");
        System.out.println("Martes: Ejercicios de fuerza (pesas, flexiones, abdominales) - 45 minutos");
        System.out.println("Miércoles: Bicicleta - 60 minutos");
        System.out.println("Jueves: Descanso");
        System.out.println("Viernes: Correr - 60 minutos");
        System.out.println("Sábado: Ejercicios de fuerza (pesas, sentadillas) - 45 minutos");
        System.out.println("Domingo: Descanso");
    }
}
