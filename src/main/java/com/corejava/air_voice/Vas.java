package com.corejava.air_voice;

public class Vas implements Basemodel {
	protected String vass;

	protected boolean isActive;

	public Vas(String vas, boolean isActive) {
		super();
		this.vass = vas;
		this.isActive = isActive;
	}

	public String getVas() {
		return vass;
	}

	public void setVas(String vas) {
		this.vass = vas;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


}
