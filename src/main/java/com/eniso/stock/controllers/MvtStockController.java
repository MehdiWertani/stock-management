package com.eniso.stock.controllers;

import com.eniso.stock.entities.MvtStock;
import com.eniso.stock.service.IMvtStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mvtStock")
public class MvtStockController {
    IMvtStockService iMvtStockService ;
  @Autowired
    public MvtStockController(@Qualifier("MvtStockServiceImpl") IMvtStockService iMvtStockService) {
        this.iMvtStockService = iMvtStockService;
    }
    @PostMapping("/save")
    public MvtStock save(MvtStock mvtStock) {
        return iMvtStockService.save(mvtStock);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody MvtStock mvtStock) {
        iMvtStockService.delete(mvtStock);
    }

    @PutMapping("/update")
    public MvtStock update(@RequestBody  MvtStock mvtStock) {
        return iMvtStockService.save(mvtStock);
    }

    @GetMapping("/getOne/{id}")
    public MvtStock getOne(@PathVariable Long id) {
        return iMvtStockService.getOne(id);
    }

    @GetMapping("/getAll")
    public List<MvtStock> getAll() {
        return iMvtStockService.getAll();
    }
}
