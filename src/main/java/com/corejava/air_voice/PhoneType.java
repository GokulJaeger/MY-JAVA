package com.corejava.air_voice;

public class PhoneType extends Vas {
	 public String description;

	public PhoneType(String vas, boolean isActive, String description) {
		super(vas, isActive);
		this.description = description;
	}

}
