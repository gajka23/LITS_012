package package3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		/* ��������� ������� ������ ������� ����� �������� 
		 * ���������� ������������� ��� ��������.
		 *  ���� � ����� � ������� ��������� ��������, �� ������� ������� � ���.
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
