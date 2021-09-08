package generics;

public class Main {
	
	public static void main(String args[]) {
		Float a1 = 43.4f, b1 = 29.1f, c1 = 17.7f;
		TestMaximum test1 = new TestMaximum(a1,b1,c1);
		test1.maximum();
		Float a2 = 19.7f, b2 = 51.8f, c2 = 20.3f;
		TestMaximum test2 = new TestMaximum(a2,b2,c2);
		test2.maximum();
		Float a3 = 15.2f,b3 = 50.6f,c3 = 90.9f;
		TestMaximum test3 = new TestMaximum(a3,b3,c3);
		test3.maximum();
	}

}