import java.util.Random;
import java.util.Scanner;

/**
 * Jeu de Devinettes
 * L'ordinateur génère un nombre aléatoire entre 1 et 100.
 * L'utilisateur a 10 essais pour le trouver.
 */
public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Génération du nombre aléatoire entre 1 et 100
        int nombreSecret = random.nextInt(100) + 1;
        int maxEssais = 10;
        boolean gagne = false;

        System.out.println("=== Jeu de Devinettes ===");
        System.out.println("Devinez un nombre entre 1 et 100.");
        System.out.println("Vous avez " + maxEssais + " essais.\n");

        // Boucle principale : maximum 10 essais
        for (int essai = 1; essai <= maxEssais; essai++) {

            System.out.print("Essai " + essai + "/" + maxEssais + " → Entrez votre nombre : ");
            int devine = scanner.nextInt();

            // Comparaison avec le nombre secret
            if (devine < nombreSecret) {
                System.out.println("Nombre proposé plus grand !\n");
            } else if (devine > nombreSecret) {
                System.out.println("Nombre proposé plus petit !\n");
            } else {
                // L'utilisateur a trouvé le bon nombre
                System.out.println("\n Félicitations ! Vous avez trouvé le nombre " + nombreSecret + " en " + essai + " essai(s) !");
                gagne = true;
                break; // On sort de la boucle
            }
        }

        // Si l'utilisateur n'a pas trouvé après 10 essais
        if (!gagne) {
            System.out.println("\nDommage ! Vous avez épuisé vos " + maxEssais + " essais.");
            System.out.println("Le nombre secret était : " + nombreSecret);
        }

        scanner.close();
    }
}
