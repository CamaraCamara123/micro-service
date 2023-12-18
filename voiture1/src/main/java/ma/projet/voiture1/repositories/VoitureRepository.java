package ma.projet.voiture1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.voiture1.entities.Voiture;
import java.util.List;


@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long>{
    public List<Voiture> findByClientId(Long clientId);
}
