package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[10];
		strings[0] = "A";
		strings[1] = "B";
		strings[2] = "C";
		strings[3] = "D";
		strings[4] = "E";
		strings[5] = "F";
		strings[6] = "G";
		strings[7] = "H";
		strings[8] = "I";
		strings[9] = "J";
		/*
		 * StringPrint(strings); ReverseStringPrint(strings); OddStringPrint(strings);
		 */
		RandomStringPrint(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void StringPrint(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void ReverseStringPrint(String[] strings) {
		for (int i = strings.length - 1; i > -1; i--) {
			System.out.println(strings[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void OddStringPrint(String[] strings) {
		for (int i = 0; i < strings.length; i += 2) {
			System.out.println(strings[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static void RandomStringPrint(String[] strings) {
		Random random = new Random();
		int[] indexes = new int[strings.length];
		boolean done = false;
		int printed = 0;
		while (printed < strings.length) {
			int order = random.nextInt(10);
			done = false;
			for (int i = 0; i < indexes.length; i++) {
				if (order == indexes[i]) {
					done = true;
					break;
				}
			}
			if (!done) {
				//System.out.println(strings[order]);
				indexes[printed] = order;
				printed = printed + 1;
			}
		}
	}
}
