package jeux;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // Génération d'un nombre aléatoire entre 0 et 199
        Random r = new Random();
        int essai = 0; // Initialisation du compteur d'essais
        int justprix = r.nextInt(200); // Nombre aléatoire à deviner
        int prix = 0; // Initialisation de la proposition de l'utilisateur

        // Boucle tant que la proposition de l'utilisateur ne correspond pas au nombre à deviner
        while (justprix != prix) {
            System.out.println("Entrez un numéro entre 0 et 200 "); // Demande à l'utilisateur de saisir un nombre
            Scanner scan = new Scanner(System.in);
            prix = scan.nextInt(); // Lecture de la proposition de l'utilisateur
            essai++; // Incrémentation du compteur d'essais

            // Comparaison entre le nombre à deviner et la proposition de l'utilisateur
            if (justprix > prix) {
                System.out.println("C'est plus!"); // Si le nombre à deviner est plus grand
            } else {
                System.out.println("c'est moins!"); // Si le nombre à deviner est plus petit
            }
        }

        // Affichage du nombre à deviner et du nombre d'essais effectués
        System.out.print("Bravo le juste prix est: " + justprix);
        System.out.println(" En " + essai + " essais");
    }
}
