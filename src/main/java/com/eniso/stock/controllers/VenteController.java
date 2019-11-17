package com.eniso.stock.controllers;

import com.eniso.stock.entities.Vente;
import com.eniso.stock.service.IVenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vente")
public class VenteController {
    IVenteService iVenteService;
   @Autowired
    public VenteController(@Qualifier("VenteServiceImpl") IVenteService iVenteService) {
        this.iVenteService = iVenteService;
    }
    @PostMapping("/save")
    public Vente save(Vente vente) {
        return iVenteService.save(vente);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Vente vente) {
        iVenteService.delete(vente);
    }

    @PutMapping("/update")
    public Vente update(@RequestBody  Vente vente) {
        return iVenteService.save(vente);
    }

    @GetMapping("/getOne/{id}")
    public Vente getOne(@PathVariable Long id) {
        return iVenteService.getOne(id);
    }

    @GetMapping("/getAll")
    public List<Vente> getAll() {
        return iVenteService.getAll();
    }
}
