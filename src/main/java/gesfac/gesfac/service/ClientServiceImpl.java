package gesfac.gesfac.service;

import gesfac.gesfac.modele.Client;
import gesfac.gesfac.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client creer(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> Lire() {
        return clientRepository.findAll();
    }

    @Override
    public Client modifier(Long id, Client client) {
        return clientRepository.findById(id)
                .map(p-> {
                    p.setNom(client.getNom());
                    p.setAdresse(client.getAdresse());
                    p.setTelephone(client.getTelephone());
                    return clientRepository.save(client);
                }) .orElseThrow(() -> new RuntimeException("Client non trouve !"));
    }

    @Override
    public String supprimer(Long id) {
        clientRepository.deleteById(id);
        return  "Client supprime";
    }
}
