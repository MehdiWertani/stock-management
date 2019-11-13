package com.eniso.stock.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data

public class MvtStock implements Serializable {
    public static final int Entre=1;
    public static final int Sortie=2;
    @Id
    @GeneratedValue
    private Long idMvtStock;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateMvt;
    private BigDecimal quantite;
    private int  typeMvt;
    @ManyToOne
    @JoinColumn(name="idArticle")
    private Article article ;
}
