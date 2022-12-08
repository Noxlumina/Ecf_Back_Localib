package com.example.ecf_back_localib.locataires;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;


public interface LocataireRepository extends MongoRepository<Locataire,String> {

    /**
     * Méthode permettant de trouver un locataire à partir de son email
     * @param email
     * @return un locataire
     */
    Locataire findByEmail(String email);

    /**
     * Méthode permettant de trouver des locataires à partir de leur nom
     * @param nom
     * @return une liste de locataires
     */
    List<Locataire> findByNom(String nom);

    /**
     * Méthode permettant de trouver des locataires à partir de leur prénom
     * @param prenom
     * @return une liste de locataires
     */
    List<Locataire> findByPrenom(String prenom);
}
