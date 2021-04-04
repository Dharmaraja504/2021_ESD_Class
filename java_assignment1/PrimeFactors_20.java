/*20. Implement a Java program to print all prime factors of a given number.*/

class PrimeFactors_20{
	static boolean ifPrime(int num){
		int i;
		for(i = 2; i < num; i++){
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		int num = 24;
		int i;
		for(i = 2 ; i <= num ; i++)
		{
			if((num % i) == 0){
				if(ifPrime(i)){
					System.out.println(i);
				}
			}
		}
		
	}
}