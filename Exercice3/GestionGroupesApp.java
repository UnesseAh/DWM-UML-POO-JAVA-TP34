package Exercice3;

import java.util.HashSet;
import java.util.Set;

public class GestionGroupesApp {
    public static void main(String[] args) {
        // Créer
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // Ajouter
        groupeA.add("Ahmed");
        groupeA.add("Sara");
        groupeA.add("Leila");

        groupeB.add("Samir");
        groupeB.add("Karim");
        groupeB.add("Leila");

        System.out.println("Groupe A : " + groupeA);
        System.out.println("Groupe B : " + groupeB);

        // Intersection
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("\nIntersection (A et B) : " + intersection);

        // Union
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union (A ou B) : " + union);
    }
}
