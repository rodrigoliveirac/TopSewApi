package com.rodcollab.topsew.service;

import java.util.List;

import com.rodcollab.topsew.model.dto.FabricStockEntryDTO;
import com.rodcollab.topsew.model.entity.FabricStockEntryEntity;

public interface FabricStockEntryService {

    FabricStockEntryDTO saveFabricStockEntry(FabricStockEntryDTO fabricStockEntry);

    List<FabricStockEntryDTO> fetchAllFabricStockEntries();

    FabricStockEntryEntity getFabricStockEntryById(Long id);

    FabricStockEntryEntity updateFabricStockEntryById(Long id, FabricStockEntryEntity fabricStockEntry);

    String deleteFabricStockEntryById(Long id);

    void deleteAll();
}
