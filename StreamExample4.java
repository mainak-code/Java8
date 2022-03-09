package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample4 {

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

		// Stream.collect()
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(memNamesInUppercase);

		// Stream.anyMatch()
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult); // true

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult); // false

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult); // false

		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

		System.out.println(totalMatched); // 2

		// Stream.reduce()
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);

		// Stream.findFirst()
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();

		System.out.println(firstMatchedName); // Lokesh
	}
}
