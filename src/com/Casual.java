package com;

public class Casual extends Typist {
	float daily_wages;

	public float getDaily_wages() {
		return daily_wages;
	}

	public Casual(String code, String name, int speed, float daily_wages) {
		super(code, name, speed);
		this.daily_wages = daily_wages;
	}

	public void setDaily_wages(float daily_wages) {
		this.daily_wages = daily_wages;
	}	
}
