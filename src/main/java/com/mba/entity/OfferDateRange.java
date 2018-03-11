
package com.mba.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfferDateRange implements Serializable
{

    @SerializedName("travelStartDate")
    @Expose
    private List<Integer> travelStartDate = new ArrayList<Integer>();
    @SerializedName("travelEndDate")
    @Expose
    private List<Integer> travelEndDate = new ArrayList<Integer>();
    @SerializedName("lengthOfStay")
    @Expose
    private Integer lengthOfStay;
    
    private final static long serialVersionUID = -2641284816555046681L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfferDateRange() {
    }

    /**
     * 
     * @param travelEndDate
     * @param lengthOfStay
     * @param travelStartDate
     */
    public OfferDateRange(List<Integer> travelStartDate, List<Integer> travelEndDate, Integer lengthOfStay) {
        super();
        this.travelStartDate = travelStartDate;
        this.travelEndDate = travelEndDate;
        this.lengthOfStay = lengthOfStay;
    }

    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }
    
    /**
     * Convert Start Date List To String in Date Format.
     * 
     * @return
     */
    public String getSatrtDateAsString() {
    	StringBuilder tranvelStartDate = new StringBuilder();
    	if(getTravelStartDate() != null && getTravelStartDate().size() > 0) {
    		tranvelStartDate = new StringBuilder();
    		for (int i = 0; i < getTravelStartDate().size(); i++) {
    			tranvelStartDate.append(getTravelStartDate().get(i));
    			if(i < getTravelStartDate().size()-1) {
    				tranvelStartDate.append("-");
    			}
			}
    		
    	}
    	return tranvelStartDate.toString();
    }
    
    /**
     * Convert End Date List To String in Date Format.
     * 
     * @return
     */
    public String getEndDateAsString() {
    	StringBuilder tranvelEndDate = new StringBuilder();
    	if(getTravelEndDate() != null && getTravelEndDate().size() > 0) {
    		tranvelEndDate = new StringBuilder();
    		for (int i = 0; i < getTravelEndDate().size(); i++) {
    			tranvelEndDate.append(getTravelEndDate().get(i));
    			if(i < getTravelEndDate().size()-1) {
    				tranvelEndDate.append("-");
    			}
			}
    	}
    	return tranvelEndDate.toString();
    }
}
