package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.locataires.Locataire;
import com.example.ecf_back_localib.vehicules.dto.VehiculeMinimumDTO;

import java.util.List;
import java.util.Optional;

public interface VehiculeService {


    /**
     * Méthode permettant de rechercher tous les véhicules
     * @return la liste de tous les véhicules
     */
    List<Vehicule> findAll();

    /**
     * Méthode permetant d'enregistrer un nouveau véhicule
     * si un id est présent dans l'entité envoyé le véhicule existant sera modifié
     * @param entity
     * @return le véhicule envoyé
     */
    Vehicule save(Vehicule entity);

    /**
     * Méthode permettant de trouver un véhicule à partir de son id
     * @param id
     * @return un véhicule
     */
    Vehicule findById(String id);

    /**
     * Méthode permettant de supprimer un véhicule à partir de son id
     * @param id
     */
    void deleteById(String id);
    /**
     * Méthode permettant de trouver un véhicule à partir de son immatriculation
     * @param immatriculation
     * @return un véhicule
     */
    VehiculeMinimumDTO findByImmatriculationDTO(String immatriculation);

}
