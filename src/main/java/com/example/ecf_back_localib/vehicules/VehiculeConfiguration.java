package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.LocataireRepository;
import com.example.ecf_back_localib.locataires.LocataireService;
import com.example.ecf_back_localib.locataires.LocataireServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeConfiguration {
    @Bean
    public VehiculeService vehiculeService(VehiculeRepository vehiculeRepository, ObjectMapper objectMapper){
        return new VehiculeServiceImpl(vehiculeRepository,objectMapper);
    }
}
