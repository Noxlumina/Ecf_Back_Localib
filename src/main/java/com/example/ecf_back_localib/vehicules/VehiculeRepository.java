package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.Locataire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface VehiculeRepository extends MongoRepository<Vehicule,String>{
    /**
     * Méthode permettant de trouver un locataire à partir de son email
     * @param immatriculation
     * @return un locataire
     */
    Locataire findByImmatriculation(String immatriculation);
}
