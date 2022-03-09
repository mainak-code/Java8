package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample3 {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// Stream.filter()
		memberNames.stream().filter((s) -> s.startsWith("R")).forEach(System.out::println);

		// Stream.map()
		memberNames.stream().filter((s) -> s.startsWith("Y")).map(String::toUpperCase).forEach(System.out::println);

		// Stream.sorted()
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		// Stream.forEach()
		memberNames.forEach(System.out::println);

	}
}
