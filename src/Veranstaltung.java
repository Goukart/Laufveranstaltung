import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Veranstaltung implements Bank {

	private String Name;
	private double Strecke;
	private Date Termin;
	private int Startgeb�hr;
	private Map Teilnehmer;
	static Logger log = LogManager.getRootLogger();
	
	
	public static void main(String[] argv) {
		
	}
	
	
	public void Veranstaltung(){
		log.info("Programm wurde gestartet.");
	}

	public void getNummer() {
		// TODO - implement Veranstaltung.getNummer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l�ufer
	 */
	public void anmelden(L�ufer l�ufer) {
		// TODO - implement Veranstaltung.anmelden
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l�ufer
	 */
	public void abmelden(L�ufer l�ufer) {
		// TODO - implement Veranstaltung.abmelden
		throw new UnsupportedOperationException();
	}

	public L�ufer[] listeL�ufer() {
		// TODO - implement Veranstaltung.listeL�ufer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l�ufer
	 */
	public void verein�ndern(L�ufer l�ufer) {
		// TODO - implement Veranstaltung.verein�ndern
		throw new UnsupportedOperationException();
	}

	public L�ufer[] erstelleStartliste() {
		// TODO - implement Veranstaltung.erstelleStartliste
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Date
	 */
	public void anmeldungen(bis Date) {
		// TODO - implement Veranstaltung.anmeldungen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l�uferListe
	 */
	public void zuweisungNummern(L�ufer[] l�uferListe) {
		// TODO - implement Veranstaltung.zuweisungNummern
		throw new UnsupportedOperationException();
	}

	public L�ufer[] listeAufgeber() {
		// TODO - implement Veranstaltung.listeAufgeber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l�ufer
	 */
	public void disqualifizieren(L�ufer l�ufer) {
		// TODO - implement Veranstaltung.disqualifizieren
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l�ufer
	 * @param zeit
	 */
	public void laufzeit�ndern(L�ufer l�ufer, double zeit) {
		// TODO - implement Veranstaltung.laufzeit�ndern
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param l�ufer
	 * @param zeit
	 * @param platzierung
	 */
	public void sms(L�ufer l�ufer, double zeit, int platzierung) {
		// TODO - implement Veranstaltung.sms
		throw new UnsupportedOperationException();
	}

}