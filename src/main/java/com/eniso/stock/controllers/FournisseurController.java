package com.eniso.stock.controllers;

import com.eniso.stock.entities.Fournisseur;
import com.eniso.stock.service.IFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    IFournisseurService iFournisseurService ;
   @Autowired
    public FournisseurController(@Qualifier("FournisseurServiceImpl") IFournisseurService iFournisseurService) {
        this.iFournisseurService = iFournisseurService;
    }
    @PostMapping("/save")
    Fournisseur save(@RequestBody Fournisseur fournisseur) {
        return iFournisseurService.save(fournisseur);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody Fournisseur fournisseur) {
        iFournisseurService.delete(fournisseur);
    }

    @PutMapping("/update")
    Fournisseur update(Fournisseur fournisseur) {
        return iFournisseurService.update(fournisseur);
    }

    @GetMapping("/getOne/{id}")
    Fournisseur getOne(@PathVariable("id") Long id) {
        return iFournisseurService.getOne(id);
    }

    @GetMapping("/getAll")
    List<Fournisseur> getAll() {
        return iFournisseurService.getAll();
    }
}
