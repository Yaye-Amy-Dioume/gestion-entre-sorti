package gesfac.gesfac.service;

import gesfac.gesfac.modele.Produit;

import java.util.List;

public interface ProduitService {


    Produit creer(Produit produit);

    List<Produit> Lire();


    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);
}

