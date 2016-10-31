package org.mnr.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstNonRepeatingCharInStringTest {

	private static String input = "";
	private static List<String> inputSet = new ArrayList<String>();

	@BeforeClass
	public static void initiate() {

		System.out.println("Please enter \"E\" after input is done ");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			input = sc.next();

			if ("e".equalsIgnoreCase(input))
				break;
			inputSet.add(input);

		}
		sc.close();
	}

	@Before
	public void takInput() {

	}

	@Test
	public final void testFirstNonRepeatingCharInString() {

		for (String input : inputSet) {
			
			FirstNonRepeatingCharInString.getFirstNonRepeatingCharInString(input,0);
			System.out.println();
		}

	}

}
