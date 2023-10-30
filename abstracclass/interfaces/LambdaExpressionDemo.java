package com.abstracclass.interfaces;

interface TestLambda {

//	public void read();

//	String speak();

//	int display(int a);

	// Multiple parameterized method.
	int sum(int a, int b);

}

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		// LE without parameterized method
		/*
		 * String name = "Gaurav"; int a = 48; // (arg-list)->{body} TestLambda T1 = ()
		 * -> {System.out.println("Implements TestLambda_Interface succesful !\n" +
		 * "Roll NO :" + a + "\nname :" + name);}; T1.read();
		 */

		// -> LE with return type
//		TestLambda tf = () -> {return "Implemnt TestLambda interface";};
//		System.out.println(tf.speak());

		// LE for single parameter
//		TestLambda tl = (int n) -> {return n;};
//		System.out.println("Roll NO :" +tl.display(48));

		// LE with multiple parameter
		TestLambda tl = (int n, int m) -> {
			return n * m;
		};

		System.out.println(" The multiplication of a and b is : " + tl.sum(8, 4));

		TestLambda t2 = (int n, int m) -> {
			return n / m;
		};

		System.out.println(" The Division of a and b is : " + t2.sum(8, 4));

		TestLambda t3 = (int n, int m) -> {
			return n + m;
		};

		System.out.println(" The addition of a and b is : " + t3.sum(8, 4));

		TestLambda t4 = (int n, int m) -> {
			return n - m;
		};

		System.out.println(" The multiplication of a and b is : " + t4.sum(8, 4));

		TestLambda t5 = (int n, int m) -> {
			return n % m;
		};

		System.out.println(" The mod of a and b is : " + tl.sum(8, 4));

	}
}
