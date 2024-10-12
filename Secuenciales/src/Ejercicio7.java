import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nivel de satisfacción con la vida (1-10): ");
        int satisfaccionVida = scanner.nextInt();

        System.out.print("Introduce tu nivel de estrés (1-10): ");
        int nivelEstres = scanner.nextInt();

        System.out.print("Introduce tu nivel de salud (1-10): ");
        int nivelSalud = scanner.nextInt();

        System.out.print("Introduce tu nivel de relaciones sociales (1-10): ");
        int nivelRelaciones = scanner.nextInt();

        double pesoSatisfaccion = 0.4;
        double pesoEstres = -0.3;
        double pesoSalud = 0.2;
        double pesoRelaciones = 0.1;

        double indiceFelicidad = (satisfaccionVida * pesoSatisfaccion) +
                (nivelEstres * pesoEstres) +
                (nivelSalud * pesoSalud) +
                (nivelRelaciones * pesoRelaciones);

        System.out.println("Tu índice de felicidad es: " + indiceFelicidad);
    }
}
