package gesfac.gesfac.controller;

import gesfac.gesfac.modele.Produit;
import gesfac.gesfac.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){

        return produitService.creer(produit);
    }
    @GetMapping("/read")
    public List<Produit> read(){

        return produitService.Lire();
    }
     @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id,@RequestBody Produit produit){
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return produitService.supprimer(id);
    }
}
