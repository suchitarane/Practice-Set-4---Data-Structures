package com.practiseset4;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatePairs {
	public static void main(String args[]) throws Exception {

		String filePath = "C://Users//abc//Documents//sample.txt";
		String input = null;

		Scanner sc = new Scanner(new File(filePath));

		FileWriter writer = new FileWriter("C://Users//abc//Documents//output.txt");

		Set<String> set = new LinkedHashSet<>();// used to remove duplicates A,B ->if input again A,B remove and
												// preserve Input order

		while (sc.hasNextLine()) {
			input = sc.nextLine();

			if (set.contains(reverseInput(input))) {//B,A check -> no operation
				break;
			} 
			else {
				if (set.add(input)) {
					writer.append(input + "\n");
				}

			}

		}
		writer.flush();
		System.out.println("Contents added");
	}

	static String reverseInput(String str) {

		String[] temp = str.split(",");
		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = "," + temp[i] + result;
		}
		return result;
	}
}