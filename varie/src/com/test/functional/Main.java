package com.test.functional;

public class Main {

	public static void main(String[] args) {

		FormaGeometrica Rettangolo = (a, b) -> a * b;

		System.out.println("l'area è " + Rettangolo.calcolaArea(3, 4));

	}

}
