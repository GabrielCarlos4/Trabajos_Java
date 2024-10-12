import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Double preciofinal, precioProducto, descuento = 0.0;

        System.out.println("Ingrese el precio de su producto");
        precioProducto=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ahora ingrese su categoria (estudiante, adulto, jubilado) para darle su descuento");
        String categoria = scanner.nextLine().toLowerCase();

        if (categoria.equals("estudiante")) {descuento=0.10;
        } else if (categoria.equals("adulto")) {descuento = 0.5;
        } else if (categoria.equals("jubilado")) {descuento = 0.15;
        } else {
            System.out.println("Categoría no reconocida, no se le proporcionará un descuento");
        }

        preciofinal= precioProducto-(precioProducto*descuento);
        System.out.println("El precio final despues del descuento es de: " + preciofinal);
        scanner.close();
        }
    }
