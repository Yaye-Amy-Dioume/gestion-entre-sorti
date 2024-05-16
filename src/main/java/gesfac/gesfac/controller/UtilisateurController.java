package gesfac.gesfac.controller;

import gesfac.gesfac.modele.Utilisateur;
import gesfac.gesfac.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
@AllArgsConstructor

public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public Utilisateur creer(@RequestBody Utilisateur utilisateur){
        return utilisateurService.creer(utilisateur);
    }

    @GetMapping("/read")
    public List<Utilisateur> read(){
        return utilisateurService.Lire();
    }

    @PutMapping("/update")
    public Utilisateur update(@PathVariable Integer id, @RequestBody Utilisateur utilisateur){
        return utilisateurService.modifier(utilisateur);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return utilisateurService.supprimer(id);
    }
}
