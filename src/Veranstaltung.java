import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Date;
import java.util.Map;

public class Veranstaltung implements Bank {

	private String name;
	private double strecke;
	private Date termin;
	private int startgebuehr;
	private Map teilnehmer;
	static final Logger log = LogManager.getRootLogger();
	
	
	
	public static void main(String[] argv) {
		System.out.println("Passt erstmal");
		
		Anmeldung anm = new Anmeldung();	}
	
	
	public void Veranstaltung(){
		log.info("Programm wurde gestartet.");
	}

	public void getNummer() {
		// TODO - implement Veranstaltung.getNummer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param laeufer
	 */
	public void anmelden(Laeufer laeufer) {
		// TODO - implement Veranstaltung.anmelden
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param laeufer
	 */
	public void abmelden(Laeufer laeufer) {
		// TODO - implement Veranstaltung.abmelden
		throw new UnsupportedOperationException();
	}

	public Laeufer[] listeLaeufer() {
		// TODO - implement Veranstaltung.listeL�ufer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param laeufer
	 */
	public void vereinAendern(Laeufer laeufer) {
		// TODO - implement Veranstaltung.verein�ndern
		throw new UnsupportedOperationException();
	}

	public Laeufer[] erstelleStartliste() {
		// TODO - implement Veranstaltung.erstelleStartliste
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bis
	 */
	public void anmeldungen(Date bis) {
		// TODO - implement Veranstaltung.anmeldungen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param laeuferListe
	 */
	public void zuweisungNummern(Laeufer[] laeuferListe) {
		// TODO - implement Veranstaltung.zuweisungNummern
		throw new UnsupportedOperationException();
	}

	public Laeufer[] listeAufgeber() {
		// TODO - implement Veranstaltung.listeAufgeber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param laeufer
	 */
	public void disqualifizieren(Laeufer laeufer) {
		// TODO - implement Veranstaltung.disqualifizieren
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param laeufer
	 * @param zeit
	 */
	public void laufzeitAendern(Laeufer laeufer, double zeit) {
		// TODO - implement Veranstaltung.laufzeit�ndern
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param laeufer
	 * @param zeit
	 * @param platzierung
	 */
	public void sms(Laeufer laeufer, double zeit, int platzierung) {
		// TODO - implement Veranstaltung.sms
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