import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Veranstaltung implements Bank {

	private String Name;
	private double Strecke;
	private Date Termin;
	private int Startgebühr;
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
	 * @param läufer
	 */
	public void anmelden(Läufer läufer) {
		// TODO - implement Veranstaltung.anmelden
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param läufer
	 */
	public void abmelden(Läufer läufer) {
		// TODO - implement Veranstaltung.abmelden
		throw new UnsupportedOperationException();
	}

	public Läufer[] listeLäufer() {
		// TODO - implement Veranstaltung.listeLäufer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param läufer
	 */
	public void vereinÄndern(Läufer läufer) {
		// TODO - implement Veranstaltung.vereinÄndern
		throw new UnsupportedOperationException();
	}

	public Läufer[] erstelleStartliste() {
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
	 * @param läuferListe
	 */
	public void zuweisungNummern(Läufer[] läuferListe) {
		// TODO - implement Veranstaltung.zuweisungNummern
		throw new UnsupportedOperationException();
	}

	public Läufer[] listeAufgeber() {
		// TODO - implement Veranstaltung.listeAufgeber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param läufer
	 */
	public void disqualifizieren(Läufer läufer) {
		// TODO - implement Veranstaltung.disqualifizieren
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param läufer
	 * @param zeit
	 */
	public void laufzeitÄndern(Läufer läufer, double zeit) {
		// TODO - implement Veranstaltung.laufzeitÄndern
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param läufer
	 * @param zeit
	 * @param platzierung
	 */
	public void sms(Läufer läufer, double zeit, int platzierung) {
		// TODO - implement Veranstaltung.sms
		throw new UnsupportedOperationException();
	}

}