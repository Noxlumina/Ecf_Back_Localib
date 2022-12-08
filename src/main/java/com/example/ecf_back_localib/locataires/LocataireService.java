package com.example.ecf_back_localib.locataires;

import java.util.List;

public interface LocataireService {

    /**
     * Méthode permettant de rechercher tous les locataires
     * @param page,size page le numéro de la page,size le nombre d'élément afficher par page
     * @return la liste de tous les locataires
     */
    List<Locataire> findAll(int page, int size);

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

}
