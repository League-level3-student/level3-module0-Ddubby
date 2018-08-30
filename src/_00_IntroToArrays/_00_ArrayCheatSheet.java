package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = new String[5];
		names[0] = "a";
		names[1] = "b";
		names[2] = "c";
		names[3] = "d";
		names[4] = "e";
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "3";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < names.length; i++) {
			names[i]="all";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//7. make an array of 50 integers
		int[] ints = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random random = new Random(1000);
		for (int i = 0; i < ints.length; i++) {
			int number=random.nextInt(1000);
			ints [i] = number;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int low = Integer.MAX_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints [i] < low) {
				low = ints[i];
			}
		}
		System.out.println(low);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		//11. print the largest number in the array.
		int high = Integer.MIN_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > high) {
				high = ints[i];
			}
		}
		System.out.println(high);
		//12. print only the last element in the array
		System.out.println(ints [ints.length-1]);
	}
}
