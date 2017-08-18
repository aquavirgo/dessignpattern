package designpattern.obserwator;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBierzaceWyswietl implements Observer, WyswietlElement {
    Observable observable;
    private float temperatura;
    private float wilgotnosc;
    private Podmiot DanePogodowe;

    public WarunkiBierzaceWyswietl(Observable observable){
this.observable=observable;
observable.addObserver(this);

    }
/*
    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura =temperatura;
        this.wilgotnosc=wilgotnosc;
        wyswietl();
    }
*/
    @Override
    public void wyswietl() {
        System.out.println("Warunki bierzace "+temperatura+ " stopni C oraz "+wilgotnosc+" % wilgotnosc");
    }

    @Override
    public void update(Observable o, Object arg) {
  if(o instanceof DanePogodowe){
     DanePogodowe danePogodowe = (DanePogodowe)o;
     this.temperatura=danePogodowe.pobierzTemperatur();
     this.wilgotnosc=danePogodowe.pobierzWilgotnos();
     wyswietl();
  }
    }
}
