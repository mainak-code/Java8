package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {

	public static void main(String[] args) {

		String[][] dataArray = new String[][] { { "a", "b" }, { "a", "c", "d" }, { "e", "f", "t" }, { "g", "h" } };

		List<String> listOfAllChars = Arrays.stream(dataArray).flatMap(x -> Arrays.stream(x))
				.collect(Collectors.toList());

		System.out.println(listOfAllChars);
	}

}
