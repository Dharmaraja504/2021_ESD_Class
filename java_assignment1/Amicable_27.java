/*27. Implement a Java program to check two numbers are Amicable numbers or not.*/

class Amicable_27{
	public static void main(String args[]){
		int num1 = 220;
		int num2 = 284;
		int i, sum1 = 0, sum2 = 0;
		for( i = 1; i < num1; i++){
			if((num1 % i) == 0){
				sum1= sum1 + i;
			}
		}
		for( i = 1; i < num2; i++){
			if((num2 % i) == 0){
				sum2 = sum2 + i;
			}
		}
		if(( sum1 == num2) && (sum2 == num1)){
			System.out.println("Amicable numbers");
		}
		else{
			System.out.println("Not Amicable numbers");
		}
		
	}
}