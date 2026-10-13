import java.util.Scanner;

public class ShopingCart{
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		//Variables
		String item;
		double price;
		int quantity;
		char currency = '$';
		double total;
		
		System.out.println("What item would you like to buy? ");
		item = scanner.nextLine();
		
		System.out.println("What is the price for each?: ");
		price = scanner.nextDouble();
		
		System.out.println("How many items do you want to buy?: ");
		quantity = scanner.nextInt();
		
		total = quantity * price;
		
		System.out.println("\nYou have bought " + quantity + " " + item + "/s");
		System.out.println("The total of your purchase is: " + currency + total);
		
		scanner.close();
		
		
		
		
	}
	
}