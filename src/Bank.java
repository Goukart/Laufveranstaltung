public interface Bank {

	/**
	 * 
	 * @param quellKonto
	 * @param zielKonto
	 * @param betrag
	 */
	void buchen(int quellKonto, int zielKonto, int betrag);

	/**
	 * 
	 * @param Konto
	 */
	int[] zahlungsEingänge(int Konto);

}