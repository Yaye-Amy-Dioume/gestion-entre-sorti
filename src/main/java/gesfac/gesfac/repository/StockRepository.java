package gesfac.gesfac.repository;

import gesfac.gesfac.modele.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
