package gesfac.gesfac.service;

import gesfac.gesfac.modele.Stock;

import java.util.List;

public interface StockService {

    Stock ajouter (Stock stock);

    List<Stock> Lire ();

    Stock modifier (Long id, Stock stock);

    String supprimer(Long id);
}
