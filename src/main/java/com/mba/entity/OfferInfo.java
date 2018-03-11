
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfferInfo implements Serializable
{

    @SerializedName("siteID")
    @Expose
    private String siteID;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("userSelectedCurrency")
    @Expose
    private String userSelectedCurrency;
    
    private final static long serialVersionUID = -6317091847774378899L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfferInfo() {
    }

    /**
     * 
     * @param siteID
     * @param userSelectedCurrency
     * @param language
     * @param currency
     */
    public OfferInfo(String siteID, String language, String currency, String userSelectedCurrency) {
        super();
        this.siteID = siteID;
        this.language = language;
        this.currency = currency;
        this.userSelectedCurrency = userSelectedCurrency;
    }

    public String getSiteID() {
        return siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUserSelectedCurrency() {
        return userSelectedCurrency;
    }

    public void setUserSelectedCurrency(String userSelectedCurrency) {
        this.userSelectedCurrency = userSelectedCurrency;
    }

}
