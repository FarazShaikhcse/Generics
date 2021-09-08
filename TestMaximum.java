package generics;

public class TestMaximum {
	
	private static Float a, b, c;
	TestMaximum(Float a, Float b, Float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void maximum() {
		Float res = TestMaximum.findMax(a,b,c);
		System.out.println("Maximum of " + a + "," + b + " and " + c + " is =" +res);
	}
	
	public static Float findMax(Float a, Float b, Float c) {
		Float max = a;
		if(b.compareTo(max) > 0) {
			
			max=b;
		}
		if(c.compareTo(max) > 0) {
			max=c;
		}
		
		return max;
		
	}
	

}
