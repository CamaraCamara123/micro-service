package ma.ensaj.voiture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import ma.ensaj.voiture.entities.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    public List<Voiture> findByClientId(Long clientId);
}
