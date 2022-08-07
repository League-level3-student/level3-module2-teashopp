package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return null;
	}

	public static int findBrokenEgg(List<String> eggs) {
		return 0;
	}

	// test 1
	public static int findBrokenEgg(String[] eggs, String broken) {

		for (int j = 0; j < eggs.length; j++) {

			if (eggs[j].equals(broken)) {
				return j;
			}
			
		}
		
		return 0;
		
	}
	
}
