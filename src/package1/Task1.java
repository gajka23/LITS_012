package package1;

import java.util.ArrayList;

public class Task1 {

	// Написати програму для роботи з списком. 
	//У першій половині списку замінити всі входження 
	//деякого елементу Е1 на  будь-який інший елемент Е2
	
	public static void main(String[] args) {
		
		ArrayList<String> spysok = new ArrayList<String>();
		
		spysok.add("A");
		spysok.add("B");
		spysok.add("C");
		spysok.add("B");
		spysok.add("E");
		spysok.add("F");
		spysok.add("G");
		spysok.add("B");
		spysok.add("I");
		spysok.add("J");
		spysok.add("K");
		
		System.out.println(spysok);
		
		int rozmir = spysok.size();
		System.out.println("spysok vs'ogo mistyt' "  + rozmir + " elementiv");
		
		int novyyRozmir;
		if (rozmir%2 == 0){
			novyyRozmir = rozmir / 2;
		} else {
			novyyRozmir = (rozmir + 1)/ 2;
		}
		System.out.println("novyyRozmir " + novyyRozmir);		 
		
		int index = 0;
		while (index<novyyRozmir) {
			if (spysok.get(index)=="B") {
				spysok.set(index, "'z'");
				
			}
			
			index++;
			
		}	
		System.out.println(spysok);
		
	
		
		
		
		//int [] dates = {1,20,18,51,45,23,85,17,35};
		//System.out.println(dates);
		// вивело на консоль "[I@e3b895" - що це означає?

		
		
	}

}
