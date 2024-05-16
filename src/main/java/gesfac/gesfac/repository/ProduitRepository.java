package gesfac.gesfac.repository;

import gesfac.gesfac.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
