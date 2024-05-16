package gesfac.gesfac.service;

import gesfac.gesfac.modele.Stock;
import gesfac.gesfac.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StockServiceImpl implements StockService{

    private final StockRepository stockRepository;
    @Override
    public Stock ajouter(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> Lire() {
        return stockRepository.findAll();
    }

    @Override
    public Stock modifier(Long id, Stock stock) {
        return stockRepository.findById(id)
                .map(p->{
                    p.setDescription(stock.getDescription());
                    p.setEtat(stock.getEtat());
                    p.setDesignation(stock.getDesignation());
                    p.setPrix(stock.getPrix());
                    p.setQuantite(stock.getQuantite());
                    return stockRepository.save(stock);
                }) .orElseThrow(() -> new RuntimeException("Stock modifier"));
    }

    @Override
    public String supprimer(Long id) {
        stockRepository.deleteById(id);
        return ("Stock supprime");
    }
}
