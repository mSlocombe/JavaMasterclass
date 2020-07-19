package com.javamasterclass;

public class Main {

    public static void main(String[] args) {
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
    	if(minutes > 0 && seconds >= 0 && seconds <= 59) {
			int hours = minutes / 60;
			minutes %= 60;
			return String.format("%02d", hours) + "h " + String.format("%02d", minutes) + "m " + String.format("%02d", seconds) + "s";
		}
    	else {
			return "Invalid Value";
		}
	}

	public static String getDurationString(int seconds) {
    	if(seconds >= 0) {
    		int minutes = seconds / 60;
    		seconds %= 60;
    		return getDurationString(minutes, seconds);
		}
    	else {
    		return "Invalid Value";
		}
	}
}
