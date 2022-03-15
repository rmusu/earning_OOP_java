package varie;

import java.util.ArrayList;
import java.util.Arrays;

public class EserciziRandom {

	public static void main(String[] args) {
		/*
		 * System.out.println(primaPersona.nome.concat(" ").concat(primaPersona.cognome)
		 * .concat("\n"));
		 * 
		 * String nomeCognomeUpper =
		 * primaPersona.nome.toUpperCase().concat(" ").concat(primaPersona.cognome.
		 * toUpperCase());
		 * 
		 * System.out.println(nomeCognomeUpper +"\n");
		 * 
		 * String eAReplaced = nomeCognomeUpper.replace('E', 'e').replace('A', 'a');
		 * 
		 * System.out.println(eAReplaced+"\n");
		 * 
		 * 
		 * 
		 * System.out.printf("%s; %s = %s\n",s1,s2,s1.concat(s2));
		 * 
		 * System.out.printf("%s ---> %s\n",s3,s3.substring(5));
		 * 
		 * System.out.printf("%s ---> %s\n",s4,s4.substring(4,8).length());
		 * 
		 * 
		 * String s1 = "barba"; String s2 = "gianni"; String s3 = "piano"; String s4 =
		 * "Piano";
		 * 
		 * if (s1.length() > s2.length()) {
		 * 
		 * System.out.println(s1);
		 * 
		 * } else if (s1.length() < s2.length()) {
		 * 
		 * System.out.println(s2);
		 * 
		 * } else {
		 * 
		 * System.out.println("le due stringhe hanno stessa lunghezza");
		 * 
		 * }
		 * 
		 * if (s3.equals(s4)) {
		 * 
		 * System.out.println("\nle due stringhe sono uguali");
		 * 
		 * } else {
		 * 
		 * System.out.println("\nle due stringhe non sono uguali"); }
		 * 
		 * if (s3.charAt(0) == 'p' | s3.charAt(0) == 'P') {
		 * 
		 * System.out.println("\nla prima lettera è una p");
		 * 
		 * } else {
		 * 
		 * System.out.println("\nla prima lettera non è una p");
		 * 
		 * }
		 * 
		 * 
		 * // esercizio 1
		 * 
		 * int[] arrayInteri = { 18, 200, 31, 10, 50, 6, 24, 8, 99, 10 };
		 * 
		 * int min = arrayInteri[0]; int max = arrayInteri[0];
		 * 
		 * for (int i = 0; i < arrayInteri.length; i++) { if (arrayInteri[i] < min) {
		 * min = arrayInteri[i]; } else if (arrayInteri[i] > max) { max =
		 * arrayInteri[i]; }
		 * 
		 * System.out.printf("l' elemento in posizione %d elemento è %d\n", i,
		 * arrayInteri[i]); }
		 * 
		 * System.out.printf("\nl' elemento minore è %d, l' elemento maggiore è %d\n",
		 * min, max);
		 * 
		 * // esercizio 2
		 * 
		 * String s = "Informatica"; char[] caratteri = s.toCharArray(); StringBuilder
		 * reverse = new StringBuilder();
		 * 
		 * for (int i = caratteri.length - 1; i >= 0; i--) {
		 * reverse.append(caratteri[i]); }
		 * System.out.println("\nInformatica scritta al contrario è: " +
		 * reverse.toString());
		 * 
		 * // esercizio 3
		 * 
		 * System.out.println("\ni numeri pari sono: \n"); for (int i = 0; i <
		 * arrayInteri.length; i++) { if (arrayInteri[i] % 2 == 0) {
		 * System.out.println(arrayInteri[i]); } else { continue; } }
		 * System.out.println("\ni numeri dispari sono: \n"); for (int i = 0; i <
		 * arrayInteri.length; i++) { if (arrayInteri[i] % 2 != 0) {
		 * System.out.println(arrayInteri[i]); } else { continue; } }
		 * 
		 * // esercizio 5
		 * 
		 * String s = "bananab"; char[] caratteri = s.toCharArray(); StringBuilder
		 * reverse = new StringBuilder();
		 * 
		 * for (int i = caratteri.length - 1; i >= 0; i--) {
		 * reverse.append(caratteri[i]); }
		 * 
		 * if (s.equalsIgnoreCase(reverse.toString())) {
		 * System.out.println("\nparola palindroma"); } else {
		 * System.out.println("\nparola non palindroma"); }
		 * 
		 * // esercizio 5 bis
		 * 
		 * boolean palindroma = true;
		 * 
		 * for (int i = 0; i < caratteri.length; i++) {
		 * 
		 * if (caratteri[i] != caratteri[caratteri.length - 1 - i]) {
		 * 
		 * palindroma = false;
		 * 
		 * } }
		 * 
		 * if (palindroma) { System.out.println("\nparola palindroma"); } else {
		 * System.out.println("\nparola non palindroma");
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 */

//		// esercizio 5
//
//		String s = "bananab";
//	
//		char[] caratteri = s.toCharArray();
//		StringBuilder reverse = new StringBuilder();
//
//		for (int i = caratteri.length - 1; i >= 0; i--) {
//			reverse.append(caratteri[i]);
//		}
//
//		if (s.equalsIgnoreCase(reverse.toString())) {
//			System.out.println("\nparola palindroma");
//		} else {
//			System.out.println("\nparola non palindroma");
//		}
//
//		// esercizio 5 bis
//
//		boolean palindroma = true;
//
//		for (int j = 0; j < caratteri.length; j++) {
//
//			if (caratteri[j] != caratteri[caratteri.length - 1 - j]) {
//
//				palindroma = false;
//
//			}
//		}
//
//		if (palindroma) {
//			System.out.println("\nparola palindroma");
//		} else {
//			System.out.println("\nparola non palindroma");
//
//		}

		String s = "anna";
		
		boolean isPalindroma = true;
		char[] array = s.toCharArray();
		
		for(int i=0; i < s.length()/2; i++) {
			
			if (array[i]!=array[array.length-1-i]) {
				isPalindroma = false;
				
			}
		}
		System.out.println( isPalindroma);

	}

}
