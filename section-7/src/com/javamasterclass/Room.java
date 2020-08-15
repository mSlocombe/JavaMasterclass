package com.javamasterclass;

public class Room {
	private Door door;
	private LightFitting light;
	private Desk desk;

	public Room(Door door, LightFitting light, Desk desk) {
		this.door = door;
		this.light = light;
		this.desk = desk;
	}

	public Door getDoor() {
		return door;
	}

	public LightFitting getLight() {
		return light;
	}

	public Desk getDesk() {
		return desk;
	}
}
