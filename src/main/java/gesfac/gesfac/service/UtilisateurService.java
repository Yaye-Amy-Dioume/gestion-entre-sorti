package gesfac.gesfac.service;

import gesfac.gesfac.modele.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur creer (Utilisateur utilisateur);

    List<Utilisateur> Lire ();

    Utilisateur modifier (Utilisateur utilisateur);

    String supprimer (Long id);
}
