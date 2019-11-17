package com.eniso.stock.controllers;

import com.eniso.stock.entities.LigneCommandeFournisseur;
import com.eniso.stock.service.ILigneCommandeFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LigneCommandeFournisseur")
public class LigneCommandeFournisseurController {
    ILigneCommandeFournisseurService iLigneCommandeFournisseurService;
  @Autowired
    public LigneCommandeFournisseurController(@Qualifier("LigneCommandeFournisseurServiceImpl") ILigneCommandeFournisseurService iLigneCommandeFournisseurService) {
        this.iLigneCommandeFournisseurService = iLigneCommandeFournisseurService;
    }
    @PostMapping("/save")
    LigneCommandeFournisseur save(@RequestBody LigneCommandeFournisseur ligneCommandeFournisseur) {
        return iLigneCommandeFournisseurService.save(ligneCommandeFournisseur);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody LigneCommandeFournisseur ligneCommandeFournisseur) {
        iLigneCommandeFournisseurService.delete(ligneCommandeFournisseur);
    }

    @PutMapping("/update")
    LigneCommandeFournisseur update(@RequestBody LigneCommandeFournisseur ligneCommandeFournisseur) {
        return iLigneCommandeFournisseurService.update(ligneCommandeFournisseur);
    }

    @GetMapping("/getOne/{id}")
    LigneCommandeFournisseur getOne(@PathVariable("id") Long id) {
        return iLigneCommandeFournisseurService.getOne(id);
    }

    @GetMapping("/getAll")
    List<LigneCommandeFournisseur> getAll() {
        return iLigneCommandeFournisseurService.getAll();
    }
}
