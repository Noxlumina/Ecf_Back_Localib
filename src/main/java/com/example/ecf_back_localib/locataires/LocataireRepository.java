package com.example.ecf_back_localib.locataires;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface LocataireRepository extends MongoRepository<Locataire,String>, QuerydslPredicateExecutor<Locataire> {

}
