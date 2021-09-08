package generics;

public class Main {
	
	public static void main(String args[]) {
		String a1="Amazon", b1 = "Tiger", c1 = "Zebra";
		TestMaximum obj1 = new TestMaximum();
		obj1.initString(a1, b1, c1);
		obj1.findStringMax(a1, b1, c1);;
		String a2 = "Zebra",b2="Amazon",c2="Tiger";
		TestMaximum obj2 = new TestMaximum();
		obj1.initString(a2, b2, c2);
		obj2.findStringMax(a2, b2, c2);;
		String a3="Tiger",b3="Zebra",c3="Amazon";
		TestMaximum obj3 = new TestMaximum();
		obj1.initString(a3, b3, c3);
		obj3.findStringMax(a3, b3, c3);;
	}

}