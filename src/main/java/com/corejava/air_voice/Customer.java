package com.corejava.air_voice;

public class Customer extends Network {
	public Integer customerId;

	public String customerName;

	public String baseCountry;

	public String address;


	
	public Customer(Integer customerId, String customerName, String baseCountry,String address,String phoneNumber, String avlCredits,
			String is4g, Integer billAmount,String description,String vas, boolean isActive) {
		super(vas, isActive, description, phoneNumber, avlCredits, is4g, billAmount);
		this.customerId = customerId;
		this.customerName = customerName;
		this.baseCountry = baseCountry;
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", baseCountry=" + baseCountry
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", avlCredits=" + avlCredits + ", is4g="
				+ is4g + ", billAmount=" + billAmount + ", description=" + description + ", vas=" + vas + ", isActive="
				+ isActive + "]";
	}



	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBaseCountry() {
		return baseCountry;
	}

	public void setBaseCountry(String baseCountry) {
		this.baseCountry = baseCountry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
