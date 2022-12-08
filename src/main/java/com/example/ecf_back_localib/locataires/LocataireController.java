package com.example.ecf_back_localib.locataires;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/locataires")
public class LocataireController {

    private LocataireService locataireService;
    private LocataireRepository locataireRepository;
    private static final Logger log = LoggerFactory.getLogger(LocataireController.class);
    public LocataireController(LocataireService locataireService,LocataireRepository locataireRepository) {
        this.locataireService = locataireService;
        this.locataireRepository = locataireRepository;
    }

    @GetMapping
    public List<Locataire> findAll() {
        return locataireService.findAll();
    }
    @PostMapping
    public Locataire save(@RequestBody Locataire entity) {
        return locataireService.save(entity);
    }
    @GetMapping("{id}")
    public Locataire findById(@PathVariable String id) {
        return locataireService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locataireService.deleteById(id);
    }
    @GetMapping("email/{email}")
    public Locataire findByEmail(@PathVariable String email) {
        log.info("recherche locataire à partir de son email :" + email);
        return locataireRepository.findByEmail(email);
    }
}
