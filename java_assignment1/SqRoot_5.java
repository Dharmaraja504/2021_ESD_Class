/* program to find the square root of a number input through command line*/
import java.lang.Math;

class SqRoot_5{
	public static void main(String args[]){
		double number = Double.parseDouble(args[0]);
		System.out.println("Square root of the number is : "+ Math.sqrt(number));		
	}
}