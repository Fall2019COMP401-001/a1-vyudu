package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int items = scan.nextInt();
		String[] prods = new String[items];
		double[] prices = new double[items];
		
		for (int i = 0; i < items; i++) {
			prods[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int a = 0; 
		int customers = scan.nextInt();
		
		String[] names = new String[customers];
		double[] custPrice = new double[customers];
		
		while (a < customers) {
			custPrice[a] = 0.00; 
			names[a] = scan.next() + " " + scan.next();
			
			int totItem = scan.nextInt();
			int i = 0;
			
			while (i < totItem) {
				int numBought = scan.nextInt();
				String stuff = scan.next(); 
				int index = 0;
				while (index < items) {
					if (prods[index].equals(stuff)) {
						custPrice[a] = custPrice[a] + prices[index] * numBought;
					}
					index++;
				}
				i++;
			}
			
			a++;
			}
		
		int compare = 0;
		double big = 0;
		while (compare < names.length) {
			if (big < custPrice[compare]) {
				big = custPrice[compare];
			}
			compare++;
		}
		
		int k = 0;
		while (k < custPrice.length) {
			if (custPrice[k] == big) {
				System.out.println("Biggest: " + names[k] + " (" + String.format ("%.2f", custPrice[k]) + ")");

			}
			k++;
		}
			
		int compareSmall = 0;
		double small = 100;
		while (compareSmall < custPrice.length) {
			if (small > custPrice[compareSmall]) {
				small = custPrice[compareSmall];
			}
			compareSmall++;			
		}
		
		int j = 0;
		while (j < custPrice.length) {
			if (custPrice[j] == small) {
				System.out.println("Smallest: " + names[j] + " (" + String.format ("%.2f", custPrice[j]) + ")");
			}
			j++;
		}
		
		int length = 0;
		double sum = 0;
		while (length < custPrice.length) {
			sum = sum + custPrice[length];
			length++;
		}
		
		double average = sum / custPrice.length;
		System.out.println("Average: " + String.format ("%.2f", average));
		
	}
}
