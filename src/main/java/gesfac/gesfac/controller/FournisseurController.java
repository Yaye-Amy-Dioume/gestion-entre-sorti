package gesfac.gesfac.controller;

import gesfac.gesfac.modele.Fournisseur;
import gesfac.gesfac.service.FournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
@AllArgsConstructor
public class FournisseurController {

    private  final FournisseurService fournisseurService;

    @PostMapping("/create")
    public Fournisseur create (@RequestBody Fournisseur fournisseur){
        return fournisseurService.creer(fournisseur);
    }

    @GetMapping("/read")
    public List<Fournisseur> read() {
        return fournisseurService.Lire();
    }

    @PutMapping("/update/{id}")
    public Fournisseur update (@PathVariable Long id, @RequestBody Fournisseur fournisseur){
        return fournisseurService.modifier(id, fournisseur);
    }

    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable Long id){
        return fournisseurService.supprimer(id);
    }
}
