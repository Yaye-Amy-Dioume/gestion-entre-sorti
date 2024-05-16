package gesfac.gesfac.service;

import gesfac.gesfac.modele.Produit;
import gesfac.gesfac.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public  class ProduitServiceImpl implements ProduitService{

    private final ProduitRepository produitRepository;

    @Override
    public Produit creer(Produit produit) {

        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> Lire() {

        return produitRepository.findAll();
    }

    @Override
    public Produit modifier(Long id, Produit produit) {

        return produitRepository.findById(id)
                .map(p-> {
                    p.setPrix(produit.getPrix());
                    p.setNom(produit.getNom());
                    p.setDescription(produit.getDescription());
                    p.setReference(produit.getReference());
                    return produitRepository.save(produit);
                }).orElseThrow(() -> new RuntimeException("Produit non trouve !"));
    }

    @Override
    public String supprimer(Long id) {

        produitRepository.deleteById(id);
        return ("Produit supprime");
    }
}
