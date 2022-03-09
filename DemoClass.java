package listSort;

public class DemoClass implements Interface1, Interface2 {

	public static void main(String[] args) {

		System.out.println(new DemoClass().getGreeting());

	}

	@Override
	public String getGreeting() {
		return "Good Evening!";
	}

}
