/*22. Check whether the number is a palindrome number or not.*/

class Palindrome_22{
	public static void main(String args[]){
		int num = 1221;
		int temp = num;
		int digit, revNum = 0;
		while(temp > 0){
			digit = temp % 10;
			temp = temp / 10;
			revNum = (revNum * 10) + digit;
		}
		if(revNum == num){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
		}
	
	}
}