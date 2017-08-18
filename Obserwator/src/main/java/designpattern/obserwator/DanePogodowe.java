package designpattern.obserwator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {

    private ArrayList obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;


    DanePogodowe(){
        obserwatorzy = new ArrayList();
    }

    @Override
    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }

    @Override
    public void usunObserwatora(Obserwator o) {
        int i = obserwatorzy.indexOf(o);
        if( i >=0){
            obserwatorzy.remove(o);
        }
    }

    @Override
    public void powiadomObserwatorow() {
        for(int i=0;i<obserwatorzy.size();i++){
            Obserwator obs = (Obserwator) obserwatorzy.get(i);
            obs.aktualizacja(temperatura,wilgotnosc,cisnienie);
        }
    }

    public void odczytZmiana(){
        powiadomObserwatorow();
    }

    public void ustawOdczyt(float temperatura, float wilgotnosc, float cisnienie){
        this.temperatura=temperatura;
        this.wilgotnosc=wilgotnosc;
        this.cisnienie=cisnienie;
        odczytZmiana();
    }
}
