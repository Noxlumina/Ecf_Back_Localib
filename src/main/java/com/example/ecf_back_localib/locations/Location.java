package com.example.ecf_back_localib.locations;

import com.example.ecf_back_localib.locataires.Locataire;
import com.example.ecf_back_localib.utils.Entity;
import com.example.ecf_back_localib.vehicules.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Location extends Entity {

    @DBRef
    Vehicule vehicule;
    @DBRef
    Locataire locataire;
    private LocalDateTime date_de_debut;
    private LocalDateTime date_de_fin;
    private Double prix;
}
