package com.example.ecf_back_localib.locataires;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface LocataireRepository extends MongoRepository<Locataire,String> {
    /**
     * Méthode permettant de trouver un locataire à partir de son email
     * @param email
     * @return un locataire
     */
    Locataire findByEmail(String email);


}
