package com.eniso.stock.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class LigneVente implements Serializable {
    @Id
    @GeneratedValue
    private Long idLigneVente;
    @ManyToOne
    @JoinColumn(name="idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idVente")
    private Vente vente ;
}
