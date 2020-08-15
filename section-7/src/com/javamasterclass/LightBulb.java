package com.javamasterclass;

public class LightBulb {
	private String type;
	private boolean poweredOn;

	public LightBulb(String type) {
		this.type = type;
		this.poweredOn = false;
	}

	private void powerOn() {
		poweredOn = true;
		int randomNumber = (int)(Math.random() * 100);
		System.out.println("randomNumber = " + randomNumber);
		if(randomNumber <= 20) {
			System.out.println("The bulb has blown");
			poweredOn = false;
		}
	}

	private void powerOff() {
		poweredOn = false;
	}

	public void togglePower() {
		if(poweredOn) {
			powerOff();
		}
		else {
			powerOn();
		}
	}

	public String getType() {
		return type;
	}

	public boolean isPoweredOn() {
		return poweredOn;
	}
}
