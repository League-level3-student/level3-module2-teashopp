package _03_More_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
 * Write your methods in this class
 */
public class Algorithms {

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

		List<Double> newresults = new ArrayList<Double>();

		for (int i = 0; i < results.size(); i++) {

			newresults.add(results.get(i));

		}

		boolean isordered = false;

		while (isordered == false) {

			isordered = true;

			for (int j = newresults.size() - 1; j > 0; j--) {

				if (newresults.get(j) < newresults.get(j - 1)) {

					Double small = newresults.get(j - 1);
					isordered = false;
					newresults.remove(j - 1);
					newresults.add(small);

				}

			}

		}

		return newresults;

	}

	public static Object sortDNA(List<String> unsortedSequences) {

		List<String> newsequence = new ArrayList<String>();

		for (int i = 0; i < unsortedSequences.size(); i++) {

			newsequence.add(unsortedSequences.get(i));

		}

		boolean isordered = false;

		while (isordered == false) {

			isordered = true;

			for (int j = newsequence.size() - 1; j > 0; j--) {

				if (newsequence.get(j).length() < newsequence.get(j - 1).length()) {

					String small = newsequence.get(j - 1);
					isordered = false;
					newsequence.remove(j - 1);
					newsequence.add(small);

				}

			}

		}

		return newsequence;

	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub

		List<String> newwords = new ArrayList<String>();

		for (int i = 0; i < words.size(); i++) {

			newwords.add(words.get(i));

		}

		boolean isordered = false;

		while (isordered == false) {

			isordered = true;

			for (int j = newwords.size() - 1; j > 0; j--) {

				if (newwords.get(j).compareTo(newwords.get(j - 1)) > 0) {

					String first = newwords.get(j);
					isordered = false;
					newwords.remove(j);
					newwords.add(first);

				}

			}

		}

		return newwords;

	}

	public static String multiply(int val1, int val2) {

		int val3 = val1 * val2;

		String answer = val1 + " x " + val2 + " = " + val3;

		return answer;

	}

	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		
		boolean ft = false;
		
		for (int j = i / 2; j > 0; j--) {
			
			if((j % i) == 0) {
				
				ft = true;
				
			}
			
		}
		
		return ft;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
