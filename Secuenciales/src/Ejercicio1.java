import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio1 {
    public static void main(String[] args) {
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese su " + "fecha de nacimiento (DD/MM/AAAA)");
        try {
            String signo = determinarSignoZodiaco(fechaNacimiento);
            String horoscopo = obtenerHoroscopo(signo);

            JOptionPane.showInputDialog(null, "Su " + "signo del zodiaco es: " + signo + "\nHoroscopo: " + horoscopo);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error: Formato de fecha incorrecto, Debe ser DD/MM/AAAAA.");
        }
    }

    public static String determinarSignoZodiaco(String fecha)
            throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = sdf.parse(fecha);
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaNacimiento);

        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1;

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        }

        return "Desconocido";
    }
    public static String obtenerHoroscopo(String signo) {
        switch (signo) {
            case "Acuario":
                return "Hoy será un día lleno de sorpresas y oportunidades inesperadas.";
            case "Piscis":
                return "Tu creatividad estará en su punto máximo, aprovecha para crear algo nuevo.";
            case "Aries":
                return "Es un buen día para tomar decisiones audaces y enfrentar nuevos desafíos.";
            case "Tauro":
                return "Relájate y disfruta del día, la estabilidad es tu mejor aliada.";
            case "Géminis":
                return "Comparte tus ideas con los demás, hoy es un buen día para la comunicación.";
            case "Cáncer":
                return "Cuida de tu salud emocional, busca el equilibrio en tu vida.";
            case "Leo":
                return "Tu confianza y carisma brillarán, atrae a las personas hacia ti.";
            case "Virgo":
                return "Organízate y prioriza tus tareas, será un día productivo.";
            case "Libra":
                return "Busca el equilibrio en todas las áreas de tu vida, hoy es un buen día para la reflexión.";
            case "Escorpio":
                return "Sé valiente y enfrenta tus miedos, hoy es un buen día para superar obstáculos.";
            case "Sagitario":
                return "Explora nuevas oportunidades y aventuras, tu espíritu libre te llevará lejos.";
            case "Capricornio":
                return "Trabaja duro y persevera, tus esfuerzos serán recompensados.";
            default:
                return "No se pudo determinar el horóscopo.";
        }
    }
}