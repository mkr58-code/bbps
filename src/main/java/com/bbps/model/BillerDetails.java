package com.bbps.model;

public class BillerDetails {
	private String blrName;
	private int adhocPayment;
	private String billerDescription;
	private String blrId;
	private String billerValue;
	private String supportBillValidation;
	private String blrCatName;
	private int blrCatId;
	private int billAcceptanceType;
	private String paymentAmtExactness;

	public String getBlrName() {
		return blrName;
	}

	public int getAdhocPayment() {
		return adhocPayment;
	}

	public String getBillerDescription() {
		return billerDescription;
	}

	public String getBlrId() {
		return blrId;
	}

	public String getBillerValue() {
		return billerValue;
	}

	public String getSupportBillValidation() {
		return supportBillValidation;
	}

	public String getBlrCatName() {
		return blrCatName;
	}

	public int getBlrCatId() {
		return blrCatId;
	}

	public int getBillAcceptanceType() {
		return billAcceptanceType;
	}

	public String getPaymentAmtExactness() {
		return paymentAmtExactness;
	}

	private BillerDetails(BillerDetailsBuilder builder) {

		this.blrName = builder.blrName;
		this.adhocPayment = builder.adhocPayment;
		this.billerDescription = builder.billerDescription;
		this.blrId = builder.blrId;
		this.billerValue = builder.billerValue;
		this.supportBillValidation = builder.supportBillValidation;
		this.blrCatName = builder.blrCatName;
		this.blrCatId = builder.blrCatId;
		this.billAcceptanceType = builder.billAcceptanceType;
		this.paymentAmtExactness = builder.paymentAmtExactness;

	}

	// Builder Class
	public static class BillerDetailsBuilder {
		private String blrName;
		private int adhocPayment;
		private String billerDescription;
		private String blrId;
		private String billerValue;
		private String supportBillValidation;
		private String blrCatName;
		private int blrCatId;
		private int billAcceptanceType;
		private String paymentAmtExactness;

		public BillerDetailsBuilder setBlrName(String blrName) {
			this.blrName = blrName;
			return this;
		}

		public BillerDetailsBuilder setAdhocPayment(int adhocPayment) {
			this.adhocPayment = adhocPayment;
			return this;
		}

		public BillerDetailsBuilder setBillerDescription(String billerDescription) {
			this.billerDescription = billerDescription;
			return this;
		}

		public BillerDetailsBuilder setBlrId(String blrId) {
			this.blrId = blrId;
			return this;
		}

		public BillerDetailsBuilder setBillerValue(String billerValue) {
			this.billerValue = billerValue;
			return this;
		}

		public BillerDetailsBuilder setSupportBillValidation(String supportBillValidation) {
			this.supportBillValidation = supportBillValidation;
			return this;
		}

		public BillerDetailsBuilder setBlrCatName(String blrCatName) {
			this.blrCatName = blrCatName;
			return this;
		}

		public BillerDetailsBuilder setBlrCatId(int blrCatId) {
			this.blrCatId = blrCatId;
			return this;
		}

		public BillerDetailsBuilder setBillAcceptanceType(int billAcceptanceType) {
			this.billAcceptanceType = billAcceptanceType;
			return this;
		}

		public BillerDetailsBuilder setPaymentAmtExactness(String paymentAmtExactness) {
			this.paymentAmtExactness = paymentAmtExactness;
			return this;
		}

		public BillerDetails build() {
			return new BillerDetails(this);
		}
	}

}
