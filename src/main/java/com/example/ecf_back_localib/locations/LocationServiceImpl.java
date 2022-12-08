package com.example.ecf_back_localib.locations;

import com.example.ecf_back_localib.vehicules.Vehicule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.beans.Transient;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    private static final Logger log = LoggerFactory.getLogger(LocationServiceImpl.class);

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;

    }

    @Override
    public List<Location> findAll() {
        log.info("recherche de tous les locations");
        return locationRepository.findAll();
    }

    @Override
    public Location save(Location entity) {
        if (entity.getId() != null) {
            log.info("modification d'une location");
        } else {
            log.info("enregistrement d'une nouvelle location");
        }
        LocalDateTime start = entity.getDate_de_debut();
        LocalDateTime end = entity.getDate_de_fin();
        Double coutJournalier = entity.vehicule.getCout();
        entity.setPrix(getPrix(start,end,coutJournalier));
        entity.setDateModification(LocalDateTime.now());
        return locationRepository.save(entity);
    }


    public  Double getPrix(LocalDateTime start, LocalDateTime end, Double coutJournalier) {
        System.out.println(start);
        System.out.println(end);
        Period p = Period.between(start.toLocalDate(), end.toLocalDate());
        Integer jours = p.getDays();
        Double prix= coutJournalier*jours;
        return  prix;}

    @Override
    public Location findById(String id) {
        log.info("recherche d'une location par son id -> id: " +id);
        return locationRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id) {
        log.info("suppression d'une location par son id -> id: " +id);
        locationRepository.deleteById(id);
    }
}
