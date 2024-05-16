package gesfac.gesfac.service;

import gesfac.gesfac.modele.Fournisseur;

import java.util.List;

public interface FournisseurService {
    Fournisseur creer (Fournisseur fournisseur);

    List<Fournisseur> Lire();

    Fournisseur modifier (Long id, Fournisseur fournisseur);

    String supprimer(Long id);


}
