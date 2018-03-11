
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelInfo implements Serializable
{

    @SerializedName("hotelId")
    @Expose
    private String hotelId;
    @SerializedName("hotelName")
    @Expose
    private String hotelName;
    @SerializedName("localizedHotelName")
    @Expose
    private String localizedHotelName;
    @SerializedName("hotelDestination")
    @Expose
    private String hotelDestination;
    @SerializedName("hotelDestinationRegionID")
    @Expose
    private String hotelDestinationRegionID;
    @SerializedName("hotelLongDestination")
    @Expose
    private String hotelLongDestination;
    @SerializedName("hotelStreetAddress")
    @Expose
    private String hotelStreetAddress;
    @SerializedName("hotelCity")
    @Expose
    private String hotelCity;
    @SerializedName("hotelProvince")
    @Expose
    private String hotelProvince;
    @SerializedName("hotelCountryCode")
    @Expose
    private String hotelCountryCode;
    @SerializedName("hotelLatitude")
    @Expose
    private Double hotelLatitude;
    @SerializedName("hotelLongitude")
    @Expose
    private Double hotelLongitude;
    @SerializedName("hotelStarRating")
    @Expose
    private String hotelStarRating;
    @SerializedName("hotelGuestReviewRating")
    @Expose
    private Double hotelGuestReviewRating;
    @SerializedName("hotelReviewTotal")
    @Expose
    private Integer hotelReviewTotal;
    @SerializedName("hotelImageUrl")
    @Expose
    private String hotelImageUrl;
    @SerializedName("vipAccess")
    @Expose
    private Boolean vipAccess;
    @SerializedName("isOfficialRating")
    @Expose
    private Boolean isOfficialRating;
    
    private final static long serialVersionUID = -1872857629257188599L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HotelInfo() {
    }

    /**
     * 
     * @param hotelStreetAddress
     * @param hotelImageUrl
     * @param localizedHotelName
     * @param hotelStarRating
     * @param vipAccess
     * @param hotelDestination
     * @param hotelLatitude
     * @param isOfficialRating
     * @param hotelProvince
     * @param hotelDestinationRegionID
     * @param hotelId
     * @param hotelCity
     * @param hotelLongitude
     * @param hotelReviewTotal
     * @param hotelName
     * @param hotelGuestReviewRating
     * @param hotelCountryCode
     * @param hotelLongDestination
     */
    public HotelInfo(String hotelId, String hotelName, String localizedHotelName, String hotelDestination, String hotelDestinationRegionID, String hotelLongDestination, String hotelStreetAddress, String hotelCity, String hotelProvince, String hotelCountryCode, Double hotelLatitude, Double hotelLongitude, String hotelStarRating, Double hotelGuestReviewRating, Integer hotelReviewTotal, String hotelImageUrl, Boolean vipAccess, Boolean isOfficialRating) {
        super();
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.localizedHotelName = localizedHotelName;
        this.hotelDestination = hotelDestination;
        this.hotelDestinationRegionID = hotelDestinationRegionID;
        this.hotelLongDestination = hotelLongDestination;
        this.hotelStreetAddress = hotelStreetAddress;
        this.hotelCity = hotelCity;
        this.hotelProvince = hotelProvince;
        this.hotelCountryCode = hotelCountryCode;
        this.hotelLatitude = hotelLatitude;
        this.hotelLongitude = hotelLongitude;
        this.hotelStarRating = hotelStarRating;
        this.hotelGuestReviewRating = hotelGuestReviewRating;
        this.hotelReviewTotal = hotelReviewTotal;
        this.hotelImageUrl = hotelImageUrl;
        this.vipAccess = vipAccess;
        this.isOfficialRating = isOfficialRating;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    public void setLocalizedHotelName(String localizedHotelName) {
        this.localizedHotelName = localizedHotelName;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public String getHotelStarRating() {
        return hotelStarRating;
    }

    public void setHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public Integer getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    public void setHotelReviewTotal(Integer hotelReviewTotal) {
        this.hotelReviewTotal = hotelReviewTotal;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    public Boolean getVipAccess() {
        return vipAccess;
    }

    public void setVipAccess(Boolean vipAccess) {
        this.vipAccess = vipAccess;
    }

    public Boolean getIsOfficialRating() {
        return isOfficialRating;
    }

    public void setIsOfficialRating(Boolean isOfficialRating) {
        this.isOfficialRating = isOfficialRating;
    }

}
