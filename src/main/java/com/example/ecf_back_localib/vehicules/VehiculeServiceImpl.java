package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.Locataire;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.List;

public class VehiculeServiceImpl implements VehiculeService {
    private final VehiculeRepository vehiculeRepository;
    private final VehiculeService vehiculeService;
    private static final Logger log = LoggerFactory.getLogger(VehiculeServiceImpl.class);

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository, VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public List<Vehicule> findAll() {
        log.info("recherche de tous les véhicules");
        return vehiculeService.findAll();
    }

    @Override
    public Vehicule save(Vehicule entity) {
        if (entity.getId() != null) {
            log.info("modification d'un véhicule");
        } else {
            log.info("enregistrement d'un nouveau véhicule");
        }
        entity.setDateModification(LocalDateTime.now());
        return vehiculeService.save(entity);
    }

    @Override
    public Vehicule findById(String id) {
        log.info("recherche d'un véhicule par son id -> id: " +id);
        return vehiculeService.findById(id);
    }

    @Override
    public void deleteById(String id) {
        log.info("suppression du véhicule par son id -> id: " +id);
        vehiculeService.deleteById(id);
    }

    @Override
    public Locataire findByImmatriculation(String immatriculation) {
        log.info("recherche d'un locataire à partir de son email-> email: " +immatriculation);
        return vehiculeService.findByImmatriculation(immatriculation);
    }
}
