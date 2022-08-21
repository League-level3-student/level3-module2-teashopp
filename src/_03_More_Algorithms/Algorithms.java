package _03_More_Algorithms;

import java.io.ObjectInputStream.GetField;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return null;
	}

	// test 1
	public static int findBrokenEgg(List<String> eggs) {

		for (int j = 0; j < eggs.size(); j++) {

			if (eggs.get(j).equals("cracked")) {
				return j;
			}

		}

		return 0;
	}

	// test 2
	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub

		for (int i = 0; i < oysters.size(); i++) {

			if (oysters.get(i).equals(true)) {
				return i;
			}

		}

		return 0;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub

		Double tall = peeps.get(0);
		

			for (int j = 0; j < peeps.size(); j++) {

				if (peeps.get(j) > tall) {
					
					tall = peeps.get(j);
					
				}				
			}

		return tall;
	}

}
