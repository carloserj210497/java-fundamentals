import java.util.Scanner;

public class age{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Whats your age?  ");
		int userAge = scanner.nextInt();
		
		if (userAge == 0){
			System.out.println("You´re a baby");
		}
		else if(userAge < 0){
			System.out.println("You haven´t been born yet!");
		}
		else if(userAge >= 65){
			System.out.println("You´re a  senior");
		}
		else if(userAge >= 18){
			System.out.println("You´re an adult");
		}
		else{
			System.out.println("You´re a child");
		}
			
		
		
		
		scanner.close();
		
		
		
	}
}