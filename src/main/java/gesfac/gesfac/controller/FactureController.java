package gesfac.gesfac.controller;


import gesfac.gesfac.modele.Facture;
import gesfac.gesfac.service.FactureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/facture")
@AllArgsConstructor
public class FactureController {

    private final FactureService factureService;

    public Facture imprimer(Long id, Facture facture){

        return factureService.Imprimer(id, facture);
    }

    public List<Facture> read(){
        return factureService.Lire();
    }

}
