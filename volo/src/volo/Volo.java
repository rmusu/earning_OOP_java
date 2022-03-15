package volo;

public class Volo {

	public String idVolo;
	public String partenzaCittà;
	public String arrivoCittà;
	public String partenzaGiorno;
	public int partenzaOra;
	public float durata;
	public int distanza;
	public String tipologia;
	public Persona pilota;

	public Volo(String idVolo, String partenzaCittà, String arrivoCittà, String partenzaGiorno, int partenzaOra,
			float durata, int distanza, String tipologia, Persona pilota) {

		this.idVolo = idVolo;
		this.partenzaCittà = partenzaCittà;
		this.arrivoCittà = arrivoCittà;
		this.partenzaGiorno = partenzaGiorno;
		this.partenzaOra = partenzaOra;
		this.durata = durata;
		this.distanza = distanza;
		this.tipologia = tipologia;
		this.pilota = pilota;

	}
	
	public Volo(String idVolo) {
		this.idVolo = idVolo;
	}

	public boolean durataMaggioreDi(float ore) {
		return durata > ore;
	}

	public boolean pilotaIs(String nomeDato, String cognomeDato) {
		return (pilota.nome.equals(nomeDato) && pilota.cognome.equals(cognomeDato));
	}

	public boolean andataRitornoCittàSono(String città1, String città2) {
		return (partenzaCittà.equals(città1) && arrivoCittà.equals(città2));
	}

}
