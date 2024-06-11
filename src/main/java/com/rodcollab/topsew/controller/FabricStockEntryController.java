package com.rodcollab.topsew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rodcollab.topsew.model.dto.FabricStockEntryDTO;
import com.rodcollab.topsew.model.entity.FabricStockEntryEntity;
import com.rodcollab.topsew.service.FabricStockEntryService;

import java.util.List;

@RestController
public class FabricStockEntryController {

    @Autowired
    private FabricStockEntryService fabricStockEntryService;

    @PostMapping("/fabricStockEntry")
    public FabricStockEntryDTO saveEmployee(@RequestBody FabricStockEntryDTO fabricStockEntryDTO) {
        FabricStockEntryDTO createdFabricStockEntryEntity = fabricStockEntryService.saveFabricStockEntry(fabricStockEntryDTO);
        return createdFabricStockEntryEntity;
    }

    @GetMapping("/fabricStockEntries")
    public List<FabricStockEntryDTO> getAllFabricStockEntries() {
        return fabricStockEntryService.fetchAllFabricStockEntries();
    }

    @GetMapping("/fabricStockEntry/{id}")
    public FabricStockEntryEntity getFabricStockEntryById(@PathVariable("id") Long id) {
        return fabricStockEntryService.getFabricStockEntryById(id);
    }

    @PutMapping("/fabricStockEntry/{id}")
    public FabricStockEntryEntity updateEmployee(@PathVariable("id") Long id, @RequestBody FabricStockEntryEntity fabricStockEntry) {
        return fabricStockEntryService.updateFabricStockEntryById(id, fabricStockEntry);
    }

    @DeleteMapping("/fabricStockEntry/{id}")
    public String deleteFabricStockEntry(@PathVariable("id") Long id) {
        return fabricStockEntryService.deleteFabricStockEntryById(id);
    }
}
