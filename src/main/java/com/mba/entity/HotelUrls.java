
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelUrls implements Serializable
{

    @SerializedName("hotelInfositeUrl")
    @Expose
    private String hotelInfositeUrl;
    @SerializedName("hotelSearchResultUrl")
    @Expose
    private String hotelSearchResultUrl;
    
    private final static long serialVersionUID = -1200327018558736633L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HotelUrls() {
    }

    /**
     * 
     * @param hotelSearchResultUrl
     * @param hotelInfositeUrl
     */
    public HotelUrls(String hotelInfositeUrl, String hotelSearchResultUrl) {
        super();
        this.hotelInfositeUrl = hotelInfositeUrl;
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

}
