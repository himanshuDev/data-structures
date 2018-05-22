package com.ds.array;

public class OneBitCharacter {
	public boolean isOneBitCharacter(int[] bits) {
		if (bits == null || bits.length == 0) {
			return false;
		}
		for (int i = 0; i < bits.length; i++) {
			if (bits[i] == 1) {
				i++;
				if (i == bits.length - 1) {
					return false;
				}
			} else {
				if (i == bits.length - 1) {
					return true;
				}
			}
		}
		return false;
	}
}
