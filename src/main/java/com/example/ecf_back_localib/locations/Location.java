package com.example.ecf_back_localib.locations;

import com.example.ecf_back_localib.locataires.Locataire;
import com.example.ecf_back_localib.utils.Entity;
import com.example.ecf_back_localib.vehicules.Vehicule;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.beans.Transient;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Location extends Entity {
    @NotNull
    @DBRef
    Vehicule vehicule;
    @NotNull
    @DBRef
    Locataire locataire;


    @NotNull
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime date_de_debut;
    @NotNull
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime date_de_fin;
    public Double prix = getPrix();



}
