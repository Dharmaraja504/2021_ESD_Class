/*19. Implement a Java program to calculate the Binomial Coefficient of two positive numbers.*/

class Binomial_19{

	static int binomialCoeff(int n, int k){
		if(k > n)
			return 0;
		if(k == 0 || k == n)
			return 1;
		
		return binomialCoeff(n - 1, k - 1) + binomialCoeff(n -1, k);
	
	}
	public static void main(String args[]){
		int n = 5, k = 2;
		System.out.printf("value of coeff(%d, %d) is %d", n, k, binomialCoeff(n, k));	
	}
}