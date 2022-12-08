package com.example.ecf_back_localib.locations;

import com.example.ecf_back_localib.locataires.Locataire;
import com.example.ecf_back_localib.locataires.LocataireService;
import com.example.ecf_back_localib.locataires.LocataireServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/locations")
public class LocationController {

    private LocationServiceImpl locationService;
    public LocationController(LocationServiceImpl locationService) {
        this.locationService = locationService;
    }
    @GetMapping
    public List<Location> findAll() {
        return locationService.findAll();
    }
    @PostMapping
    public Location save(@RequestBody Location entity) {
        return locationService.save(entity);
    }
    @GetMapping("{id}")
    public Location findById(@PathVariable String id) {
        return locationService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locationService.deleteById(id);
    }
}


