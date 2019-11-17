package com.eniso.stock.controllers;

import com.eniso.stock.entities.LigneVente;
import com.eniso.stock.service.ILigneVenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LigneVente")
public class LigneVenteController  {
    ILigneVenteService iLigneVenteService;
   @Autowired
    public LigneVenteController( @Qualifier("LigneVenteServiceImpl") ILigneVenteService iLigneVenteService) {
        this.iLigneVenteService = iLigneVenteService;
    }
    @PostMapping("/save")
    public LigneVente save(LigneVente ligneVente) {
        return iLigneVenteService.save(ligneVente);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody LigneVente ligneVente) {
        iLigneVenteService.delete(ligneVente);
    }

    @PutMapping("/update")
    public LigneVente update(@RequestBody  LigneVente ligneVente) {
        return iLigneVenteService.save(ligneVente);
    }

    @GetMapping("/getOne/{id}")
    public LigneVente getOne(@PathVariable Long id) {
        return iLigneVenteService.getOne(id);
    }

    @GetMapping("/getAll")
    public List<LigneVente> getAll() {
        return iLigneVenteService.getAll();
    }
}
