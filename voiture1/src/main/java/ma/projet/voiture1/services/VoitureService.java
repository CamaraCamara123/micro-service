package ma.projet.voiture1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.voiture1.entities.Voiture;
import ma.projet.voiture1.repositories.VoitureRepository;

@Service
public class VoitureService {
    @Autowired
    VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture v) {
        return voitureRepository.save(v);
    }
}
