package com.eniso.stock.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Vente implements Serializable {
    @Id
    @GeneratedValue
    private Long idVente ;
    private String code ;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVente;
    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes ;
}
