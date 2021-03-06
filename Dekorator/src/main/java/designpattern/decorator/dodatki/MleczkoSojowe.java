<<<<<<< HEAD
package designpattern.decorator.dodatki;

import designpattern.decorator.Napoj;
import designpattern.decorator.SkladnikDekorator;

public class MleczkoSojowe extends SkladnikDekorator {
    Napoj napoj;

    public MleczkoSojowe(Napoj napoj){
        this.napoj=napoj;
    }
    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Mleczko Sojowe";
    }

    public int pobierzWielkosc(){
        return napoj.pobierzWielkosc();
    }

    public void ustawWielkosc(int wielkosc){
        napoj.wielkosc=wielkosc;
    }

    @Override
    public double koszt() {
        Double koszt =napoj.koszt();
        if(pobierzWielkosc()== Napoj.MALY){
            koszt+=0.10;
        }else if(pobierzWielkosc()==Napoj.SREDNI){
            koszt+=0.15;
        }else if(pobierzWielkosc()==Napoj.DUZY){
            koszt+=0.20;
        }

        return koszt;
    }
}
=======
package designpattern.decorator.dodatki;

import designpattern.decorator.Napoj;
import designpattern.decorator.SkladnikDekorator;

public class MleczkoSojowe extends SkladnikDekorator {
    Napoj napoj;

    public MleczkoSojowe(Napoj napoj){
        this.napoj=napoj;
    }
    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Mleczko Sojowe";
    }

    @Override
    public double koszt() {
        return napoj.koszt() +0.15;
    }
}
>>>>>>> 9adad6d77a66df4d743892d8b74bc6046bed3831
