package gesfac.gesfac.repository;

import gesfac.gesfac.modele.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
