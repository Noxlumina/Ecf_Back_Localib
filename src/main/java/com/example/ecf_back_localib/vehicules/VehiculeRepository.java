package com.example.ecf_back_localib.vehicules;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehiculeRepository extends MongoRepository<Vehicule,String> {
}
