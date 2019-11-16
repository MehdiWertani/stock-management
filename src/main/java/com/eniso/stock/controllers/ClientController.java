package com.eniso.stock.controllers;

import com.eniso.stock.entities.Client;
import com.eniso.stock.service.IClientService;
import com.eniso.stock.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientCtrl")
public class ClientController {

    IClientService iClientService;

    @Autowired
    public ClientController(@Qualifier("ClientServiceImpl") IClientService iClientService) {
        this.iClientService = iClientService;
    }

    @PostMapping("/save")
    Client save(@RequestBody Client client) {
        return iClientService.save(client);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody Client client) {
        iClientService.delete(client);
    }

    @PutMapping("/update")
    Client update(Client client) {
        return iClientService.update(client);
    }

    @GetMapping("/getOne/{id}")
    Client getOne(@PathVariable("id") Long id) {
        return iClientService.getOne(id);
    }

    @GetMapping("/getAll")
    List<Client> getAll() {
        return iClientService.getAll();
    }

    @GetMapping("/getClientByMail/{mail}")
    Client getClientByMail(@PathVariable("mail") String mail) {
        return iClientService.getClientByMail(mail);
    }

    @GetMapping("/getClientByFilterCriteria/namePattern")
    Client getClientByFilterCriteria(@PathVariable String namePattern) {
        return iClientService.getClientByFilterCriteria(namePattern);
    }
}
