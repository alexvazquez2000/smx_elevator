package com.smx.elevator;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MainTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	@Test
	void testMainExample() {
		//This is the sample
		Main.main(new String[]{ "floor=2,9,1,32", "start=12"});
		assertEquals("560 12,2,9,1,32", outputStreamCaptor.toString().trim());
	}

	@Test
	void testMainNullArgs() {
		//This is the sample
		Main.main(null);
		assertEquals("560 12,2,9,1,32", outputStreamCaptor.toString().trim());
	}

	@Test
	void testMainBadStartFloor() {
		//This is the sample
		Main.main(new String[]{ "floor=2,9,1,32", "start=A"});
		assertEquals("470 1,2,9,1,32", outputStreamCaptor.toString().trim());
	}

	@Test
	void testMainBadTravelPlan() {
		Main.main(new String[]{ "floor=2,NotAFloor,1,32", "start=12"});
		//the travel plan is empty, so no travel time
		assertEquals("0 12", outputStreamCaptor.toString().trim());
	}

	@Test
	void testMainDuplicateFloor() {
		Main.main(new String[]{ "floor=12,2,9,1,32", "start=12"});
		assertEquals("560 12,2,9,1,32", outputStreamCaptor.toString().trim());
	}

}
