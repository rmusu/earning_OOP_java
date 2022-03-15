package volo;


import java.util.Objects;


/**	
 * 
 * classe immutabile che rappresenta una persona
 * 
 * @author Roberto Musumeci
 * @version 1.0
 * 
 * */
public class Persona {

	public String nome;
	public String cognome;
	public String luogoNascita;
	private DataNascita data;
	public String email;
	public int età;

	
	//costruttori
	/**	
	 * 
	 * costruisce una nuova persona
	 * 
	 * @param nome il nome della persona
	 * @param cognome il cognome della persona
	 * @param data la data di nascita della persona
	 * @param età l' età della persona
	 * 
	 * @throws IllegalArgumentException se età non compresa tra 0 e 120
	 * @throws NullPointerException se nome, cognome o data sono null
	 * 
	 * */
	public Persona(final String nome, final String cognome, final DataNascita data, final int età) {

		this.nome = Objects.requireNonNull(nome);
		this.cognome = Objects.requireNonNull(cognome);
		this.data = Objects.requireNonNull(data);
		if (età < 0 | età > 120)
			throw new IllegalArgumentException("inserire una data vaida");
		else
			this.età = età;

	}
	
	public Persona(String nome, String cognome, String luogoNascita, String email, int età) {

		this.nome = Objects.requireNonNull(nome);
		this.cognome = Objects.requireNonNull(cognome);
		this.luogoNascita = Objects.requireNonNull(luogoNascita);
		this.email = Objects.requireNonNull(email);
		this.età = età;

	}
	
	public Persona(String nome, String cognome) {
		
		this.nome = Objects.requireNonNull(nome);
		this.cognome = Objects.requireNonNull(cognome);

		
	}
	
	//metodi
	public int getEtà() {
		return età;
	}

	public DataNascita getData() {
		return data;
	}

	public void mangia() {
		System.out.println("la persona mangia");
	}

	public int calcolaEtà() {
		DataNascita oggi = new DataNascita(9, 2, 2022);

		if (data.getMese() >= oggi.getMese() && data.getGiorno() > oggi.getGiorno())

			return oggi.getAnno() - data.getAnno() - 1;
		else
			return oggi.getAnno() - data.getAnno();

	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append(nome + " " + cognome + " nato il " + data.toString() + " ha " + età + " anni.");
		return s.toString();
	}

}
