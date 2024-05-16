package gesfac.gesfac.repository;

import gesfac.gesfac.modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
