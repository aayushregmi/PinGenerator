package com.aayush.pingenerator;
//import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PinGeneratorTest {

	private PinGenerator pinGenerator;

	@BeforeEach
	public void setUp() throws Exception {
		pinGenerator = new PinGenerator();
	}

	@Test
	@DisplayName("It should create a pin generator object")
	public void testObjectCreation() {
		assertNotNull(pinGenerator);
	}

	@Test
	@DisplayName("It should generate pins")
	public void testPinGeneration() {
		assertEquals(pinGenerator.getAllPins().size(), 9000);
	}

	@Test
	@DisplayName("It should return 1000 pins")
	public void testNextPinFunction() {
		List<Integer> pins = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			pins.add(pinGenerator.nextPin());
		}
		assertEquals(pins.size(), 1000);
	}

	@Test
	@DisplayName("It should generate distinct 1000 pins")
	public void testDistinctPins() {
		List<Integer> pins = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			pins.add(pinGenerator.nextPin());
		}
		List<Integer> distinctPins = pins.stream().distinct().collect(Collectors.toList());
		assertEquals(pins.size(), distinctPins.size());
	}

	@Test
	@DisplayName("It should not generate specified number of pins for -1")
	public void testGenerateSpecifiedPinsForNull() {
		List<Integer> requiredPins = pinGenerator.getNumberOfPins(-1);
		assertEquals(requiredPins, null);
	}

	@Test
	@DisplayName("It should generate specified number of pins")
	public void testGenerateSpecifiedPins() {
		List<Integer> requiredPins = pinGenerator.getNumberOfPins(100);
		assertEquals(requiredPins.size(), 100);
	}

}
