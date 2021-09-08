package generics;

public class Main {
	
	public static void main(String args[]) {
		String a1="Amazon", b1 = "P", c1 = "Banana";
		TestMaximum<String> obj1 = new TestMaximum<>(a1, b1, c1);
		obj1.findMax();
		Float a2 =32.2f, b2 = 70.3f, c2 = 84.6f;
		TestMaximum<Float> obj2=new TestMaximum<>(a2, b2, c2);
		obj2.findMax();
		Integer a3 = 43, b3 = 67, c3 = 89;
		TestMaximum<Integer> obj3=new TestMaximum<>(a3, b3, c3);
		obj3.findMax();
	}

}
