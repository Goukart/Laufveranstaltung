import swa.runningeasy.dtos.*;
import swa.runningeasy.services.Auswertung;

import java.util.List;

public class RunningServices implements swa.runningeasy.services.RunningServices {

    @Override
    public void erzeugeVeranstaltung(VeranstaltungDTO v) throws IllegalArgumentException {

    }

    @Override
    public void erzeugeVerein(VereinDTO v) throws IllegalArgumentException {

    }

    @Override
    public void erzeugeAnmeldung(AnmeldungDTO a) throws IllegalArgumentException {

    }

    @Override
    public void erzeugeLaeufer(LaeuferDTO a) throws IllegalArgumentException {

    }

    @Override
    public void erzeugeLaufzeit(LaufzeitDTO l) throws IllegalArgumentException {

    }

    @Override
    public List<VeranstaltungDTO> getVeranstaltungen() {
        return null;
    }

    @Override
    public List<VereinDTO> getVereine() {
        return null;
    }

    @Override
    public List<LaeuferDTO> getLaeufer() {
        return null;
    }

    @Override
    public List<AnmeldungDTO> getAnmeldungen(String Veranstaltung) {
        return null;
    }

    @Override
    public List<LaufzeitDTO> getLaufzeiten(String Veranstaltung) {
        return null;
    }

    @Override
    public List<ListeneintragDTO> getAuswertung(Auswertung a, String Veranstaltung) {
        return null;
    }

    @Override
    public void init() {

    }
}
