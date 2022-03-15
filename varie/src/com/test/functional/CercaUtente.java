package com.test.functional;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CercaUtente {

	public ArrayList<Utente> cercaUtenti(ArrayList<Utente> utenti, Predicate<Utente> p) {

		ArrayList<Utente> trovati = new ArrayList<>();

		for (Utente u : utenti) {
			if (p.test(u)) {
				trovati.add(u);
			}

		}

		return trovati;

	}

	public Utente cercaUtente(ArrayList<Utente> utenti, Predicate<Utente> p) {

		Utente trovato = null;

		for (Utente u : utenti) {
			if (p.test(u)) {
				trovato = u;
				break;
			}

		}

		return trovato;

	}

	public ArrayList<Utente> utenti() {
		ArrayList<Utente> u = new ArrayList<Utente>();

		Utente u1 = new Utente("Luca", "Bianchi", 21, "milano", "l.b@gmail.com", "lb1999");
		Utente u2 = new Utente("Elio", "Germano", 32, "monza", "e.g@gmail.com", "eg1990");
		Utente u3 = new Utente("Paolo", "Rossi", 24, "milano", "p.r@gmail.com", "ttttt!!!");
		Utente u4 = new Utente("Franceco", "Gialli", 21, "brescia", "fg@libero.it", "123stella");
		Utente u5 = new Utente("Enza", "Verdi", 41, "bergamo", "e.v@tiscali.com", "0009@@@");
		Utente u6 = new Utente("Paolo", "Blu", 51, "catania", "paolo.blu@gmail.com", "!$202020");
		Utente u7 = new Utente("Luigi", "Bianchi", 27, "ancona", "lui.bi@hotmail.com", "Milano71");
		Utente u8 = new Utente("Ernesto", "Mauri", 33, "bari", "mauri.ernesto@ghotmail.com", "Ernesto33");

		u.add(u1);
		u.add(u2);
		u.add(u3);
		u.add(u4);
		u.add(u5);
		u.add(u6);
		u.add(u7);
		u.add(u8);

		return u;

	}

}
