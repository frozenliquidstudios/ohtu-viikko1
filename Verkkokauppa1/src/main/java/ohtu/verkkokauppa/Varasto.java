package ohtu.verkkokauppa;

import java.util.*;

public class Varasto implements KirjanpitoInterface {
    
        private ArrayList<String> tapahtumat;
//    private static Varasto instanssi;

/*    public static Varasto getInstance() {
        if (instanssi == null) {
            instanssi = new Varasto();
        }

        return instanssi;
    } */

  //  public Kirjanpito kirjanpito;
    public HashMap<Tuote, Integer> saldot;

    public Varasto(Kirjanpito kirjanpito) {
  //    kirjanpito = Kirjanpito.getInstance();
        saldot = new HashMap<Tuote, Integer>();
        alustaTuotteet();
    }

    public Tuote haeTuote(int id){
        for (Tuote t : saldot.keySet()) {
            if ( t.getId()==id) return t;
        }

        return null;
    }

    public int saldo(int id){
        return saldot.get(haeTuote(id));
    }

    public void otaVarastosta(Tuote t){
        saldot.put(t,  saldo(t.getId())-1 );
        lisaaTapahtuma("otettiin varastosta "+t);
    }

    public void palautaVarastoon(Tuote t){
        saldot.put(t,  saldo(t.getId())+1 );
        lisaaTapahtuma("palautettiin varastoon "+t);
    }

    private void alustaTuotteet() {
        saldot.put(new Tuote(1, "Koff Portteri", 3), 100);
        saldot.put(new Tuote(2, "Fink Bräu I", 1), 25);
        saldot.put(new Tuote(3, "Sierra Nevada Pale Ale", 5), 30);
        saldot.put(new Tuote(4, "Mikkeller not just another Wit", 7), 40);
        saldot.put(new Tuote(5, "Weihenstephaner Hefeweisse", 4), 15);
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
