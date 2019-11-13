package com.eniso.stock.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue
    private Long idClient;
    private String nom;
    private String prenom;
    private String adresse ;
    private String photo;
    private String mail;

}
