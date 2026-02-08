package Exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ajouter
        produits.add(new Produit(1, "Produit1", 8000));
        produits.add(new Produit(2, "Produit2", 150));
        produits.add(new Produit(3, "Produit3", 2500));

        // Supprimer
        if (produits.size() > 1) {
            produits.remove(1);
        }

        // Afficher
        for (Produit p : produits) {
            System.out.println(p);
        }

        // Modifier
        if (!produits.isEmpty()) {
            Produit p = produits.get(0);
            p.setNom("Produit-new");
            p.setPrix(8500);
        }

        // Rechercher
        System.out.print("Entrez le nom du produit a chercher : ");
        String nomRecherche = scanner.nextLine();
        boolean trouve = false;

        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Produit trouve : " + p);
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("Aucun produit trouve avec ce nom.");
        }

        scanner.close();
    }
}
