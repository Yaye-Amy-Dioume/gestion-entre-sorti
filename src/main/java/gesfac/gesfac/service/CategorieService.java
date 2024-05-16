package gesfac.gesfac.service;

import gesfac.gesfac.modele.Categorie;

import java.util.List;

public interface CategorieService {
    Categorie creer (Categorie categorie);

    List<Categorie> Lire();

    Categorie modifier (Long id, Categorie categorie);

    String supprimer (Long id);
}
