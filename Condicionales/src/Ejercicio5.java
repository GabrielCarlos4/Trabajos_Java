import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Por favor, elige una opción (piedra, papel, tijera):");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
            System.out.println("Elección no válida. Por favor, elige entre piedra, papel o tijera.");
            scanner.close();
            return;
        }
        String eleccionPrograma = opciones[random.nextInt(opciones.length)];

        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección del programa: " + eleccionPrograma);

        if (eleccionUsuario.equals(eleccionPrograma)) {
                System.out.println("Empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionPrograma.equals("tijera")) ||
                    (eleccionUsuario.equals("papel") && eleccionPrograma.equals("piedra")) ||
                    (eleccionUsuario.equals("tijera") && eleccionPrograma.equals("papel"))) {
                System.out.println("¡Ganaste!");
        } else {
                System.out.println("¡Perdiste!");
        }
            scanner.close();
        }
    }
