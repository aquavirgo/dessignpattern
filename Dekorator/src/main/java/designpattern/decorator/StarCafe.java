package designpattern.decorator;

import designpattern.decorator.dodatki.BitaSmietana;
import designpattern.decorator.dodatki.Czekolada;
import designpattern.decorator.napoj.Espresso;
import designpattern.decorator.napoj.MocnoPalona;
import designpattern.decorator.napoj.StarCafeSpecial;

import javax.print.attribute.standard.MediaSize;

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

    }

}
