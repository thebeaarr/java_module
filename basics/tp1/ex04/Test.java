import java.util.Scanner;
import java.io.*; 
public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Demander la taille du tableau
        System.out.print("Entrez la taille du tableau N : ");
        int n = sc.nextInt();
        
        int[] tableau = new int[n];
        
        // Remplir le tableau
        System.out.println("\nRemplissage du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            tableau[i] = sc.nextInt();
        }
        
        // Afficher le tableau
        System.out.print("\nTableau : [");
        for (int i = 0; i < n; i++) {
            System.out.print(tableau[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Question 1 : Rechercher un élément
        System.out.println("\n--- Question 1 : Recherche d'un element ---");
        System.out.print("Entrez un entier a rechercher : ");
        int recherche = sc.nextInt();
        
        boolean trouve = false;
        for (int i = 0; i < n; i++) {
            if (tableau[i] == recherche) {
                trouve = true;
                break;
            }
        }
        
        if (trouve) {
            System.out.println(recherche + " appartient au tableau.");
        } else {
            System.out.println(recherche + " n'appartient pas au tableau.");
        }
        
        // Question 2 : Nombre d'occurrences de chaque élément
        System.out.println("\n--- Question 2 : Occurrences de chaque element ---");
        
        boolean[] dejaCompte = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!dejaCompte[i]) {
                int occurrences = 0;
                for (int j = 0; j < n; j++) {
                    if (tableau[i] == tableau[j]) {
                        occurrences++;
                        dejaCompte[j] = true;
                    }
                }
                System.out.println(tableau[i] + " apparait " + occurrences + " fois");
            }
        }
        
        // Question 3 : Moyenne des éléments pairs
        System.out.println("\n--- Question 3 : Moyenne des elements pairs ---");
        
        int sommePairs = 0;
        int nombrePairs = 0;
        
        for (int i = 0; i < n; i++) {
            if (tableau[i] % 2 == 0) {
                sommePairs += tableau[i];
                nombrePairs++;
            }
        }
        
        if (nombrePairs > 0) {
            double moyenne = (double) sommePairs / nombrePairs;
            System.out.println("Nombre d'elements pairs : " + nombrePairs);
            System.out.println("Somme des elements pairs : " + sommePairs);
            System.out.println("Moyenne des elements pairs : " + moyenne);
        } else {
            System.out.println("Aucun element pair dans le tableau.");
        }
        
        sc.close();
    }
}