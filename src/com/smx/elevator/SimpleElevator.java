package com.smx.elevator;

import java.util.Arrays;

/**
 * @author Alex Vazquez <vazqueza2000@gmail.com>
 * 
 */
public class SimpleElevator {

	//Single floor travel time
	public static final int TRAVEL_SPEED = 10;
	
	public static int currentFloor = 12;
	public static int travelTime = 0;
	
	public static void main(String[] args) {
		int[] travelPlan = new int[] {2,9,1,32};
		
		for (int x = 0; x < travelPlan.length; x++) {
			moveElevatorToFloor(travelPlan[x]);
		}
		System.out.println(travelTime + " " + Arrays.toString(travelPlan).replace("[", "").replace("]", "").replace(" ", ""));
	}

	private static void moveElevatorToFloor(int goToFloor) {
		travelTime += Math.abs(currentFloor - goToFloor) * TRAVEL_SPEED ;
		currentFloor = goToFloor;
	}

}
