package gesfac.gesfac.service;

import gesfac.gesfac.modele.Utilisateur;
import gesfac.gesfac.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor

public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur creer(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> Lire() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur modifier(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public String supprimer(Long id) {
        return null;
    }
}
