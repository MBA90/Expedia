
package com.mba.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hotel implements Serializable
{

    @SerializedName("offerDateRange")
    @Expose
    private OfferDateRange offerDateRange;
    @SerializedName("destination")
    @Expose
    private Destination destination;
    @SerializedName("hotelInfo")
    @Expose
    private HotelInfo hotelInfo;
    @SerializedName("hotelPricingInfo")
    @Expose
    private HotelPricingInfo hotelPricingInfo;
    @SerializedName("hotelUrls")
    @Expose
    private HotelUrls hotelUrls;
    
    
    private Offers offers;
    
    public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	private final static long serialVersionUID = -810579465630283850L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hotel() {
    	offers = new Offers(); 
    }

    /**
     * 
     * @param offerDateRange
     * @param hotelUrls
     * @param hotelInfo
     * @param hotelPricingInfo
     * @param destination
     */
    public Hotel(OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo, HotelPricingInfo hotelPricingInfo, HotelUrls hotelUrls) {
        super();
        this.offerDateRange = offerDateRange;
        this.destination = destination;
        this.hotelInfo = hotelInfo;
        this.hotelPricingInfo = hotelPricingInfo;
        this.hotelUrls = hotelUrls;
    }

    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

}
