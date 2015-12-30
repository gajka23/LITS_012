package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		// Задано масив цілих чисел.
		// Вивести масив в оберненому порядку, а потім видалити
		// з нього повторні входження кожного елемента

		List<Integer> IntNumbers = new ArrayList<Integer>();

		IntNumbers.add(15);
		IntNumbers.add(78);
		IntNumbers.add(185);
		IntNumbers.add(15);
		IntNumbers.add(15);
		IntNumbers.add(2);
		IntNumbers.add(32);
		IntNumbers.add(49);

		/*
		 * public static int[] reverse(int[] list) { int[] result = new
		 * int[list.length];
		 * 
		 * for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		 * result[j] = list[i]; } return result; }
		 */

		System.out.println("Array before reverse: " + IntNumbers + ";");

		/*
		 * List<Integer> ReverseNumbers = new ArrayList<Integer>();
		 * 
		 * for (int i = IntNumbers.size()-1; i >= 0 ; i--) {
		 * ReverseNumbers.add(IntNumbers.get(i)); }
		 * //System.out.print(IntNumbers.get(i) + " ");
		 */

		/*
		 * List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
		 * System.out.println(list); Collections.reverse(list);
		 * System.out.println(list);
		 */

		Collections.reverse(IntNumbers);
		System.out.println("Array after reverse: " + IntNumbers + ";");

		Set<Integer> mySet = new HashSet<Integer>(IntNumbers);
		System.out.println("Array without dublicates: " + mySet + ".");
	}
}
