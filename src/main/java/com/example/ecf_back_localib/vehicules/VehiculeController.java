package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.Locataire;
import com.example.ecf_back_localib.locataires.LocataireController;
import com.example.ecf_back_localib.locataires.LocataireService;
import com.example.ecf_back_localib.vehicules.dto.VehiculeMinimumDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/vehicules")
public class VehiculeController {
    private VehiculeService vehiculeService;
    private VehiculeRepository vehiculeRepository;

    private static final Logger log = LoggerFactory.getLogger(VehiculeController.class);
    public VehiculeController(VehiculeService vehiculeService,VehiculeRepository vehiculeRepository) {
        this.vehiculeService = vehiculeService;
        this.vehiculeRepository = vehiculeRepository;
    }
    @GetMapping
    public List<Vehicule> findAll() {
        return vehiculeService.findAll();
    }
    @PostMapping
    public Vehicule save(@RequestBody Vehicule entity) {
        return vehiculeService.save(entity);
    }
    @GetMapping("{id}")
    public Vehicule findById(@PathVariable String id) {
        return vehiculeService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        vehiculeService.deleteById(id);
    }

    @GetMapping("immatriculation/{immatriculation}")
    public VehiculeMinimumDTO findByImmatriculation(@PathVariable String immatriculation) {
        return vehiculeService.findByImmatriculationDTO(immatriculation);
    }
}

