package com.corejava.air_voice;

public class Vas implements Basemodel {
	protected String vas;

	protected boolean isActive;

	public Vas(String vas, boolean isActive) {
		super();
		this.vas = vas;
		this.isActive = isActive;
	}

	public String getVas() {
		return vas;
	}

	public void setVas(String vas) {
		this.vas = vas;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


}
