package gesfac.gesfac.service;

import gesfac.gesfac.modele.Categorie;
import gesfac.gesfac.repository.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;

    @Override
    public Categorie creer(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public List<Categorie> Lire() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie modifier(Long id, Categorie categorie) {
        return categorieRepository.findById(id)
                .map(p-> {
                    p.setNom(categorie.getNom());
                    return categorieRepository.save(categorie);
                }) .orElseThrow( () -> new RuntimeException("Categorie non trouve"));
    }

    @Override
    public String supprimer(Long id) {
        categorieRepository.deleteById(id);
        return "Categorie supprime";
    }
}
