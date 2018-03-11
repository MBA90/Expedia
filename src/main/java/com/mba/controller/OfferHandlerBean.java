package com.mba.controller;

import java.util.Iterator;
import java.util.Map;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.mba.entity.Book;
import com.mba.entity.OfferParam;
import com.mba.util.Common;

/**
 * Offer handler bean class implement offer handler
 * 
 * The purpose for this class is to handle the requests related to the get offers service  
 * @author m.bassam
 *
 */
public class OfferHandlerBean implements OfferHandler {

	
	
	/**
	 *  Instance variables
	 */
	
	/** base uri of getOffers service */
	public static final String BASE_URI = "https://offersvc.expedia.com/offers/v2/";
	
	/** client */
	private Client client = null;
	
	/** Web Target */
	private WebTarget target = null;
	

	/**
	 * Get target client method To get the target client of the specified base uri
	 * 
	 * @return WebTarget
	 */
	public WebTarget getTargetClient() {
		client = ClientBuilder.newClient();
		target = client.target(BASE_URI);
		
		return target;
	}

	/**
	 * Get offers method
	 * 
	 * It will retrieve all the available offers, based on the parameters thats
	 * inside the Map collection
	 * 
	 * @param paramMap
	 * @return Object of type book which have all the details of the offer.
	 * @throws Exception
	 */
	public Book getOffers(Map<String, String> paramMap) throws Exception {
		
		/**
		 * local variable 
		 */
		
		/**Instance gson object */
		Gson gson = new Gson();
		
		/** Instance book object*/
		Book book = null;
		
		String result = "";
		Response response = null;

		// GET Request from Jersey Client
		WebTarget target = getTargetClient();

		try {
			
			/** Check if the map is null and not empty */
			if (paramMap != null && !paramMap.isEmpty() && paramMap.size() > 0) {
				
				/** iterate over the map and add both key and value pass them to web target ressource as queryParam  */
				Iterator it = paramMap.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					target = target.queryParam(pair.getKey().toString(), pair.getValue());

				}
			}
			
			/** add path to web target */
			target = target.path(OfferParam.METHOD.param());
			
			/** return the response as Json media type */
			response = target.request(MediaType.APPLICATION_JSON).get();
			
			/** check if the response is success or not */
			if (response.getStatus() == 200) {
				result = response.readEntity(String.class);

				if (!Common.isBlankOrNull(result)) {
					
					/** Convert json to Book object using Gson api */
					book = gson.fromJson(result, Book.class);
				}
			} else {
				throw new Exception("Faild Response");
			}

			return book;

		} catch (Exception ex) {
			throw new Exception(ex.toString());
		} finally {
			/** close response  */
			if (response != null) {
				response.close();
			}
		}
	}
} 
