package com.rodcollab.topsew.model;

public class ColorStockItem {

    private String colorId;
    private Double amount;

    public ColorStockItem() {

    }

    public ColorStockItem(String colorId, Double amount) {
        this.colorId = colorId;
        this.amount = amount;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
