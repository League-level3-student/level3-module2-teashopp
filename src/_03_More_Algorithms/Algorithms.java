package _03_More_Algorithms;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
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

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub

		String L = words.get(0);

		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).length() > L.length()) {

				L = words.get(i);

			}

		}

		return L;

	}

	public static boolean containsSOS(List<String> message1) {
		// TODO Auto-generated method stub

		for (int i = 0; i < message1.size(); i++) {

			if (message1.get(i).contentEquals("... --- ...")) {

				return true;

			}

		}

		return false;

	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		
		// create new list
		List<Double> newlist = new ArrayList<Double>();
		
		for (int i = 0; i < results.size(); i++) {
			
			// create saved smallest
			Double small = results.get(i);
			
			for (int j = 0; j < results.size(); j++) {

				if (results.get(j) < results.get(i)) {
					
					// set smallest as smaller value
					small = results.get(j);

				}
				
			}

			// remove small from results
			results.remove(small);
			
			// add small to newlist
			newlist.add(small);
			
		}

		// return newlist
		return newlist;
		
	}

}
