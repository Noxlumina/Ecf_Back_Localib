package com.example.ecf_back_localib.locations;

import com.example.ecf_back_localib.locataires.Locataire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface LocationRepository extends MongoRepository<Location,String>, QuerydslPredicateExecutor<Location> {
}
