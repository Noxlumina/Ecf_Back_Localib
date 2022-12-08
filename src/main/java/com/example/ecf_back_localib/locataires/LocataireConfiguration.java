package com.example.ecf_back_localib.locataires;

import com.example.ecf_back_localib.locations.LocationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocataireConfiguration {
    @Bean
    public LocataireService locataireService(LocataireRepository locataireRepository){
        return new LocataireServiceImpl(locataireRepository);
    }

}
