package Exercice2;

import java.util.HashMap;
import java.util.Collections;

public class GestionNotesApp {
    public static void main(String[] args) {
        // Créer
        HashMap<String, Double> notes = new HashMap<>();

        // Insérer
        notes.put("Youness", 14.5);
        notes.put("Sara", 18.0);
        notes.put("Karim", 12.0);
        notes.put("Leila", 16.5);

        // Augmenter
        if (notes.containsKey("Youness")) {
            double oldNote = notes.get("Youness");
            notes.put("Youness", oldNote + 1.0);
        }

        // Supprimer
        notes.remove("Karim");

        // Afficher
        System.out.println("Taille du Map : " + notes.size());

        // Afficher (Moyenne, Max et Min)
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

        // Vérifier : note égale à 20
        boolean note20 = notes.containsValue(20.0);
        System.out.println("Y a-t-il une note de 20 ? " + (note20 ? "Oui" : "Non"));

        // Affichage final
        notes.forEach((nom, note) -> System.out.println("Etudiant: " + nom + " | Note: " + note));
    }
}
