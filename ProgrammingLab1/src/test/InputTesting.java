package test;
import java.util.Scanner;

public class InputTesting {
	public static void main(Strings[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number for radius of a circle: ");
		double radius = scanner.nextDouble();
		
		double area = radius * radius * 3.14159;
		
		System.out.println("Area of a cicrlce with radius of " + radius + " cm is " + area  + " cm ^ 2");
		
		
		
	}
}
