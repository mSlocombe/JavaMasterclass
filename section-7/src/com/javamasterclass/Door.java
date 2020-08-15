package com.javamasterclass;

public class Door {
	private int width;
	private int height;
	private int depth;
	private boolean open;

	public Door(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.open = false;
	}

	public void openDoor() {
		if(open) {
			System.out.println("Door is already open");
		}
		else {
			open = true;
			System.out.println("Door is now open");
		}
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

	public boolean isOpen() {
		return open;
	}
}
