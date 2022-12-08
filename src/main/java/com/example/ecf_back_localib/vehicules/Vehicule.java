package com.example.ecf_back_localib.vehicules;

import com.example.ecf_back_localib.utils.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vehicule extends Entity {
    @NotNull
    private String immatriculation;
    @NotNull
    private String modele;
    @NotNull
    private String marque;
    @NotNull
    private String type;
    @NotNull
    private String etat;
    @NotNull
    private boolean disponibilite;
    @NotNull
    private Double cout;
}