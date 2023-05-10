package week1.day4;

public class Calculators {

	public void addingTwoNumbers(int a , int b){
		int c= a+b;
	System.out.println(c);}
	public void subtactionTwoNumbers(int e, int f) {
		int k = e-f ;
	System.out.println(k);}
	public void multipleTwoNumbers(double i, double j) {
		double d = i * j;
		System.out.println(d);}
	public void divideTwoNumbers(float x , float y) {
		float v = x/y;
		System.out.println(v);}
	
	public static void main(String[] args) {
     Calculators maths = new Calculators();
     maths.addingTwoNumbers(10, 5);
     maths.subtactionTwoNumbers(100, 45);
     maths.multipleTwoNumbers(5, 5);
     maths.divideTwoNumbers(2.3f, 22.10f);
	}
	
	
		
	}

