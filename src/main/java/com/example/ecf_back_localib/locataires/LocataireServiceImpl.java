package com.example.ecf_back_localib.locataires;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;


public class LocataireServiceImpl implements LocataireService {

    private LocataireRepository locataireRepository;

    private static final Logger log = LoggerFactory.getLogger(LocataireServiceImpl.class);

    public LocataireServiceImpl(LocataireRepository locataireRepository) {
        this.locataireRepository = locataireRepository;
    }


    @Override
    public List<Locataire> findAll(int page, int size) {
        log.info("recherche de tous les utilisateurs");
        return locataireRepository.findAll(PageRequest.of(page, size)).toList();
    }


    @Override
    public Locataire save(Locataire entity) {
        if (entity.getId() != null) {
            log.info("modification d'un locataire");
        } else {
            log.info("enregistrement d'un nouveau locataire");
        }
        entity.setDateModification(LocalDateTime.now());
        return locataireRepository.save(entity);
    }

    @Override
    public Locataire findById(String id) {
        log.info("recherche d'un locataire par son id -> id: " +id);
        return locataireRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id) {
        log.info("suppression du locataire par son id -> id: " +id);
        locataireRepository.deleteById(id);
    }

    public Locataire findByEmail(String email) {
        log.info("recherche d'un locataire à partir de son email-> email: " +email);
        return locataireRepository.findByEmail(email);
    }
}
