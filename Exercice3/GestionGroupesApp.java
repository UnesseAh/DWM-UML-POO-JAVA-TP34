package Exercice3;

import java.util.HashSet;
import java.util.Set;

public class GestionGroupesApp {
    public static void main(String[] args) {
        // 1. Créer deux Sets de type HashSet nommées groupeA et groupeB, contenant les
        // nom des étudiants des deux groupes A et B.
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // 2. Ajouter des noms des étudiants à chaque HashSet.
        groupeA.add("Ahmed");
        groupeA.add("Sara");
        groupeA.add("Leila");

        groupeB.add("Samir");
        groupeB.add("Karim");
        groupeB.add("Leila");

        System.out.println("Groupe A : " + groupeA);
        System.out.println("Groupe B : " + groupeB);

        // 3. Afficher l’intersection des deux HashSets.
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("\nIntersection (A et B) : " + intersection);

        // 4. Afficher l’union des deux HashSets.
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union (A ou B) : " + union);
    }
}
