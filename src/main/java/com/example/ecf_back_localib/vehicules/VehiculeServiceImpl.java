package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.Locataire;
import com.example.ecf_back_localib.vehicules.dto.VehiculeMinimumDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehiculeServiceImpl implements VehiculeService {
    private final VehiculeRepository vehiculeRepository;
    private final ObjectMapper objectMapper;
    private static final Logger log = LoggerFactory.getLogger(VehiculeServiceImpl.class);

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository,ObjectMapper objectMapper) {
        this.vehiculeRepository = vehiculeRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<Vehicule> findAll() {
        log.info("recherche de tous les véhicules");
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule save(Vehicule entity) {
        if (entity.getId() != null) {
            log.info("modification d'un véhicule");
        } else {
            log.info("enregistrement d'un nouveau véhicule");
        }
        entity.setDateModification(LocalDateTime.now());
        return vehiculeRepository.save(entity);
    }

    @Override
    public Vehicule findById(String id) {
        log.info("recherche d'un véhicule par son id -> id: " +id);
        return vehiculeRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id) {
        log.info("suppression du véhicule par son id -> id: " +id);
        vehiculeRepository.deleteById(id);
    }

    @Override
    public VehiculeMinimumDTO findByImmatriculationDTO(String immatriculation) {
        log.info("recherche vehicule à partir de son immatriculation :" + immatriculation);
        Vehicule vehicule = vehiculeRepository.findByImmatriculation(immatriculation);
        VehiculeMinimumDTO vehiculeMinimumDTO = new VehiculeMinimumDTO();
        vehiculeMinimumDTO.setImmatriculation(vehicule.getImmatriculation());
        vehiculeMinimumDTO.setMarque(vehicule.getMarque());
        vehiculeMinimumDTO.setModele(vehicule.getModele());
        vehiculeMinimumDTO.setCout(vehicule.getCout());
        vehiculeMinimumDTO.setEtat(vehicule.getEtat());
        vehiculeMinimumDTO.setType(vehicule.getType());
        System.out.println(vehiculeMinimumDTO);
        return vehiculeMinimumDTO;
    }

}
