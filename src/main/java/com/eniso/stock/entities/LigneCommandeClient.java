package com.eniso.stock.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class LigneCommandeClient implements Serializable {
    @Id
    @GeneratedValue
    private Long idLigneCommandeClient;
    @ManyToOne
    @JoinColumn(name="idArticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name="idCommandeClient")
    private CommandeClient commandeClient;
}
