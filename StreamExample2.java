package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

		// Collect Stream elements to a List
		List<Integer> list1 = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list1.add(i);
		}

		Stream<Integer> stream1 = list1.stream();
		List<Integer> evenNumbersList = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);

		// Collect Stream elements to an Array
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list2.add(i);
		}

		Stream<Integer> stream2 = list2.stream();
		Integer[] evenNumbersArr = stream2.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);

	}
}