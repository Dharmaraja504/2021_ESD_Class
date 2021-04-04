/*40. Implement a Java program to compute body mass index (BMI).*/

class BodyMassIndex_40{
	public static void main(String args[]){
		double weight = 58; //weight in kgs
		double height = 1.7; //height in meters
		double bmi = weight/(height * height);
		System.out.println("BMI : "+bmi);
	}
}