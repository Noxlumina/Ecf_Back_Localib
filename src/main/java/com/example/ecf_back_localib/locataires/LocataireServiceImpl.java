package com.example.ecf_back_localib.locataires;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.List;


public class LocataireServiceImpl implements LocataireService {
    private final LocataireRepository locataireRepository;
    private final LocataireService locataireService;
    private static final Logger log = LoggerFactory.getLogger(LocataireServiceImpl.class);

    public LocataireServiceImpl(LocataireRepository locataireRepository, LocataireService locataireService) {
        this.locataireRepository = locataireRepository;
        this.locataireService = locataireService;
    }

    @Override
    public List<Locataire> findAll() {
        log.info("recherche de tous les utilisateurs");
        return locataireService.findAll();
    }

    @Override
    public Locataire save(Locataire entity) {
        if (entity.getId() != null) {
            log.info("modification d'un locataire");
        } else {
            log.info("enregistrement d'un nouveau locataire");
        }
        entity.setDateModification(LocalDateTime.now());
        return locataireService.save(entity);
    }

    @Override
    public Locataire findById(String id) {
        log.info("recherche d'un locataire par son id -> id: " +id);
        return locataireService.findById(id);
    }

    @Override
    public void deleteById(String id) {
        log.info("suppression du locataire par son id -> id: " +id);
        locataireService.deleteById(id);
    }

    @Override
    public Locataire findByEmail(String email) {
        log.info("recherche d'un locataire à partir de son email-> email: " +email);
        return locataireService.findByEmail(email);
    }
}
