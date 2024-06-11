package com.rodcollab.topsew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodcollab.topsew.model.entity.FabricStockEntryEntity;

@Repository
public interface FabricStockEntryRepository extends JpaRepository<FabricStockEntryEntity, Long> {

    
}