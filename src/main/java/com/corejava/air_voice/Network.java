package com.corejava.air_voice;

public class Network extends NetType {
	public String phoneNumber;

	public String avlCredits;

	public String is4g;
	
	public Integer billAmount;

	public Network(String vas, boolean isActive, String description, String phoneNumber, String avlCredits, String is4g,
			Integer billAmount) {
		super(vas, isActive, description);
		this.phoneNumber = phoneNumber;
		this.avlCredits = avlCredits;
		this.is4g = is4g;
		this.billAmount = billAmount;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAvlCredits() {
		return avlCredits;
	}

	public void setAvlCredits(String avlCredits) {
		this.avlCredits = avlCredits;
	}

	public String getIs4g() {
		return is4g;
	}

	public void setIs4g(String is4g) {
		this.is4g = is4g;
	}

	public Integer getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}

}
