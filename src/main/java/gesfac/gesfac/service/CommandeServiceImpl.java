package gesfac.gesfac.service;

import gesfac.gesfac.modele.Commande;
import gesfac.gesfac.repository.CommandeRepository;

import java.util.List;

public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository commandeRepository;
    @Override
    public Commande creer(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> Lire() {
        return commandeRepository.findAll();
    }

    @Override
    public String supprimer(Long id) {
        commandeRepository.deleteById(id);
        return ("Commande supprime !");
    }
}
