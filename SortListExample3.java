package listSort;

import java.util.*;

public class SortListExample3 {
	public static void main(String[] args) {

		List<String> country = Arrays.asList("Russia", "India", "China", "Japan", "", "Ghana");

		List<String> country1 = Arrays.asList("Russia", "india", "China", "Japan", "", "ghana");

		System.out.println(country); // prints the same list as we define

		country.sort(String.CASE_INSENSITIVE_ORDER); // sorts the list in case insensitive order

		System.out.println(country);

		country.sort(Comparator.naturalOrder()); // sorts list in ascending order

		System.out.println(country);

		System.out.println(country1);

		// sorts list in ascending order (null, capital letter and small letter)
		country1.sort(Comparator.naturalOrder());

		System.out.println(country1);
	}
}