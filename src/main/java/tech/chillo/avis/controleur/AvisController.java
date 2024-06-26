package tech.chillo.avis.controleur;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tech.chillo.avis.entite.Avis;
import tech.chillo.avis.service.AvisService;

@AllArgsConstructor
@RequestMapping("avis")
@RestController
public class AvisController {
    private final AvisService avisService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping   
    public void creer(@RequestBody Avis avis) {
        this.avisService.creer(avis);

    }

}
