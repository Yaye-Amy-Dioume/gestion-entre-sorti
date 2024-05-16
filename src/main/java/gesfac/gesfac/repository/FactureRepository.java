package gesfac.gesfac.repository;

import gesfac.gesfac.modele.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
