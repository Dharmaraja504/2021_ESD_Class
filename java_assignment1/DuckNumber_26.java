/*26. Implement a Java program to check whether a number is a Duck Number or not*/

class DuckNumber_26{
	public static void main(String args[]){
		int num = 3405;
		while(num > 0){
			if((num % 10 )== 0){
				System.out.println("Duck Number");
				return;
			}
			else{
				num = num / 10;
			}
		} 
		System.out.println(" Not a Duck Number");
	}
}