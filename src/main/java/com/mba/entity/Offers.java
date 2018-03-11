
package com.mba.entity;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offers implements Serializable
{

    @SerializedName("Hotel")
    @Expose
    private List<Hotel> hotel;  
    
    private final static long serialVersionUID = -1541862793121962656L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Offers() {
    }

    /**
     * 
     * @param hotel
     */
    public Offers(List<Hotel> hotel) {
        super();
        this.hotel = hotel;
    }

    public List<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }

}
