package com.mba.controller;

import java.util.Map;

import javax.ws.rs.client.WebTarget;

import com.mba.entity.Book;

/**
 * Offer Handler Interface.
 * 
 * 
 * @author m.bassam
 *
 */
public interface OfferHandler {

	/**
	 * Get target client method To get the target client of the specified base uri
	 * 
	 * @return WebTarget
	 */
	public WebTarget getTargetClient();

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
	public Book getOffers(Map<String, String> paramMap) throws Exception;

}
