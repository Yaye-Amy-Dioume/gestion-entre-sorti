package gesfac.gesfac.service;

import gesfac.gesfac.modele.Fournisseur;
import gesfac.gesfac.repository.FournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FournisseurServiceImpl implements FournisseurService{

    private final FournisseurRepository fournisseurRepository;
    @Override
    public Fournisseur creer(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public List<Fournisseur> Lire() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur modifier(Long id, Fournisseur fournisseur) {
        return fournisseurRepository.findById(id)
                .map(p->{
                    p.setNom(fournisseur.getNom());
                    p.setEmail(fournisseur.getEmail());
                    p.setTelephone(fournisseur.getTelephone());
                    return fournisseurRepository.save(fournisseur);
                }) .orElseThrow( () -> new RuntimeException("Fournisseur non trouve"));
    }

    @Override
    public String supprimer(Long id) {
        fournisseurRepository.findById(id);
        return "Fournisseur supprime";
    }
}
