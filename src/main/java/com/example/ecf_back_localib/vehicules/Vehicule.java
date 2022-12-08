package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.utils.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vehicule extends Entity {

    private String immatriculation;
    private String modele;
    private String marque;
    private String type;
    private String etat;
    private boolean disponibilite;
    private Double cout;
}