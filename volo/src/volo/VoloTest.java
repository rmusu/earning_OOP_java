package volo;

public class VoloTest {

	public static void main(String[] args) {

		Persona primoPilota = new Persona("Roberto", "Musumeci");
		Persona secondoPilota = new Persona("Mario", "Rossi");
		Persona terzoPilota = new Persona("Giulio", "Verdi");
		Persona quartoPilota = new Persona("Emilio", "Bianchi");

		Volo volo1 = new Volo("887AK", "Milano", "Catania", "mar", 15, 2.5f, 2000, "nazionale", primoPilota);
		Volo volo2 = new Volo("747HU", "Milano", "Madrid", "gio", 17, 3.5f, 2800, "continentale", secondoPilota);
		Volo volo3 = new Volo("647XV", "Kiev", "Lviv", "mer", 9, 1.0f, 900, "nazionale", terzoPilota);
		Volo volo4 = new Volo("487KW", "Belgrado", "Sidney", "sab", 21, 16.5f, 14900, "internazionale", quartoPilota);
		Volo volo5 = new Volo("587YT");
		Volo volo6 = new Volo("613WV");
		Volo volo7 = new Volo("777RF");
		Volo volo8 = new Volo("975TG");
		Volo volo9 = new Volo("123KJ");
		Volo volo10 = new Volo("496LD");

		Volo[] voli = { volo1, volo2, volo3, volo4 };
		Volo[] voli1 = { volo1, volo2, volo3, volo4, volo5, volo6, volo7, volo8, volo9, volo10 };

		// esercizio 1
		float ore = 10.0f;

		for (Volo volo : voli) {

			if (volo.durataMaggioreDi(ore)) {
				System.out.println("il volo " + volo.idVolo + " in partenza da " + volo.partenzaCittà + " con arrivo a "
						+ volo.arrivoCittà + " ha durata maggiore di " + ore);
			}
		}

		// esercizio 2
		float totOre = 0.0f;
		String nomePilota = "Mario";
		String cognomePilota = "Rossi";

		for (Volo volo : voli) {

			if (volo.pilotaIs(nomePilota, cognomePilota)) {

				totOre += volo.durata;

				System.out.println("il volo " + volo.idVolo + " in partenza da " + volo.partenzaCittà + " con arrivo a "
						+ volo.arrivoCittà + " ha come pilota " + volo.pilota.nome + " " + volo.pilota.cognome);
			}
		}

		// esercizio 4
		System.out.println("il totale delle ore viaggiate da " + nomePilota + " " + cognomePilota + " è " + totOre);

		// esercizio 3
		String cittàPartenza = "Milano";
		String cittàArrivo = "Madrid";

		for (Volo volo : voli) {

			if (volo.andataRitornoCittàSono(cittàPartenza, cittàArrivo)) {

				System.out.println(
						"il volo " + volo.idVolo + " parte da " + cittàPartenza + " e arriva a " + cittàArrivo);

			}

		}

		for (int i = 0; i < (voli1.length / 2); i++) {

			System.out.print(voli1[i].idVolo + "\n");
			System.out.print(voli1[voli1.length - i - 1].idVolo);
			System.out.println();

		}

		System.out.println();

		String vocali = "aeiou";

		for (Volo volo : voli) {

			for (String carattereNome : volo.pilota.nome.split("")) {

				if (vocali.contains(carattereNome)) {
					System.out.print(carattereNome);
				}

			}
			System.out.print(" ");
			for (String carattereCognome : volo.pilota.cognome.split("")) {

				if (vocali.contains(carattereCognome)) {
					System.out.print(carattereCognome);
				}

			}
			System.out.println();

		}

	}

}
