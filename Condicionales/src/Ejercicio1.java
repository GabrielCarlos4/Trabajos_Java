import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String generoPelicula;
        generoPelicula= JOptionPane.showInputDialog(null, "Ingrese su género de película favorito (acción, comedia, drama, ciencia ficción)");
        generoPelicula= generoPelicula.toLowerCase();
        String recomendacion="";
        if (generoPelicula.equals("acción")) {recomendacion="Duro de matar";
        } else if (generoPelicula.equals("comedia")) {recomendacion="Son como niños";
        } else if (generoPelicula.equals("drama")) {recomendacion="El libro verde";
        } else if (generoPelicula.equals("ciencia ficción")) {recomendacion="Dune 2";}
        JOptionPane.showMessageDialog(null, "Le recomendamos ver " + recomendacion);
        }

    }
