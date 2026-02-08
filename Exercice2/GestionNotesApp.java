package Exercice2;

import java.util.HashMap;
import java.util.Collections;

public class GestionNotesApp {
    public static void main(String[] args) {
        // 1. Créer un map de type Hashmap qui stocke les notes des étudiants.
        HashMap<String, Double> notes = new HashMap<>();

        // 2. Insérer des notes des étudiants.
        notes.put("Youness", 14.5);
        notes.put("Sara", 18.0);
        notes.put("Karim", 12.0);
        notes.put("Leila", 16.5);

        // 3. Augmenter la note d’un étudiant.
        if (notes.containsKey("Youness")) {
            double oldNote = notes.get("Youness");
            notes.put("Youness", oldNote + 1.0);
        }

        // 4. Supprimer la note d’un étudiant.
        notes.remove("Karim");

        // 5. Afficher la taille du map.
        System.out.println("Taille du Map : " + notes.size());

        // 6. Afficher la note moyenne, max et min.
        double somme = 0;
        double max = Collections.max(notes.values());
        double min = Collections.min(notes.values());

        for (double n : notes.values()) {
            somme += n;
        }
        double moyenne = somme / notes.size();

        System.out.println("Moyenne : " + moyenne);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

        // 7. Vérifier s’il y a une note égale à 20.
        boolean note20 = notes.containsValue(20.0);
        System.out.println("Y a-t-il une note de 20 ? " + (note20 ? "Oui" : "Non"));

        // 8. Après chaque opération afficher la liste en utilisant la boucle forEach
        // avec l’expression lambda.
        notes.forEach((nom, note) -> System.out.println("Etudiant: " + nom + " | Note: " + note));
    }
}
