import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Anmeldung {

	private Laeufer teilnehmer;
	private Veranstaltung veranstaltung;
	private boolean bezahlt;
	private Verein verein;
	static final Logger log = LogManager.getRootLogger();

	void getName_Loschen(){
		log.info("Programm wurde gestartet.");
	}
}