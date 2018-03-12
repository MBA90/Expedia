package com.mba.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.mba.controller.OfferHandler;
import com.mba.controller.OfferHandlerBean;
import com.mba.entity.Book;
import com.mba.entity.Hotel;
import com.mba.entity.OfferParam;
import com.mba.entity.Offers;
import com.mba.util.Common;

/**
 * Home bean Class
 * 
 * @author m.bassam
 *
 */
@ManagedBean(name = "homeBean")
@RequestScoped
public class HomeBean implements Serializable {

	/** 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instance Variable
	 */
	private String scenario = "deal-finder";
	private String page = "foo";
	private String uid = "foo";
	private String productType = "Hotel";

	private String destinationName;

	private Date minTripStartDate;
	private Date maxTripStartDate;

	private Double minStarRating;
	private Double maxStarRating;

	private Integer minTotalRate;
	private Integer maxTotalRate;

	private String dataStatus = "";

	private Map<String, String> paramMap;

	private Book book;
	private Offers offers;

	private List<Hotel> hotelList;

	private OfferHandler offerHandler = new OfferHandlerBean();

	/**
	 * Init Method
	 * 
	 * This method will be call each time the page is requested
	 */
	@PostConstruct
	public void init() {

	}

	/**
	 * Do offer Search
	 * 
	 * This method will call the offer handler and pass the the parameters to, from
	 * the Xhtml page
	 * 
	 * @return string success of fail
	 */
	public String doOfferSearch() {
		try {

			/** call get offer method from offer handler */
			setBook(offerHandler.getOffers(fillParamMap()));

			/** Check if the book object is null */
			if (getBook() != null && getBook().getOffers() != null) {

				/** Get offer object */
				setOffers(getBook().getOffers());

				/** Check hotel list object is null */
				if (getOffers().getHotel() != null && getOffers().getHotel().size() > 0) {
					setDataStatus("");
					/** Get the hotel list to display in xhtml page */
					setHotelList(getOffers().getHotel());
				} else {
					setDataStatus("No Data Found"); 
				}
			}
			return "success";
		} catch (Exception ex) {
			return "error";
		}
	}

	/**
	 * Fill param map
	 * 
	 * @return Map of the parameters thats required to pass while calling the
	 *         service
	 */
	private Map<String, String> fillParamMap() {

		/** Get the user input values from xhtml page */
		String destinationName = getDestinationName();
		String minTripStartDate = Common.convertDateToString(getMinTripStartDate());
		String maxTripStartDate = Common.convertDateToString(getMaxTripStartDate());
		String minStarRating = Common.convertDoubletoString(getMinStarRating());
		String maxStarRating = Common.convertDoubletoString(getMaxStarRating());
		String minTotalRate = Common.convertIntegerToString(getMinTotalRate());
		String maxTotalRate = Common.convertIntegerToString(getMaxTotalRate());

		setParamMap(new HashMap<String, String>());

		/** adding the values to map */
		getParamMap().put(OfferParam.SCENARIO.param(), scenario);
		getParamMap().put(OfferParam.PAGE.param(), page);
		getParamMap().put(OfferParam.PRODUCT_TYPE.param(), productType);
		getParamMap().put(OfferParam.UID.param(), uid);

		/** check blank or null */
		if (!Common.isBlankOrNull(destinationName)) {
			getParamMap().put(OfferParam.DESTINACTION_NAME.param(), destinationName);
		}
		if (!Common.isBlankOrNull(minTripStartDate)) {
			getParamMap().put(OfferParam.MIN_TRIP_START_DATE.param(), minTripStartDate);
		}
		if (!Common.isBlankOrNull(maxTripStartDate)) {
			getParamMap().put(OfferParam.MAX_TRIP_START_DATE.param(), maxTripStartDate);
		}
		if (!Common.isBlankOrNull(minStarRating)) {
			getParamMap().put(OfferParam.MIN_STAR_RATING.param(), minStarRating);
		}
		if (!Common.isBlankOrNull(maxStarRating)) {
			getParamMap().put(OfferParam.MAX_STAR_RATING.param(), maxStarRating);
		}
		if (!Common.isBlankOrNull(minTotalRate)) {
			getParamMap().put(OfferParam.MIN_TOTAL_RATE.param(), minTotalRate);
		}
		if (!Common.isBlankOrNull(maxTotalRate)) {
			getParamMap().put(OfferParam.MAX_TOTAL_RATE.param(), maxTotalRate);
		}

		return getParamMap();
	}

	/**
	 * 
	 * Setters and Getters
	 */

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public Double getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(Double minStarRating) {
		this.minStarRating = minStarRating;
	}

	public Double getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(Double maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public Integer getMinTotalRate() {
		return minTotalRate;
	}

	public void setMinTotalRate(Integer minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	public Integer getMaxTotalRate() {
		return maxTotalRate;
	}

	public void setMaxTotalRate(Integer maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	public List<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	public Map<String, String> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<String, String> paramMap) {
		this.paramMap = paramMap;
	}

	public String getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

}