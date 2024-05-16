package gesfac.gesfac.controller;

import gesfac.gesfac.modele.Entree;
import gesfac.gesfac.service.EntreeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entree")
@AllArgsConstructor
public class EntreeController {

    private final EntreeService entreeService;





}
