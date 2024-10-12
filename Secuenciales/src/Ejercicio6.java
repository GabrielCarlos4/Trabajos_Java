import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese cuantas horas al dia puede estudiar: ");
        int horasDiarias= scanner.nextInt();

        String[] materias = {"Arquitectura", "Matematicas", "Laboratorio", "Python", "Org.Empresarial"};

        int horasMateria= horasDiarias/materias.length;
        int horasRestantes= horasDiarias % materias.length;

        System.out.println("\nPlan de Estudio: ");
        for (int i = 0; i < materias.length; i++) {
            int horas = horasMateria;
            if (horasDiarias>0){
                horas++;
                horasRestantes--;
            }
            System.out.println(materias[i] + ": " + horas + " horas al dia");
        }
    }
}
