import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la duracion del ejercicio en minutos");
        int duracion = scanner.nextInt();

        System.out.print("Ingrese el tipo de ejercicio (correr, nadar, bicicleta)");
        String tipoEjercicio = scanner.next().toLowerCase();

        double tasaCorrer=0.129;
        double tasaNadar=0.135;
        double tasaBicicleta=0.105;

        double caloriasQuemadas=0;
        switch (tipoEjercicio) {
            case "correr":
                caloriasQuemadas=peso*tasaCorrer*duracion;
                break;
            case "nadar":
                caloriasQuemadas=peso*tasaNadar*duracion;
                break;
            case "bicicleta":
                caloriasQuemadas=peso*tasaBicicleta*duracion;
                break;
            default:
                System.out.println("Ejercicio no reconocido.");
                return;
        }
        System.out.println("Calorias quemadas: " + caloriasQuemadas + " kcal");
    }
}
