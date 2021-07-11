package com.aayush.pingenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PinGenerator {
	private List<Integer> allPins = new ArrayList<>();
	private int pinIndex = 0;

	PinGenerator() {
		for (int i = 1000; i < 10000; i++) {
			allPins.add(i);
		}
		Collections.shuffle(allPins);
	}

	public List<Integer> getAllPins() {
		return allPins;
	}

	public int nextPin() {
		return allPins.get(pinIndex++);
	}

	public List<Integer> getNumberOfPins(int requiredNumberOfPins) {
		if (requiredNumberOfPins > 0) {
			List<Integer> requiredPins = new ArrayList<>();
			for (int i = 0; i < requiredNumberOfPins; i++) {
				requiredPins.add(nextPin());
			}
			return requiredPins;
		}
		return null;
	}

}
