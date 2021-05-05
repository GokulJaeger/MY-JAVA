package com.corejava.air_voice;

public class Customer extends Phone {
	public int customerId;

	public String customerName;

	public String baseCountry;

	public String address;

	public Customer(int i, String customerName, String baseCountry, String address, String phoneNumber,
			String avlCredits, String is4g, int j, String description, String vas, boolean isActive) {
		super(vas, isActive, description, phoneNumber, avlCredits, is4g, j);
		this.customerId = i;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
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
