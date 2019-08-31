package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int a = 0; 
		int customers = scan.nextInt();
		
		while (a < customers) {
			
			double price = 0.0; 
			char initial1 = scan.next().charAt(0);
			String surname1 = scan.next();
			
			int totItem = scan.nextInt();
			int i = 0;
			
			while (i < totItem) {
				price = price + scan.nextInt() * scan.nextDouble();
				i++;
			}
			
			Double.toString(price);
			
			System.out.println(initial1 + ". " + surname1 + " " + price);
			
			a++;
			}
		}
		
		
	}
