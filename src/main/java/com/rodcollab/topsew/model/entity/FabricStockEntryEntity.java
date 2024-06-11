package com.rodcollab.topsew.model.entity;

import java.sql.Timestamp;
import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FabricStockEntryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fabricStockEntryId;
    private Timestamp createdAt;
    @Column(nullable = true) 
    private String orderId;
    private Double amount;
    private String entryType;
    private int fabricId;
    private String fabricType;
    private String colorStock;

    public FabricStockEntryEntity() {

    }
    
    public FabricStockEntryEntity(
        Timestamp createdAt, 
        Optional<String> orderId, 
        Double amount,
        String entryType, 
        int fabricId, 
        String fabricType, 
        String colorStock
        ) {
        this.createdAt = createdAt;
        if(orderId != null) {
            this.orderId = orderId.get();
        }
        this.amount = amount;
        this.entryType = entryType;
        this.fabricId = fabricId;
        this.fabricType = fabricType;
        this.colorStock = colorStock;
    }

    public Long getFabricStockEntryId() {
        return fabricStockEntryId;
    }
    public void setFabricStockEntryId(Long fabricStockEntryId) {
        this.fabricStockEntryId = fabricStockEntryId;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    public Optional<String> getOrderId() {
        return Optional.ofNullable(orderId);
    }
    public void setOrderId(Optional<String> orderId) {
        if(orderId != null) {
            this.orderId =  orderId.get();
        }
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getEntryType() {
        return entryType;
    }
    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }
    public int getFabricId() {
        return fabricId;
    }
    public void setFabricId(int fabricId) {
        this.fabricId = fabricId;
    }
    public String getFabricType() {
        return fabricType;
    }
    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }
    public String getColorStock() {
        return colorStock;
    }
    public void setColorStock(String colorStock) {
        this.colorStock = colorStock;
    }
}