package package3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		/* Ќайменший елемент масиву зам≥нити ц≥лою частиною 
		 * середнього арифметичного вс≥х елемент≥в.
		 *  якщо в масив≥ Ї дек≥лька найменших елемент≥в, то зам≥нити останн≥й з них.
		 */

		List<Integer> IntNumbers = new ArrayList<Integer>();

		IntNumbers.add(15);
		IntNumbers.add(78);
		IntNumbers.add(2);
		IntNumbers.add(15);
		IntNumbers.add(15);
		IntNumbers.add(2);
		IntNumbers.add(2);
		IntNumbers.add(49);
		IntNumbers.add(11);

		System.out.println(sumOfNumbers(IntNumbers));
	}

	
}
