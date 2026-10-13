import java.util.Scanner;

public class input{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Are you a studen? (true/false): ");
		boolean isStudent = scanner.nextBoolean();
		
		
		System.out.println("Hello " + name);
		System.out.println("Your age is: " + age);
		System.out.println("Student " + isStudent);
		scanner.close();
		
		if (isStudent){
			System.out.println("You´re enrrolled as a student");
		}
		else{
			System.out.println("You´re not enrolled as a studen");
		}
	}
}