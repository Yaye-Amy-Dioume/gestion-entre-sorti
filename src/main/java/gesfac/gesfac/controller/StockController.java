package gesfac.gesfac.controller;

import gesfac.gesfac.modele.Categorie;
import gesfac.gesfac.modele.Stock;
import gesfac.gesfac.service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
@AllArgsConstructor
public class StockController {

    private final StockService stockService;

    @PostMapping("/create")
    public Stock create(@RequestBody Stock stock){

        return stockService.ajouter(stock);
    }
    @GetMapping("/read")
    public List<Stock> read(){

        return stockService.Lire();
    }
    @PutMapping("/update/{id}")
    public Stock update(Long id,Stock stock){
    return stockService.modifier(id,stock);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return stockService.supprimer(id);
    }

}
