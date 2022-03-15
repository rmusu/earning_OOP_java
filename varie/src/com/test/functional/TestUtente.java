package com.test.functional;

import java.util.ArrayList;

public class TestUtente {

	public static void main(String[] args) {

		CercaUtente cerca = new CercaUtente();

		// utenti di cognome..

		String cognomeCercato = "Bianchi";

		Utente utenteCognome = cerca.cercaUtente(cerca.utenti(), utente -> utente.getCognome().equals(cognomeCercato));

		System.out.println("persona di cognome Bianchi " + utenteCognome);

		System.out.println("==============================================");

		// utenti di età maggiore a..

		int eta = 30;

		ArrayList<Utente> utentiEtà = cerca.cercaUtenti(cerca.utenti(), utente -> utente.getEta() > eta);

		System.out.println("persone di età superiore a " + eta);
		for (Utente u : utentiEtà) {
			System.out.println(u);

		}

		System.out.println("==============================================");

		// certo tipo di mail e luogo residenza

		String email = "gmail";
		String residenza = "milano";

		ArrayList<Utente> utentiER = cerca.cercaUtenti(cerca.utenti(),
				utente -> utente.getEmail().contains(email) && utente.getCittaResidenza().equals(residenza));

		System.out.println("persone residenti a " + residenza + " con account " + email + ":\n");

		for (Utente u : utentiER) {
			System.out.println(u);

		}

	}

}
