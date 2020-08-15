package com.javamasterclass;

public class LightFitting {
	private LightSwitch lightSwitch;
	private LightBulb lightBulb;
	private boolean isPoweredOn;

	public LightFitting(LightSwitch lightSwitch, LightBulb lightBulb) {
		this.lightSwitch = lightSwitch;
		this.lightBulb = lightBulb;
		this.isPoweredOn = false;
	}

	public LightSwitch getLightSwitch() {
		return lightSwitch;
	}

	public LightBulb getLightBulb() {
		return lightBulb;
	}

	public void pressSwitch() {
		lightBulb.togglePower();
	}
}
