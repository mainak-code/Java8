import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicLambdaExpressionJava8 {

	public static void main(String[] args) {

		List<Integer> myList1 = Arrays.asList(5, 2, 9);

		List<String> myList2 = Arrays.asList("kolkata", "bombay", "delhi");

		myList2.forEach(str -> System.out.println(str));

		Collections.sort(myList1);
		System.out.println(myList1);
	}

}
