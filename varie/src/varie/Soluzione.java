package varie;

import java.util.Map;

public class Soluzione {
	
	public static void main(String args[]) {
		
		Integer a = 2;
		
		
		Aritmetica calcolatrice = new Aritmetica();
			
			System.out.println("la somma di tre interi è: " + calcolatrice.sum(a.intValue(),3,4));
			
			System.out.println("la somma di 2 interi è: "+ calcolatrice.sum(2,3));
			
			System.out.println("la somma di 2 double è: "+ calcolatrice.sum(2.5,3.5));
			
			System.out.println("la somma di 3 float è: "+ calcolatrice.sum(2.5f,3.5f,4.5f));
			
			
			
			
			
		
	}

}
