package ma.projet.voiture1.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ma.projet.voiture1.entities.Client;

@Service
@FeignClient(name = "SERVICE-CLIENT")
public interface ClientService {
    @GetMapping(path = "/client/{id}")
    public Client clientById(@PathVariable Long id);
    @GetMapping(path = "/clients")
    public List<Client> findAll();
}
