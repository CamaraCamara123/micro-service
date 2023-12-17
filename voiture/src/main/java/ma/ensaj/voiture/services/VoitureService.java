package ma.ensaj.voiture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensaj.voiture.entities.Voiture;
import ma.ensaj.voiture.repositories.VoitureRepository;

@Service
public class VoitureService {
    @Autowired
    VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture v) {
        return voitureRepository.save(v);
    }

}
