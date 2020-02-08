package com;

public class Regular extends Typist{
	float monthly_wages;
	
	public Regular(String code, String name, int speed, float monthly_wages) {
		super(code, name, speed);
		this.monthly_wages = monthly_wages;
	}

	public float getMonthly_wages() {
		return monthly_wages;
	}

	public void setMonthly_wages(float monthly_wages) {
		this.monthly_wages = monthly_wages;
	}
	
}
