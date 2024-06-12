package com.rodcollab.topsew.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodcollab.topsew.FabricStockMapper;
import com.rodcollab.topsew.model.dto.FabricStockEntryDTO;
import com.rodcollab.topsew.model.entity.FabricStockEntryEntity;
import com.rodcollab.topsew.repository.FabricStockEntryRepository;

@Service
public class FabricStockEntryServiceImpl implements FabricStockEntryService {

    @Autowired
    public FabricStockEntryRepository fabricStockEntryRepository;
    public FabricStockMapper mapper;

    @Override
    public FabricStockEntryDTO saveFabricStockEntry(FabricStockEntryDTO fabricStockEntryDTO) {
        mapper = new FabricStockMapper();
        FabricStockEntryEntity createdFabricStockEntryEntity = fabricStockEntryRepository.save(mapper.toNewFabricStockEntryEntity(fabricStockEntryDTO));
        return mapper.toDto(createdFabricStockEntryEntity);
    }

    @Override
    public List<FabricStockEntryDTO> fetchAllFabricStockEntries() {
        mapper = new FabricStockMapper();
        List<FabricStockEntryEntity> allFabricStockEntries = fabricStockEntryRepository.findAll();
        List<FabricStockEntryDTO> allFabricStockEntriesDTO = new ArrayList<FabricStockEntryDTO>();
        for(int i = 0; i < allFabricStockEntries.size(); i++) {
            allFabricStockEntriesDTO.add(mapper.toDto(allFabricStockEntries.get(i)));
        }
        return allFabricStockEntriesDTO;
    }

    @Override
    public FabricStockEntryEntity getFabricStockEntryById(Long id) {
        Optional<FabricStockEntryEntity> fabricStockEntry = fabricStockEntryRepository.findById(id);
        if (fabricStockEntry.isPresent()) {
            return fabricStockEntry.get();
        }
        return null;
    }

    @Override
    public FabricStockEntryEntity updateFabricStockEntryById(Long id, FabricStockEntryEntity fabricStockEntry) {
        // Optional<FabricStockEntryEntity> employee1 = fabricStockEntryRepository.findById(id);

        // if (employee1.isPresent()) {
        //     FabricStockEntryEntity originalEmployee = employee1.get();

        //     if (Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(employee.getEmployeeName())) {
        //         originalEmployee.setEmployeeName(employee.getEmployeeName());
        //     }
        //     if (Objects.nonNull(employee.getEmployeeSalary()) && employee.getEmployeeSalary() != 0) {
        //         originalEmployee.setEmployeeSalary(employee.getEmployeeSalary());
        //     }
        //     return employeeRepository.save(originalEmployee);
        // }
        return null;
    }

    @Override
    public String deleteFabricStockEntryById(Long id) {
        if (fabricStockEntryRepository.findById(id).isPresent()) {
            fabricStockEntryRepository.deleteById(id);
            return "FabricStockEntry deleted successfully";
        }
        return "No such FabricStockEntry in the database";
    }

    @Override
    public void deleteAll() {
        fabricStockEntryRepository.deleteAll();;
    }

}
