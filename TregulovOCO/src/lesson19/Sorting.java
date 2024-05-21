package lesson19;

import java.util.Arrays;

public class Sorting {

	public static int[] sortArray(int[] array) {

		
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			int min = array[i];
			for (int j = i; j < array.length; j++) {

				if (array[j] < min) {

					min = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = min;
		}
		System.out.println(Arrays.toString(array));
		return array;
	}

	public static void main(String[] args) {

		int[] array1 = { -8, 3, 4, 8, 2, 14, 22, 5, -6, 2, 11, 17 };

		sortArray(array1);
	}
}
