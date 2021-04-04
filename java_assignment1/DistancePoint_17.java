/*17. Find the distance between two points, using euclidean distance.*/

import java.lang.Math;

class DistancePoint_17{
	public static void main(String args[]){
		int x1= 8;
		int x2 = 5;
		int y1 = 7;
		int y2 = 3;
		Double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance : " + distance);
	}
}