package swa.runningeasy.services;

import swa.runningeasy.dtos.LaufzeitDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.ListeneintragDTO;


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
