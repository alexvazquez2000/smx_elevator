package com.smx.elevator.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test the Elevator bean
 * 
 * @author Alex Vazquez <vazqueza2000@gmail.com>
 */
class ElevatorTest {

	@Test
	void test() {
		Elevator elevator = new Elevator(0);
		assertEquals("0 0", elevator.getStatus());
		elevator.moveElevatorToFloor(0);
		// it should not change with the same floor
		assertEquals("0 0", elevator.getStatus());
		// move to a new floor
		elevator.moveElevatorToFloor(10);
		assertEquals("100 0,10", elevator.getStatus());
	}

}
