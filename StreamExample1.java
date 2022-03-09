package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {

		// Stream.of()
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//stream1.forEach(p -> System.out.println(p));

		// Stream.of(array)
		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		//stream2.forEach(p -> System.out.println(p));
		
		//List.stream()
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 1; i< 10; i++){
		      list.add(i);
		}

		Stream<Integer> stream3 = list.stream();
		//stream3.forEach(p -> System.out.println(p));
		
		//Stream.generate() or Stream.iterate()
		Stream<Integer> randomNumbers = Stream
			      .generate(() -> (new Random()).nextInt(100));

			randomNumbers.limit(20).forEach(System.out::println);
		
		
		
	}
}
