package com.eniso.stock.controllers;

import com.eniso.stock.entities.Catagory;
import com.eniso.stock.service.ICatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class CatagoryController {
    ICatagoryService iCatagoryService ;
   @Autowired
    public CatagoryController(@Qualifier("CatagoryServiceImpl") ICatagoryService iCatagoryService) {
        this.iCatagoryService = iCatagoryService;
    }
    @PostMapping("/save")
    public Catagory save(Catagory catagory) {
        return iCatagoryService.save(catagory);
    }

    @DeleteMapping("/delete")
    public void delete(Catagory catagory) {
        iCatagoryService.delete(catagory);
    }

    @PutMapping("/update")
    public Catagory update(Catagory catagory) {
        return iCatagoryService.save(catagory);
    }

    @GetMapping("/getOne")
    public Catagory getOne(Long id) {
        return iCatagoryService.getOne(id);
    }

    @GetMapping("/getAll")
    public List<Catagory> getAll() {
        return iCatagoryService.getAll();
    }
}
