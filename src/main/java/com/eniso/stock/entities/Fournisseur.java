package com.eniso.stock.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Fournisseur implements Serializable {
  @Id
  @GeneratedValue
   private  Long idFournisseur;
    private String nom;
    private String prenom;
    private String adresse ;
    private String photo;
    private String mail;
    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;


}
