package com.eniso.stock.controllers;

import com.eniso.stock.entities.Client;
import com.eniso.stock.entities.CommandeClient;
import com.eniso.stock.entities.LigneCommandeClient;
import com.eniso.stock.service.ICommandeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CommandeClientCtrl")
public class CommandeClientController {
    ICommandeClientService iCommandeClientService ;
    @Autowired
    public  CommandeClientController( @Qualifier("CommandeClientServiceImpl") ICommandeClientService iCommandeClientService){
        this.iCommandeClientService=iCommandeClientService;

    }
    @PostMapping("/save")
    public CommandeClient save(@RequestBody CommandeClient commandeClient) {
        return iCommandeClientService.save(commandeClient) ;
    }

    @PutMapping("/update")
    public CommandeClient update(@RequestBody CommandeClient commandeClient) {
        return iCommandeClientService.save(commandeClient);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody CommandeClient commandeClient) {
        iCommandeClientService.delete(commandeClient);

    }

    @GetMapping("/getOne/{id}")
    public CommandeClient getOne(@PathVariable Long idCommandeClient) {
        return iCommandeClientService.getOne(idCommandeClient);
    }

    @GetMapping("/getAll")
    public List<CommandeClient> getAll() {
        return iCommandeClientService.getAll();
    }

    @GetMapping("/getAllByClient")
    public List<CommandeClient> getAllByClient(@RequestBody Client client) {
        return client.getCommandeClients();
    }

    @GetMapping("/getclientByCommandeClient")
    public Client getClientByIdCommandeClient(@RequestBody CommandeClient commandeClient) {
        return commandeClient.getClient();
    }

    @GetMapping("/getLigneCommandeClientByCommandeClient")
    public List<LigneCommandeClient> getLigneCommandeClientByCommandeClient(@RequestBody CommandeClient commandeClient) {
        return commandeClient.getLigneCommandeClients();
    }

    @GetMapping("/getonebyLigneCommandeClient")
    public CommandeClient getOneByidLigneCommandeClient(@RequestBody LigneCommandeClient ligneCommandeClient) {
        return ligneCommandeClient.getCommandeClient();
    }
}
