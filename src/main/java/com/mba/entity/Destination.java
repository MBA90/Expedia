
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Destination implements Serializable
{

    @SerializedName("regionID")
    @Expose
    private String regionID;
    @SerializedName("associatedMultiCityRegionId")
    @Expose
    private String associatedMultiCityRegionId;
    @SerializedName("longName")
    @Expose
    private String longName;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("tla")
    @Expose
    private String tla;
    @SerializedName("nonLocalizedCity")
    @Expose
    private String nonLocalizedCity;
    
    private final static long serialVersionUID = 1473998600452056883L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Destination() {
    }

    /**
     * 
     * @param province
     * @param longName
     * @param nonLocalizedCity
     * @param tla
     * @param shortName
     * @param associatedMultiCityRegionId
     * @param regionID
     * @param city
     * @param country
     */
    public Destination(String regionID, String associatedMultiCityRegionId, String longName, String shortName, String country, String province, String city, String tla, String nonLocalizedCity) {
        super();
        this.regionID = regionID;
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
        this.longName = longName;
        this.shortName = shortName; 
        this.country = country;
        this.province = province;
        this.city = city;
        this.tla = tla;
        this.nonLocalizedCity = nonLocalizedCity;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAssociatedMultiCityRegionId() {
        return associatedMultiCityRegionId;
    }

    public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

    public String getNonLocalizedCity() {
        return nonLocalizedCity;
    }

    public void setNonLocalizedCity(String nonLocalizedCity) {
        this.nonLocalizedCity = nonLocalizedCity;
    }
 
}
