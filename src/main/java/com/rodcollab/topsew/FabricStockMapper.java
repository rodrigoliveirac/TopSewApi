package com.rodcollab.topsew;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.json.JSONArray;
import org.json.JSONObject;
import com.rodcollab.topsew.model.ColorStockItem;
import com.rodcollab.topsew.model.dto.FabricStockEntryDTO;
import com.rodcollab.topsew.model.entity.FabricStockEntryEntity;

public class FabricStockMapper {
    
    public FabricStockEntryDTO toDto(FabricStockEntryEntity fabricStockEntryEntity) {
        Long id = fabricStockEntryEntity.getFabricStockEntryId();
        String formattedDate = getFormattedDate(fabricStockEntryEntity.getCreatedAt().getTime());
        Optional<String> orderId = fabricStockEntryEntity.getOrderId();
        Double amount = fabricStockEntryEntity.getAmount();
        String entryType = fabricStockEntryEntity.getEntryType();
        int fabricId = fabricStockEntryEntity.getFabricId();
        String fabricType = fabricStockEntryEntity.getFabricType();
        List<ColorStockItem> colorStock = getColorStockItems(fabricStockEntryEntity.getColorStock());
        return new FabricStockEntryDTO(Optional.ofNullable(id), Optional.ofNullable(formattedDate), orderId, amount, entryType, fabricId, fabricType, colorStock);
    }

    public FabricStockEntryEntity toNewFabricStockEntryEntity(FabricStockEntryDTO fabricStockEntryDTO) {
        Timestamp createdAt = Timestamp.from(Instant.now());
        Optional<String> orderId = fabricStockEntryDTO.getOrderId();
        Double amount = fabricStockEntryDTO.getAmount();
        String entryType = fabricStockEntryDTO.getEntryType();
        int fabricId = fabricStockEntryDTO.getFabricId();
        String fabricType = fabricStockEntryDTO.getFabricType();
        List<ColorStockItem> colorStockItems = fabricStockEntryDTO.getColorStock();
        String colorStockJsonString = getColorStockItemsString(colorStockItems);
        return new FabricStockEntryEntity(createdAt, orderId, amount, entryType, fabricId, fabricType, colorStockJsonString);
    }

    public String getColorStockItemsString(List<ColorStockItem> colorStockItems) {
        JSONArray colorStockItemsJson = new JSONArray();
        for(int i = 0; i < colorStockItems.size(); i++) {
            ColorStockItem colorStockItem = colorStockItems.get(i);
            String colorId = colorStockItem.getColorId();
            Double amount = colorStockItem.getAmount();
            JSONObject colorStockItemJsonObject = new JSONObject();
            colorStockItemJsonObject.put("colorId", colorId);
            colorStockItemJsonObject.put("amount", amount);
            colorStockItemsJson.put(colorStockItemJsonObject);
        }
        return colorStockItemsJson.toString();
    }

    public List<ColorStockItem> getColorStockItems(String colorStockFromString) {
        List<ColorStockItem> colorStockItems = new ArrayList<ColorStockItem>();
        JSONArray colorStockFromJson = new JSONArray(colorStockFromString);
        for(int i = 0; i < colorStockFromJson.length(); i++) {
            String colorId = colorStockFromJson.getJSONObject(i).getString("colorId");
            Double amount = colorStockFromJson.getJSONObject(i).getDouble("amount");
            ColorStockItem colorStockItem = new ColorStockItem(colorId, amount);
            colorStockItems.add(i, colorStockItem);
        }
        return colorStockItems;
    }
    public String getFormattedDate(long createdAt) {
        Date date = new Date(createdAt);
        String formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return formattedDate;
    }
}
