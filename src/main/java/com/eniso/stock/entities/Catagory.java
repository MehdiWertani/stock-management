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
public class Catagory implements Serializable {
    @Id
    @GeneratedValue
    private Long iDCatagory;
    private String code;
    private String designation;
    @OneToMany(mappedBy = "catagory")

    private List<Article> articles;

}
