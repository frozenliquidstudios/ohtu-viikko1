
package ohtu.verkkokauppa;

import java.util.ArrayList;

public class Kirjanpito implements KirjanpitoInterface {

    private ArrayList<String> tapahtumat;

    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
