package com.eniso.stock.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Integer idUser;

 private String nom;
 private String prenom;
 private String mail;
 private String motdepase ;
 private String photo;
}
