package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.Locataire;
import com.example.ecf_back_localib.vehicules.dto.VehiculeMinimumDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface VehiculeRepository extends MongoRepository<Vehicule,String>{
    /**
     * Méthode permettant de trouver un véhicule à partir de son immatriculation
     * @param immatriculation
     * @return un véhicule
     */
    Vehicule findByImmatriculation(String immatriculation);

    /**
     * Méthode permettant de trouver un locataire à partir de sa marque
     * @param marque
     * @return un véhicule
     */
    Optional<Vehicule> findByMarque(String marque);

    /**
     * Méthode permettant de trouver un locataire à partir de son modele
     * @param modele
     * @return un véhicule
     */
    Optional<Vehicule> findByModele(String modele);

    /**
     * Méthode permettant de trouver un locataire à partir de son type
     * @param type
     * @return un véhicule
     */
    Optional<Vehicule> findByType(String type);

    /**
     * Méthode permettant de trouver un locataire à partir de son type
     * @param type
     * @return un véhicule
     */
    Optional<Vehicule> findVehiculeByMarqueAndDisponibilite(String type, Boolean disponibilite);
}
