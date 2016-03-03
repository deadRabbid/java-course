public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate....");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = add(first, second);
		System.out.println("Sum: " + sum);
	}

	public static int add(int a, int b){
		return a+b;
	}

	public static int mult(int a, int b){
		return a*b;
	}

	public static int div(int a, int b){
		return a/b;
	}

	public static int sub(int a, int b){
		return a+b;
	}

	public static int invo(int a, int b){
		return a^b;
	}

}