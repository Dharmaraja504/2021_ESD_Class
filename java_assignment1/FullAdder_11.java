/*11. Implement a JAVA program to implement a Full adder using Bitwise operator*/

class FullAdder_11{
	public static void main(String args[]){
		int a = 1;
		int b = 1;
		int cin = 1;
		int sum = a ^ b ^ cin;
		int cout = (a&b) | (b&cin) | (cin&a);
		System.out.println("sum is "+sum);
		System.out.println("cout is "+cout);
	}
}