import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa cuántas horas al día duermes:");
        int horasDormidas = scanner.nextInt();

        System.out.println("Ahora, ingresa cuántas horas al día haces ejercicio:");
        int horasEjercicio = scanner.nextInt();

        System.out.println("Finalmente, ingresa cuántas comidas saludables consumes al día:");
        int comidasSaludables = scanner.nextInt();

        String evaluacion = "";

        if (horasDormidas >= 7 && horasDormidas <= 9) {
            evaluacion += "Duermes la cantidad recomendada de horas. ";
        } else if (horasDormidas < 7) {
            evaluacion += "Duermes menos de las horas recomendadas. Intenta dormir más. ";
        } else {
            evaluacion += "Duermes más de las horas recomendadas. Asegúrate de que tu sueño sea de calidad. ";
        }

        if (horasEjercicio >= 1 && horasEjercicio <= 2) {
            evaluacion += "Haces ejercicio la cantidad recomendada de horas. ";
        } else if (horasEjercicio < 1) {
            evaluacion += "Haces menos ejercicio de lo recomendado. Intenta hacer más actividad física. ";
        } else {
            evaluacion += "Haces más ejercicio de lo recomendado. Asegúrate de descansar adecuadamente. ";
        }

        if (comidasSaludables >= 3) {
            evaluacion += "Consumes la cantidad recomendada de comidas saludables. ";
        } else {
            evaluacion += "Consumes menos comidas saludables de lo recomendado. Intenta incluir más alimentos nutritivos en tu dieta. ";
        }

        System.out.println("Evaluación de tus hábitos saludables:");
        System.out.println(evaluacion);

        // Cerrar el scanner
        scanner.close();
    }
}
