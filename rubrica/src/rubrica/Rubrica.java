package rubrica;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

	private Map<String, String> lista = new HashMap<>();

	public void inserimeto(String nome, String numero) {

		lista.put(nome, numero);

	}

//	2. La cancellazione di una coppia <Nome, telefono> a partire dal nome
	public void cancellazione(String nome) {

		lista.remove(nome);

	}

//	3. La ricerca di una Persona di cui si conosce il numero di telefono
	public String ricercaPerNumero(String numero) {

		for (String nome : lista.keySet()) {

			if (ricercaPerNome(nome).equals(numero)) {

				return nome;
			}
		}
		return null;
	}

//	4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome
	public String ricercaPerNome(String nome) {

		return lista.get(nome);

	}

//	5. La stampa di tutti i contatti con nome e numero

	public String stampa() {

		StringBuilder s = new StringBuilder();

		for (Map.Entry<String, String> entry : lista.entrySet()) {

			s.append(entry + "\n");
		}

		return s.toString();
	}

}
