package a1;

import java.util.Scanner;

public class A1Jedi {

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
		
		int customers = scan.nextInt();
		int a = 0; 
		
		int[] numBoughtArray = new int[items];
		int[] custBoughtArray = new int[items];
		
		while (a < customers) {
			String fname = scan.next();
			String lname = scan.next();
			
			int load = scan.nextInt();
			int b = 0;
			while (b < load) {
				int numBought = scan.nextInt();
				String itemBought = scan.next();
				int c = 0;
				while (c < items) {
					if (prods[c].equals(itemBought)) {
						numBoughtArray[c] = numBoughtArray[c] + numBought;
						custBoughtArray[c]++;
					}
					c++;
				}
				b++;
			}
			a++;
		}
		
		int d = 0;
		while (d < items) {
			if (numBoughtArray[d] == 0) {
				System.out.println("No customers bought " + prods[d]);
			} else if (numBoughtArray[d] != 0) {
				System.out.println(custBoughtArray[d] + " customers bought " + numBoughtArray[d] + " " + prods[d]);
			}
			d++;
		}
		
		
	}
}
