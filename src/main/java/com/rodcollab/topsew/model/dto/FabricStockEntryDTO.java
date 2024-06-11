package com.rodcollab.topsew.model.dto;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import com.rodcollab.topsew.model.ColorStockItem;

public class FabricStockEntryDTO {

    private Optional<Long> id;
    private Optional<String> createdAt;
    private Optional<String> orderId;
    private Double amount;
    private String entryType;
    private int fabricId;
    private String fabricType;
    private List<ColorStockItem> colorStock;

    public FabricStockEntryDTO() {

    }
    
    public FabricStockEntryDTO(
        Optional<Long> id,
        Optional<String> createdAt,
        Optional<String> orderId, 
        Double amount,
        String entryType, 
        int fabricId, 
        String fabricType, 
        List<ColorStockItem> colorStock
        ) {
        this.id = id;
        this.createdAt = createdAt;
        this.orderId = orderId;
        this.amount = amount;
        this.entryType = entryType;
        this.fabricId = fabricId;
        this.fabricType = fabricType;
        this.colorStock = colorStock;
    }

    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public Optional<String> getOrderId() {
        return orderId;
    }
    public void setOrderId(Optional<String> orderId) {
        this.orderId = orderId;
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
    public void setFabricTypeId(String fabricType) {
        this.fabricType = fabricType;
    }
    public List<ColorStockItem> getColorStock() {
        return colorStock;
    }
    public void setColorStock(List<ColorStockItem> colorStock) {
        this.colorStock = colorStock;
    }
}
