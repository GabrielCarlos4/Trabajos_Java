import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese su estado de animo(feliz, triste, energetico, relajado): ");
        String estadoAnimo=scanner.next().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                musicaFeliz();
                break;
            case "triste":
                musicaTriste();
                break;
            case "energetico":
                musicaEnergetica();
                break;
            case "relajado":
                musicaTranquila();
                break;
            default:
                System.out.println("Estado de animo no reconocido");
                return;
        }
    }
    public static void musicaFeliz(){
        System.out.println("\nLista de Reproducción para Estar Feliz:");
        System.out.println("1. Happy - Pharrell Williams");
        System.out.println("2. Uptown Funk - Mark Ronson ft. Bruno Mars");
        System.out.println("3. Can't Stop the Feeling! - Justin Timberlake");
        System.out.println("4. Dancing Queen - ABBA");
        System.out.println("5. I Gotta Feeling - The Black Eyed Peas");
    }
    public static void musicaTriste(){
        System.out.println("\nLista de Reproducción para Estar Triste:");
        System.out.println("1. Someone Like You - Adele");
        System.out.println("2. Fix You - Coldplay");
        System.out.println("3. Hello - Adele");
        System.out.println("4. Tears in Heaven - Eric Clapton");
        System.out.println("5. The Scientist - Coldplay");
    }
    public static void musicaEnergetica(){
        System.out.println("\nLista de Reproducción para Estar Enérgico:");
        System.out.println("1. Eye of the Tiger - Survivor");
        System.out.println("2. Thunderstruck - AC/DC");
        System.out.println("3. Lose Yourself - Eminem");
        System.out.println("4. Can't Hold Us - Macklemore & Ryan Lewis ft. Ray Dalton");
        System.out.println("5. Stronger - Kanye West");
    }
    public static void musicaTranquila(){
        System.out.println("\nLista de Reproducción para Estar Relajado:");
        System.out.println("1. Weightless - Marconi Union");
        System.out.println("2. Clocks - Coldplay");
        System.out.println("3. Imagine - John Lennon");
        System.out.println("4. Let It Be - The Beatles");
        System.out.println("5. The Sound of Silence - Simon & Garfunkel");
    }
}
