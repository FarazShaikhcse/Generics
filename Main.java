package generics;

public class Main {
	
	public static void main(String args[]) {
		Integer a1 = 95, b1 = 40, c1 = 29;
		TestMaximum test1 = new TestMaximum(a1,b1,c1);
		test1.findMax();
		Integer a2 = 25, b2 = 70, c2 = 35;
		TestMaximum test2 = new TestMaximum(a2,b2,c2);
		test2.findMax();
		Integer a3 = 40,b3 = 50,c3 = 90;
		TestMaximum test3 = new TestMaximum(a3,b3,c3);
		test3.findMax();
	}

}