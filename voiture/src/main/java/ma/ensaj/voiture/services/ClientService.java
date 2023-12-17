package ma.ensaj.voiture.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ma.ensaj.voiture.entities.Client;

@FeignClient(name = "SERVICE-CLIENT")
public interface ClientService {
    @GetMapping(path = "/clients/{id}")
    public Client clientById(@PathVariable Long id);
}
