package gesfac.gesfac.service;

import gesfac.gesfac.modele.Client;

import java.util.List;

public interface ClientService {
    Client creer (Client client);

    List<Client> Lire();

    Client modifier ( Long id, Client client);

    String supprimer (Long id);
}
