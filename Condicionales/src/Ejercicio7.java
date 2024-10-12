import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su estado de animo\n1.feliz, 2.triste, 3.enérgico, 4.relajado");
        String animo = scanner.nextLine().toLowerCase();

        if (animo.equals("feliz")) {
            System.out.println("Recomendación: Salir a pasear por un parque o hacer ejercicio al aire libre.");
        } else if (animo.equals("triste")) {
            System.out.println("Recomendación: Escuchar música relajante o leer un libro que te guste.");
        } else if (animo.equals("enérgico")) {
            System.out.println("Recomendación: Hacer ejercicio intenso como correr o jugar un deporte.");
        } else if (animo.equals("relajado")) {
            System.out.println("Recomendación: Tomar un baño relajante o meditar.");
        } else {
            System.out.println("Estado de ánimo no reconocido. Por favor, ingrese uno de los estados mencionados.");
        }

        scanner.close();
    }
}
