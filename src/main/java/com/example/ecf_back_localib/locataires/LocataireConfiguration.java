package com.example.ecf_back_localib.locataires;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocataireConfiguration {
    @Bean
    public LocataireService locataireService(LocataireRepository locataireRepository,LocataireService locataireService){
        return new LocataireServiceImpl(locataireRepository,locataireService);
    }
}
