package com.example.ecf_back_localib.vehicules.dto;

import com.example.ecf_back_localib.locataires.datelocations.DateLocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculeMinimumDTO {
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
    private Double cout;

    private List<DateLocation> locations = new ArrayList<>();


}
