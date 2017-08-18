package designpattern.decorator;

import designpattern.decorator.dodatki.BitaSmietana;
import designpattern.decorator.dodatki.Czekolada;
import designpattern.decorator.dodatki.MleczkoSojowe;
import designpattern.decorator.napoj.Espresso;
import designpattern.decorator.napoj.MocnoPalona;
import designpattern.decorator.napoj.StarCafeSpecial;

import javax.print.attribute.standard.MediaSize;

import static designpattern.decorator.Napoj.DUZY;
import static designpattern.decorator.Napoj.MALY;

public class StarCafe {
    public static void main(String[] args) {
        Napoj napoj = new Espresso();
        System.out.println(napoj.pobierzOpis()+ "  " + napoj.koszt()+ " zl");

        Napoj napoj2 = new MocnoPalona();
        napoj2 = new Czekolada(napoj2);
        napoj2 = new Czekolada(napoj2);
        napoj2=new BitaSmietana(napoj2);
        System.out.println(napoj2.pobierzOpis()+ "  " + napoj2.koszt()+ " zl");

        Napoj napoj3 = new StarCafeSpecial();
        napoj3 = new Czekolada(napoj3);
        napoj3=new BitaSmietana(napoj3);
        System.out.println(napoj3.pobierzOpis()+ "  " + napoj3.koszt()+ " zl");


        Napoj napoj4 = new StarCafeSpecial();
napoj4.ustawWielkosc(DUZY);
        napoj4 = new Czekolada(napoj4);
        napoj4=new BitaSmietana(napoj4);
        napoj4=new MleczkoSojowe(napoj4);

        System.out.println(napoj4.pobierzOpis()+ "  " + napoj4.koszt()+ " zl");

    }

}
