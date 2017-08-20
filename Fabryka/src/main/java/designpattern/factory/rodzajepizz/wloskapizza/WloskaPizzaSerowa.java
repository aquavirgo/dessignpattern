package designpattern.factory.rodzajepizz.wloskapizza;

import designpattern.factory.Pizza;
import designpattern.factory.Pizzeria;

public class WloskaPizzaSerowa extends Pizza {
    public WloskaPizzaSerowa(){
        name = "Wloska pizza serowa z sosem Marinara";
        ciasto = "Cienkie kruche ciasto";
        sos = "Marinara";
        dodatki.add("Tarty ser Reggiano");

    }
}
