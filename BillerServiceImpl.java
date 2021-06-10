package com.bbps.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bbps.constants.BillerConstants;
import com.bbps.model.Biller;
import com.bbps.model.BillerDetails;

@Service
public class BillerServiceImpl implements BillerService {
	private final Logger logger = LoggerFactory.getLogger(BillerServiceImpl.class);

	@Override
	public Biller getBiller(String agentId) {
		/*
		 * TODO : Use the agentId to get the Biller Data form the DB I don't have the DB
		 * details thats why I am using the static data
		 */

		logger.debug("agentId :{}", agentId);

		return loadData();
	}

	/**
	 * load the static data of Biller
	 * 
	 * @return
	 */
	private Biller loadData() {
		return Biller.of(BillerConstants.SUCCESS_STATUS,BillerConstants.SUCCESS_MESSAGE,getBillerList());
	}

	private List<BillerDetails> getBillerList() {
		List<BillerDetails> list = new ArrayList<>();
		list.add(getBillerDetails("ACT Fibernet", "ACT000000NAT01"));
		list.add(getBillerDetails("Airtel Broadband", "ATBROAD00NAT02"));
		return list;
	}

	/**
	 * get the BillerDetails
	 * 
	 * @param blrName {@link String}
	 * @param blrId   {@link String}
	 * @return {@link BillerDetails}
	 */
	private BillerDetails getBillerDetails(String blrName, String blrId) {
		return new BillerDetails.BillerDetailsBuilder().setBlrName(blrName).setAdhocPayment(0)
				.setBillerDescription(blrName).setBlrId(blrId).setBillerValue(blrId)
				.setSupportBillValidation("NOT_SUPPORTED").setBlrCatName("Broadband Postpaid").setBlrCatId(1)
				.setBillAcceptanceType(0).setPaymentAmtExactness("Exact").build();

	}

}
