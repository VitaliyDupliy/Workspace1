package lesson20;

public class test {

	public static String[] abc(String[]... strings) {

		int lengthNewArray = 0;

		for (String[] array : strings) {
			lengthNewArray += array.length;
		}
		String[] newArray = new String[lengthNewArray];
		int i = 0;
		for (String[] array : strings) {
			for (String element : array) {
				newArray[i++] = element;

			}
		}

		return newArray;
	}

	public static void main(String[] args) {

		String[] a1 = { "a", "b", "c", "d" };
		String[] a2 = { "e", "f", "g" };
		String[] a3 = { "j", "l" };

		String[] array = abc(a1, a2, a3);

		for (String s : args) {
			for (int i = 0; i < array.length; i++) {
				if (s.equals(array[i])) {
					array[i] = null;

				}
			}

		}

		for (String str : array) {
			System.out.print(str + " ");

		}

	}
}
