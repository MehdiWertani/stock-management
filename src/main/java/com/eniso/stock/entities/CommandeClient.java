package com.eniso.stock.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class CommandeClient implements Serializable {
    @Id
    @GeneratedValue
    private Long IdCommandeClient;
    private String code;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande ;
    @ManyToOne
    @JoinColumn(name="idClient")
    private Client client ;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;

}
