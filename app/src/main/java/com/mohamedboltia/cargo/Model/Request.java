package com.mohamedboltia.cargo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {
    @SerializedName("Cargo_type")
    @Expose
    private String cargoType;
    @SerializedName("Pick_Up_Location")
    @Expose
    private String pickUpLocation;
    @SerializedName("Deliver_To")
    @Expose
    private String deliverTo;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("Item_Weight")
    @Expose
    private Double itemWeight;
    @SerializedName("Item_Width")
    @Expose
    private Double itemWidth;
    @SerializedName("Item_Height")
    @Expose
    private Double itemHeight;
    @SerializedName("Item_length")
    @Expose
    private Double itemLength;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("finish_date")
    @Expose
    private String finishDate;
    @SerializedName("Total_Weight")
    @Expose
    private Double totalWeight;
    @SerializedName("Total_Volume")
    @Expose
    private Integer totalVolume;
    @SerializedName("company_import_export")
    @Expose
    private Integer companyImportExport;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(String deliverTo) {
        this.deliverTo = deliverTo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Double getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(Double itemWidth) {
        this.itemWidth = itemWidth;
    }

    public Double getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(Double itemHeight) {
        this.itemHeight = itemHeight;
    }

    public Double getItemLength() {
        return itemLength;
    }

    public void setItemLength(Double itemLength) {
        this.itemLength = itemLength;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Integer totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Integer getCompanyImportExport() {
        return companyImportExport;
    }

    public void setCompanyImportExport(Integer companyImportExport) {
        this.companyImportExport = companyImportExport;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
