package generics;



public class Main {
	
	public static void main(String args[]) {

			String a1 = "Amazon", b1 = "Property", c1 = "Banana";
			TestMaximum<String> obj1 = new TestMaximum<>(a1, b1, c1);
			obj1.testMaximum(a1,b1,c1);
			Float a2 = 10.7f, b2 = 50.8f, c2 = 30.3f;
			TestMaximum<Float> obj2 = new TestMaximum<>(a2, b2, c2);
			obj2.testMaximum(a2,b2,c2);
			Integer a3 = 10, b3 = 50, c3 = 80;
			TestMaximum<Integer> obj3 = new TestMaximum<>(a3, b3, c3);
			obj3.testMaximum(a3,b3,c3);
			
			
			String a11 = "Amazon", b11 = "Property", c11 = "Banana", d11 = "America";
			TestMaximum<String> obj11 = new TestMaximum<>(a11, b11, c11,d11);
			obj11.testMaximum(a11,b11,c11,d11);
			Float a22 = 10.7f, b22 = 50.8f, c22 = 30.3f, d22 = 32.4f;
			TestMaximum<Float> obj22 = new TestMaximum<>(a22, b22, c22,d22);
			obj22.testMaximum(a22,b22,c22,d22);
			Integer a33 = 10, b33 = 50, c33 = 80, d33 = 42;
			TestMaximum<Integer> obj33 = new TestMaximum<>(a33, b33, c33,d33);
			obj33.testMaximum(a33,b33,c33,d33);
			
		

		
	}

}