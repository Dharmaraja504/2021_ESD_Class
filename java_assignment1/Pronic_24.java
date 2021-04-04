/*24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.*/

class Pronic_24{
	public static void main(String args[]){
		int num = 42;
		int i;
		for( i = 1; i < num; i++){
			if((num % i) == 0){
				if((num % (i + 1))== 0){
					System.out.println("Number is pronic");
					return;
				}
			}
		}
		System.out.println("Number is not pronic");
	}
}