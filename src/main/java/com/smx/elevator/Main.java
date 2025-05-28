package com.smx.elevator;

import com.smx.elevator.bean.Elevator;

/**
 * @author Alex Vazquez <vazqueza2000@gmail.com>
 * 
 */
public class Main {

	//seed with the sample values
	private static int[] travelPlan = new int[] {2,9,1,32};
	private static int initialFloor = 12;
	
	
	public static void main(String[] args) {
		processTheArguments(args);
		
		//-------------------------------------------------
		//Start moving the elevator 
		Elevator elevator = new Elevator(initialFloor);
		for (int x = 0; x < travelPlan.length; x++) {
			elevator.moveElevatorToFloor(travelPlan[x]);
		}
		System.out.println(elevator.getStatus());
	}


	private static void processTheArguments(String[] args) {
		//override the seed values if there are arguments
		for (String arg : args) {
			//the expected input is of the following format:   start=12 floor=2,9,1,32
			if (arg.startsWith("start=")) {
				try {
					initialFloor = Integer.valueOf(arg.substring(arg.indexOf("=") + 1));
				} catch (NumberFormatException e ) {
					initialFloor = 1;
				}
			}
			if (arg.startsWith("floor=")) {
				String[] floors = arg.substring(arg.indexOf("=") + 1).split(",");
				try {
					travelPlan = new int[floors.length];
					for (int f = 0; f< floors.length; f++) {
						travelPlan[f] = Integer.valueOf(floors[f]);
					}
				} catch (NumberFormatException e ) {
					travelPlan = new int[0];
				}
			}
		}
		
	}


}
