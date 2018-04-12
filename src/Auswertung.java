import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Map;

public class Auswertung {

	private int[] Starterliste;
	private Map Alterklassen;
	private int[] Aussteiger;
	private static Auswertung auswertung;
	static Logger log = LogManager.getRootLogger();

	private Auswertung() {
		// TODO - implement Auswertung.Auswertung
		throw new UnsupportedOperationException();
	}

	public static Auswertung getInstanz() {
		// TODO - implement Auswertung.getInstanz
		log.info("Bank wird benutzt");
		throw new UnsupportedOperationException();
	}

}