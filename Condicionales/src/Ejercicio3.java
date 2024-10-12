import javax.swing.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String libro = "";
        
        System.out.println("Ingrese su genero literario favortico(fantasía, misterio, romance, ciencia ficción):");
        String genero = scanner.nextLine().toLowerCase();
        
        if (genero.equals("fantasía")) {libro="El señor de los anillos";
        } else if (genero.equals("misterio")) {libro="El libro negro";
        } else if (genero.equals("romance")) {libro="Beatifull disaster";
        } else if (genero.equals("ciencia ficción")) {libro="No tengo boca pero quiero gritar";
        } else {
            System.out.println("Genero no identificado ¿Puede ser mas general?");
        }

        System.out.println("Le recomendamos que lea " + libro);
    }
}
