package com.eniso.stock.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
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
    @OneToMany(mappedBy="client")
    private List <CommandeClient> commandeClients;

}
