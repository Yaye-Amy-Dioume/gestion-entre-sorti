package gesfac.gesfac.service;

import gesfac.gesfac.modele.Facture;

import java.util.List;

public interface FactureService {

    Facture Imprimer ( Long id, Facture facture);

    List<Facture> Lire();
}
