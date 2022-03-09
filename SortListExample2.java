package listSort;

import java.util.*;
import java.util.stream.Collectors;

public class SortListExample2 {
	public static void main(String[] args) {
//returns a list view   
		List<String> slist = Arrays.asList("78", "a", "m", "b", "z", "c", "12", "l", "1");
		List<String> sortedList = slist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
	}
}