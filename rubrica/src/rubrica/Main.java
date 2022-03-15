package rubrica;

public class Main {

	public static void main(String[] args) {
		Rubrica myRubrica = new Rubrica();

		myRubrica.inserimeto("Roberto", "334525262672");

		myRubrica.inserimeto("Paolo", "4444444444");
		myRubrica.inserimeto("Luca", "555555555");
		myRubrica.inserimeto("Ezio", "66666666");
		myRubrica.inserimeto("Enzo", "777777777");
		myRubrica.inserimeto("Mario", "88888888888");
		myRubrica.inserimeto("Luigi", "999999999s");
		
		
		System.out.println(myRubrica.stampa());
		
		myRubrica.cancellazione("Enzo");
		
		System.out.println(myRubrica.stampa());
		
		
		
		System.out.println("==========");
		String nome = "Luigi";
		System.out.println("il numero di " + nome + " è " + myRubrica.ricercaPerNome(nome));
		System.out.println("==========");
		String numero = "66666666";
		System.out.println("il numero "+ numero + " appartiene a " + myRubrica.ricercaPerNumero(numero));
		
		
		
		
	}

}
