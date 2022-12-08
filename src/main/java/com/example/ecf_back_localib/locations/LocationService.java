package com.example.ecf_back_localib.locations;

import java.util.List;

public interface LocationService {
    /**
     * Méthode permettant de rechercher tous les locations
     * @return la liste de tous les locations
     */
    List<Location> findAll();

    /**
     * Méthode permetant d'enregistrer une nouvelle location
     * si un id est présent dans l'entité envoyé la location existant sera modifiée
     * @param entity
     * @return la location envoyée
     */
    Location save(Location entity);

    /**
     * Méthode permettant de trouver une location à partir de son id
     * @param id
     * @return une location
     */
    Location findById(String id);

    /**
     * Méthode permettant de supprimer une location à partir de son id
     * @param id
     */
    void deleteById(String id);


}
