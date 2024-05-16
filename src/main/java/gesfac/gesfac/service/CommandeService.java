package gesfac.gesfac.service;

import gesfac.gesfac.modele.Client;
import gesfac.gesfac.modele.Commande;

import java.util.List;

public interface CommandeService {

    Commande creer (Commande commande);

    List<Commande> Lire();

    String supprimer (Long id);
}
