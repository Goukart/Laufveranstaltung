import java.util.Date;
import java.util.Map;

public class Laeufer implements Bank {

	private String Name;
	private String Vorname;
	private String Adresse;
	private String Geschlecht;
	private Date Geburtsjahr;
	private String Verein;
	private String Mail;
	private String Telefonnummer;

	/**
	 * 
	 * @param laeufer
	 */
	public Map alleErgebnisse(Laeufer laeufer) {
		// TODO - implement Laeufer.alleErgebnisse
		throw new UnsupportedOperationException();
	}

	@Override
	public void buchen(int quellKonto, int zielKonto, int betrag) {

	}

	@Override
	public int[] zahlungsEingaenge(int Konto) {
		return new int[0];
	}
}