package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int a = 0; 
		int customers = scan.nextInt();
		
		while (a < customers) {
			
			double price = 0.00; 
			char initial1 = scan.next().charAt(0);
			String surname1 = scan.next();
			
			int totItem = scan.nextInt();
			int i = 0;
			
			while (i < totItem) {
				int numb = scan.nextInt();
				String xd = scan.next();
				price = price + numb * scan.nextDouble();
				i++;
			}

			
			System.out.println(initial1 + ". " + surname1 + ": " + String.format ("%.2f", price));
			
			a++;
			}
		}
		
		
	}
