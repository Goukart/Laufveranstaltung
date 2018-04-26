package swa.runningeasy.services;

/**
 * @author Bernhard Hollunder
 * 
 * Defines the coarse-grained interface to the running system to be implemented
 * in the exercises to "Software Architektur" held in AIB 6.
 * 
 * This interface will be realized individually by the students based on the
 * implemented object model.
 *
 */


import swa.runningeasy.dtos.*;

import java.util.List;


public interface RunningServices {
	
	void erzeugeVeranstaltung(VeranstaltungDTO v) throws IllegalArgumentException;
	void erzeugeVerein(VereinDTO v) throws IllegalArgumentException;
	void erzeugeAnmeldung(AnmeldungDTO a) throws IllegalArgumentException;
	void erzeugeLaeufer(LaeuferDTO a) throws IllegalArgumentException;
	void erzeugeLaufzeit(LaufzeitDTO l) throws IllegalArgumentException;

	List<VeranstaltungDTO> getVeranstaltungen();
	List<VereinDTO> getVereine();
	List<LaeuferDTO> getLaeufer();
	List<AnmeldungDTO> getAnmeldungen(String Veranstaltung);
	List<LaufzeitDTO> getLaufzeiten(String Veranstaltung);
	List<ListeneintragDTO> getAuswertung(Auswertung a, String Veranstaltung);

	void init();
}
