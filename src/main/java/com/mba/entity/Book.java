
package com.mba.entity;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book implements Serializable
{

    @SerializedName("offerInfo")
    @Expose
    private OfferInfo offerInfo;
    @SerializedName("userInfo")
    @Expose
    private UserInfo userInfo;
    @SerializedName("offers")
    @Expose
    private Offers offers;
    
    private final static long serialVersionUID = -3612061732141467407L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Book() {
    }

    /**
     * 
     * @param offers
     * @param offerInfo
     * @param userInfo
     */
    public Book(OfferInfo offerInfo, UserInfo userInfo, Offers offers) {
        super();
        this.offerInfo = offerInfo;
        this.userInfo = userInfo;
        this.offers = offers;
    }

    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

}
