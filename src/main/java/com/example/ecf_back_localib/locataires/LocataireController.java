package com.example.ecf_back_localib.locataires;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/locataires")
public class LocataireController {

    private LocataireService locataireService;
    public LocataireController(LocataireService locataireService) {
        this.locataireService = locataireService;
    }
}
