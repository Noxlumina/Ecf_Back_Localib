package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.LocataireService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/vehicules")
public class VehiculeController {
    private VehiculeService vehiculeService;
    public VehiculeController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
}
