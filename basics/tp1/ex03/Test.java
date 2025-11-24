import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez un nombre entier : ");
        int nombre = sc.nextInt();
        
        int somme = 0;
        
        // Calculer la somme des diviseurs (sauf le nombre lui-même)
        for (int i = 1; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }
        
        if (somme == nombre)
		{
            System.out.println(nombre + " est un nombre parfait.");
        } else {
            System.out.println(nombre + " n'est pas un nombre parfait.");
        }
        
        sc.close();
    }
}