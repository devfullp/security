package tech.chillo.avis.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tech.chillo.avis.entite.Avis;
import tech.chillo.avis.repository.AvisRepository;

@AllArgsConstructor
@Service
public class AvisService {

    private final AvisRepository avisRepository;

    public void creer(Avis avis){
        this.avisRepository.save(avis);
    }
}
