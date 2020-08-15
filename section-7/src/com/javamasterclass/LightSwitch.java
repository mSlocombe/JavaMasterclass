package com.javamasterclass;

public class LightSwitch {
	private int width;
	private int height;
	private int depth;
	private boolean powerOn;

	public LightSwitch(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.powerOn = false;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getDepth() {
		return depth;
	}

	public boolean isPowerOn() {
		return powerOn;
	}
}
