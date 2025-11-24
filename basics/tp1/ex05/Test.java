import java.util.Scanner;

public class ManipulationTableau {
    
    // Fonction pour afficher le tableau
    public static void afficherTableau(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Question 1 : Inverser le tableau
    public static void inverserTableau(int[] tab) {
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
    }
    
    // Question 2 : Déplacer à droite
    public static void deplacerDroite(int[] tab) {
        if (tab.length == 0) return;
        
        int dernier = tab[tab.length - 1];
        for (int i = tab.length - 1; i > 0; i--) {
            tab[i] = tab[i - 1];
        }
        tab[0] = dernier;
    }
    
    // Question 3 : Trier le tableau (tri à bulles)
    public static void trierTableau(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }
    
    // Question 4 : Vérifier si trié
    public static boolean estTrie(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    // Question 5 : Vérifier si tous les éléments sont uniques
    public static boolean elementsUniques(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lire la taille du tableau
        System.out.print("Entrez la taille N du tableau : ");
        int n = sc.nextInt();
        
        int[] tableau = new int[n];
        
        // Remplir le tableau
        System.out.println("\nRemplir le tableau :");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            tableau[i] = sc.nextInt();
        }
        
        // Afficher le tableau initial
        System.out.print("\nTableau initial : ");
        afficherTableau(tableau);
        
        // Question 1 : Inverser
        System.out.println("\n--- Question 1 : Inverser le tableau ---");
        inverserTableau(tableau);
        System.out.print("Tableau inverse : ");
        afficherTableau(tableau);
        
        // Réinverser pour revenir à l'original
        inverserTableau(tableau);
        
        // Question 2 : Déplacer à droite
        System.out.println("\n--- Question 2 : Deplacer a droite ---");
        deplacerDroite(tableau);
        System.out.print("Tableau apres deplacement : ");
        afficherTableau(tableau);
        
        // Question 3 : Trier
        System.out.println("\n--- Question 3 : Trier le tableau ---");
        trierTableau(tableau);
        System.out.print("Tableau trie : ");
        afficherTableau(tableau);
        
        // Question 4 : Vérifier si trié
        System.out.println("\n--- Question 4 : Verifier si trie ---");
        if (estTrie(tableau)) {
            System.out.println("Le tableau est trie en ordre croissant.");
        } else {
            System.out.println("Le tableau n'est pas trie.");
        }
        
        // Question 5 : Vérifier unicité
        System.out.println("\n--- Question 5 : Verifier l'unicite ---");
        if (elementsUniques(tableau)) {
            System.out.println("Tous les elements sont uniques.");
        } else {
            System.out.println("Il y a des doublons dans le tableau.");
        }
        
        sc.close();
    }
}