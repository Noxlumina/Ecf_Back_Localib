package com.example.ecf_back_localib.locataires;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface LocataireRepository extends MongoRepository<Locataire,String> {

}
