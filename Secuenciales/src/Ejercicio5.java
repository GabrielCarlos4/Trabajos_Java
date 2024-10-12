import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduce la distancia del viaje en km: ");
        double distancia=scanner.nextDouble();

        System.out.print("Introduce el consumo de combustible del vehiculo en litros por km: ");
        double consumoCombustible=scanner.nextDouble();

        System.out.print("Introduce el precio del combsutible por litro: ");
        double precioCombustible=scanner.nextDouble();

        double costoTotal=distancia*consumoCombustible*precioCombustible;
        System.out.println("El costo total del viaje es: " + costoTotal + " pesos");
    }
}
