package ohtu.verkkokauppa;

import java.util.ArrayList;

public class Pankki implements KirjanpitoInterface {
    private ArrayList<String> tapahtumat;
  //  private static Pankki instanssi;

  /*  public static Pankki getInstance() {
        if (instanssi == null) {
            instanssi = new Pankki();
        }

        return instanssi;
    } */
    public Kirjanpito kirjanpito;

    public Pankki(Kirjanpito kirjanpito) {
     //   
        
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }

    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }
}
