package com.bbps.model;

import java.util.List;

public class Biller {

	private String status;
	private String message;
	private List<BillerDetails> billers;

	public List<BillerDetails> getBillers() {
		return billers;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public static Biller of(String status, String message, List<BillerDetails> billers) {
		return new Biller(status, message, billers);

	}

	private Biller(String status, String message, List<BillerDetails> billers) {
		this.status = status;
		this.message = message;
		this.billers = billers;
	}

}
