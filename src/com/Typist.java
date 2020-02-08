package com;

public class Typist extends Staff{
	int speed;
	
	public Typist(String code, String name, int speed) {
		super(code, name);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
