package com.example.ecf_back_localib.locataires;


import com.example.ecf_back_localib.utils.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Locataire extends Entity {

    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;

}


