package listIterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterateExample1 {

	public static void main(String[] args) {

		List<String> countries = Arrays.asList("Germany", "Panama", "Australia");

		countries.stream().forEach((c) -> System.out.println(c));
		System.out.println("*************");
		// Creating an ArrayList
		List<String> myList = new ArrayList<String>();

		// Adding elements to the List
		// Custom inputs
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");

		// Lambda expression printing all elements in a List
		myList.forEach((temp) -> {
			System.out.println(temp);
		});
		System.out.println("*************");
		myList.forEach(System.out::println);
		
	}

}
