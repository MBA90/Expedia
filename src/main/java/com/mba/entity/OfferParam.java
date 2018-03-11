<<<<<<< HEAD
package com.mba.entity;

/**
 * Enum having the possible param required for getOffers to pass them in url.
 * @author m.bassam
 *
 */
public enum OfferParam {
	
	METHOD("getOffers"), 
	SCENARIO("scenario"), 
	PAGE("page"), 
	UID("uid"), 
	PRODUCT_TYPE("productType"),
	DESTINACTION_NAME("destinationName"),  
	MIN_TRIP_START_DATE("minTripStartDate"),
	MAX_TRIP_START_DATE("maxTripStartDate"),
	MIN_STAR_RATING("minStarRating"),
	MAX_STAR_RATING("maxStarRating"),
	MIN_TOTAL_RATE("minTotalRate"),
	MAX_TOTAL_RATE("maxTotalRate");
	
	/**
	 * Instance variable  
	 */
	
	private String param;

	OfferParam(String param) {
		this.param = param; 
	}

	public String param() {
		return param;
	}
}
=======
package com.mba.entity;

/**
 * Enum having the possible param required for getOffers to pass them in url.
 * @author m.bassam
 *
 */
public enum OfferParam {
	
	METHOD("getOffers"), 
	SCENARIO("scenario"), 
	PAGE("page"), 
	UID("uid"), 
	PRODUCT_TYPE("productType"),
	DESTINACTION_NAME("destinationName"),  
	MIN_TRIP_START_DATE("minTripStartDate"),
	MAX_TRIP_START_DATE("maxTripStartDate"),
	MIN_STAR_RATING("minStarRating"),
	MAX_STAR_RATING("maxStarRating"),
	MIN_TOTAL_RATE("minTotalRate"),
	MAX_TOTAL_RATE("maxTotalRate");
	
	/**
	 * Instance variable  
	 */
	
	private String param;

	OfferParam(String param) {
		this.param = param; 
	}

	public String param() {
		return param;
	}
}
>>>>>>> a8c9a4e16b20a6c0eb2bb5200f21f3f535dafbce
