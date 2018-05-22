package com.ds.array;

import static org.junit.Assert.fail;

import org.junit.Test;

public class OneBitCharacterTest {

	@Test
	public void notTrueList() {
		OneBitCharacter oneBitCharacter = new OneBitCharacter();
		int[] bits = { 1, 1, 1, 0, 0, 1, 0 };
		if (oneBitCharacter.isOneBitCharacter(bits)) {
			System.out.println("Expcted true found false");
			fail("Expcted true found false");
		}
	}

	@Test
	public void trueList() {
		OneBitCharacter oneBitCharacter = new OneBitCharacter();
		int[] bits = { 1, 1, 1, 0, 0, 1, 0, 0 };
		if (!oneBitCharacter.isOneBitCharacter(bits)) {
			System.out.println("Expcted true found false");
			fail("Expcted true found false");
		}
	}

}
