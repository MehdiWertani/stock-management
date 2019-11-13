package com.eniso.stock.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class LigneCommandeFournisseur implements Serializable {
    @Id
    @GeneratedValue
    private Long idLigneCommandeFournisseur;
    @ManyToOne
    @JoinColumn(name="idArticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name="idCommandeFournisseur")
    private CommandeFournisseur commandeFournisseur;
}
