import java.util.Scanner;

public class AreaTriangle{
	
	public static void main(String args[]){
	
		//Variables
		double width = 0;
		double height = 0;
		double area = 0;
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Please introduce the width: ");
		width = scanner.nextDouble();
		System.out.println("Please introduce the height: ");
		height = scanner.nextDouble();
		area = (width * height)/2;
		System.out.println("The area is: " + area + "cm");
	
	
	
}
}