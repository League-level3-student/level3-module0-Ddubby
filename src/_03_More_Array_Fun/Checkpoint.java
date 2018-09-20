package _03_More_Array_Fun;

import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
	int sum = 0;
	String arraySize = JOptionPane.showInputDialog("Please enter a number for the size of the array");
	int size = Integer.parseInt(arraySize);
	int[] ints = new int[size];
	for (int i = 0; i < ints.length; i++) {
		String answer = JOptionPane.showInputDialog("Please enter a number");
		int number = Integer.parseInt(answer);
		ints[i] = number;
	}
	for (int i = 0; i < ints.length; i++) {
		int current = ints[i];
		sum = current + sum;
	}
	JOptionPane.showMessageDialog(null, sum);
	JOptionPane.showMessageDialog(null, "The average is: " + sum/ints.length);
}
}
