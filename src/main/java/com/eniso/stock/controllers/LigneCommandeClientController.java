package com.eniso.stock.controllers;

import com.eniso.stock.entities.LigneCommandeClient;
import com.eniso.stock.service.ILigneCommandeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LigneCommandeClient")
public class LigneCommandeClientController  {
    ILigneCommandeClientService iLigneCommandeClientService ;
    @Autowired
    public LigneCommandeClientController(@Qualifier("LigneCommandeClientServiceImpl") ILigneCommandeClientService iLigneCommandeClientService) {
        this.iLigneCommandeClientService = iLigneCommandeClientService;
    }
    @PostMapping("/save")
    LigneCommandeClient save(@RequestBody LigneCommandeClient ligneCommandeClient) {
        return iLigneCommandeClientService.save(ligneCommandeClient);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody LigneCommandeClient ligneCommandeClient) {
        iLigneCommandeClientService.delete(ligneCommandeClient);
    }

    @PutMapping("/update")
    LigneCommandeClient update(@RequestBody LigneCommandeClient ligneCommandeClient) {
        return iLigneCommandeClientService.update(ligneCommandeClient);
    }

    @GetMapping("/getOne/{id}")
    LigneCommandeClient getOne(@PathVariable("id") Long id) {
        return iLigneCommandeClientService.getOne(id);
    }

    @GetMapping("/getAll")
    List<LigneCommandeClient> getAll() {
        return iLigneCommandeClientService.getAll();
    }
}
