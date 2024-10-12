import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos");
        Double peso = scanner.nextDouble();
        System.out.println("Ingrese su altura en metros");
        Double altura = scanner.nextDouble();

        Double IMC = peso/(altura*altura);
        System.out.printf("Tu IMC es: %.2f%n", IMC);
        if (IMC < 18.5) {
            System.out.println("Tienes bajo peso. Te recomendamos consultar a un nutricionista.");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("Tu peso es normal.");
        } else if (IMC >= 25 && IMC < 29.9) {
            System.out.println("Tienes sobrepeso. Te recomendamos hacer más ejercicio y revisar tu dieta.");
        } else {
            System.out.println("Tienes obesidad. Es importante que consultes a un médico o nutricionista.");
        }
        scanner.close();
    }
}
