package volo;

public class DataNascita {

	private final int giorno;
	private final int mese;
	private final int anno;

	public DataNascita(final int giorno, final int mese, final int anno) {
		if (giorno <= 0 | giorno > 31 | mese <= 0 | mese > 12 | anno <= 1900 | anno > 2022)
			throw new IllegalArgumentException("data errata");
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}

	public int getGiorno() {
		return giorno;
	}

	public int getMese() {
		return mese;
	}

	public int getAnno() {
		return anno;
	}

	@Override
	public String toString() {
		return giorno + "/" + mese + "/" + anno;
	}

}
