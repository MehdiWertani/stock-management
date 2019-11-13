package com.eniso.stock.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private Long idArticle;
    private String CodeArticle;
    private String designation;
    private BigDecimal prixUnitaireHT;
    private BigDecimal tautTva;
    private BigDecimal prixUnitaireTTC;
    private String photo;
    @ManyToOne
    @JoinColumn(name="idCatagory")
    private Catagory catagory;
}
