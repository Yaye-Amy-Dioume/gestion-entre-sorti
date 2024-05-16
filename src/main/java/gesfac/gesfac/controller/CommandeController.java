package gesfac.gesfac.controller;

import gesfac.gesfac.modele.Commande;
import gesfac.gesfac.service.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/commande")
@AllArgsConstructor
public class CommandeController {

   private final CommandeService commandeService;

   @PostMapping("/create")
    public Commande creer(@RequestBody Commande commande){
        return commandeService.creer(commande);
    }
    @GetMapping("/read")
    public List<Commande> read(){
        return commandeService.Lire();
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
       return commandeService.supprimer(id);
    }
}
