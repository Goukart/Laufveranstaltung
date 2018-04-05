public interface RunningServices {

	/**
	 * 
	 * @param v
	 */
	void erzeugeVeranstaltung(VeranstaltungDTO v);

	/**
	 * 
	 * @param v
	 */
	void erzeugeVerein(VereinDTO v);

	/**
	 * 
	 * @param a
	 */
	void erzeugeAnmeldung(AnmeldungDTO a);

	/**
	 * 
	 * @param a
	 */
	void erzeugeLaeufer(LaeuferDTO a);

	/**
	 * 
	 * @param l
	 */
	void erzeugeLaufzeit(LaufzeitDTO l);

	List<VeranstaltungDTO> getVeranstaltungen();

	List<VereinDTO> getVereine();

	List<LaeuferDTO> getLaeufer();

	/**
	 * 
	 * @param Veranstaltung
	 */
	List<AnmeldungDTO> getAnmeldungen(String Veranstaltung);

	/**
	 * 
	 * @param Veranstaltung
	 */
	List<LaufzeitDTO> getLaufzeiten(String Veranstaltung);

	/**
	 * 
	 * @param a
	 * @param Veranstaltung
	 */
	List<ListeneintragDTO> getAuswertung(Auswertung a, String Veranstaltung);

	void init();

}