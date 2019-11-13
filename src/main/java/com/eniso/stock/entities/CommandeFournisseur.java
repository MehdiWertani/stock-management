package com.eniso.stock.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class CommandeFournisseur implements Serializable {
    @Id
    @GeneratedValue
    private Long idCommandeFournisseur;
    private String code;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande ;
    @ManyToOne
    @JoinColumn(name="idFournisseur")
    private Fournisseur fournisseur ;
    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}

