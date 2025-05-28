package com.smx.elevator.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Vazquez <vazqueza2000@gmail.com>
 */
public class Elevator {
	//Single floor travel time
	public static final int TRAVEL_SPEED = 10;
	
	public int currentFloor;
	public int travelTime = 0;

	public List<Integer> floorsVisited = new ArrayList<>();

	public Elevator(int initialFloor) {
		this.currentFloor = initialFloor;
		floorsVisited.add(initialFloor);
	}

	/**
	 * @return the travelTime
	 */
	public int getTravelTime() {
		return travelTime;
	}

	/**
	 * @return the floorsVisited as a string in the expected format
	 */
	public String getFloorsVisitedAsString() {
		return floorsVisited.toString().replace("[", "").replace("]", "").replace(" ", "");
	}


	//This makes it not be a simple pojo but here to keep it simple.  MVC 
	public void moveElevatorToFloor(int goToFloor) {
		//if they are the same then it is zero
		travelTime += Math.abs(currentFloor - goToFloor) * TRAVEL_SPEED ;
		if (currentFloor != goToFloor) {
			//but don't add the floor again
			floorsVisited.add(goToFloor);
		}
		currentFloor = goToFloor;
	}

}
