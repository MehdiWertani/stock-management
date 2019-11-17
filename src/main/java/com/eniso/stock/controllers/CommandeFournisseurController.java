package com.eniso.stock.controllers;

import com.eniso.stock.entities.CommandeFournisseur;
import com.eniso.stock.service.ICommandeFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CommandeFournisseur")
public class CommandeFournisseurController {
ICommandeFournisseurService iCommandeFournisseurService;
  @Autowired
    public CommandeFournisseurController(@Qualifier("CommandeFournisseurServiceImpl") ICommandeFournisseurService iCommandeFournisseurService) {
        this.iCommandeFournisseurService = iCommandeFournisseurService;
    }
    @PostMapping("/save")
    CommandeFournisseur save(@RequestBody CommandeFournisseur commandeFournisseur) {
        return iCommandeFournisseurService.save(commandeFournisseur);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody CommandeFournisseur commandeFournisseur) {
        iCommandeFournisseurService.delete(commandeFournisseur);
    }

    @PutMapping("/update")
    CommandeFournisseur update(CommandeFournisseur commandeFournisseur) {
        return iCommandeFournisseurService.update(commandeFournisseur);
    }

    @GetMapping("/getOne/{id}")
    CommandeFournisseur getOne(@PathVariable("id") Long id) {
        return iCommandeFournisseurService.getOne(id);
    }

    @GetMapping("/getAll")
    List<CommandeFournisseur> getAll() {
        return iCommandeFournisseurService.getAll();
    }
}
