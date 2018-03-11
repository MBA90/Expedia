
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelPricingInfo implements Serializable
{

    @SerializedName("averagePriceValue")
    @Expose
    private Double averagePriceValue;
    @SerializedName("totalPriceValue")
    @Expose
    private Double totalPriceValue;
    @SerializedName("crossOutPriceValue")
    @Expose
    private Double crossOutPriceValue;
    @SerializedName("originalPricePerNight")
    @Expose
    private Double originalPricePerNight;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("percentSavings")
    @Expose
    private Double percentSavings;
    @SerializedName("drr")
    @Expose
    private Boolean drr;
    
    private final static long serialVersionUID = -4972007353843203827L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HotelPricingInfo() {
    }

    /**
     * 
     * @param totalPriceValue
     * @param averagePriceValue
     * @param originalPricePerNight
     * @param drr
     * @param percentSavings
     * @param currency
     * @param crossOutPriceValue
     */
    public HotelPricingInfo(Double averagePriceValue, Double totalPriceValue, Double crossOutPriceValue, Double originalPricePerNight, String currency, Double percentSavings, Boolean drr) {
        super();
        this.averagePriceValue = averagePriceValue;
        this.totalPriceValue = totalPriceValue;
        this.crossOutPriceValue = crossOutPriceValue;
        this.originalPricePerNight = originalPricePerNight;
        this.currency = currency;
        this.percentSavings = percentSavings;
        this.drr = drr;
    }

    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public Double getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    public void setCrossOutPriceValue(Double crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
    }

    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(Double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    public Boolean getDrr() {
        return drr;
    }

    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

}
