package com.example.ecf_back_localib.locataires;

import java.util.List;

public interface LocataireService {

    /**
     * Méthode permettant de rechercher tous les locataires
     * @return la liste de tous les locataires
     */
    List<Locataire> findAll();

    /**
     * Méthode permetant d'enregistrer un nouveau locataire
     * si un id est présent dans l'entité envoyé le locataire existant sera modifié
     * @param entity
     * @return le locataire envoyé
     */
    Locataire save(Locataire entity);

    /**
     * Méthode permettant de trouver un locataire à partir de son id
     * @param id
     * @return un locataire
     */
    Locataire findById(String id);

    /**
     * Méthode permettant de supprimer un locataire à partir de son id
     * @param id
     */
    void deleteById(String id);

    /**
     * Méthode permettant de trouver un locataire à partir de son email
     * @param id
     * @return un locataire
     */
    Locataire findByEmail(String id);
}
