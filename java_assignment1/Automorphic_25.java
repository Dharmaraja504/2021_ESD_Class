/*25. Implement a Java program check whether a number is an Automorphic number or not.*/

class Automorphic_25{
	public static void main(String args[]){
		double num = 76;
		double temp = num;
		double sqNum = num * num;
		double mask = 1;
		double lastDigits;
		int length = String.valueOf(num).length();
		
		int i;
		for( i = 0; i < length - 2 ; i++){
			mask = mask * 10;
		}		
		lastDigits = sqNum % mask;
		if(temp == lastDigits){
			System.out.println("Number is automorphic");
		}
		else
		{
			System.out.println("Number is not automorphic");
		}
	}
}