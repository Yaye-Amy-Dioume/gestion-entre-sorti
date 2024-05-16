package gesfac.gesfac.controller;

import gesfac.gesfac.modele.Client;
import gesfac.gesfac.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/create")
    private Client create(@RequestBody Client client){
        return clientService.creer(client);
    }

    @GetMapping("/read")
    public List<Client> read(){
        return clientService.Lire();
    }

    @PutMapping("/update/{id} ")
    public Client update(@PathVariable Long id,@RequestBody Client client){
        return clientService.modifier(id, client);
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return clientService.supprimer(id);
    }
}
