package com.bbps.service;

import com.bbps.model.Biller;

public interface BillerService {

	/**
	 * get the data of biller by agentId
	 * 
	 * @param agentId {@link String}
	 * @return {@link Biller}
	 */
	Biller getBiller(String agentId);
}
