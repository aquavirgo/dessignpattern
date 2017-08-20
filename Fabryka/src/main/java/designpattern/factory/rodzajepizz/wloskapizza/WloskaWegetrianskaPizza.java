package designpattern.factory.rodzajepizz.wloskapizza;

import designpattern.factory.Pizza;

public class WloskaWegetrianskaPizza extends Pizza {
    public WloskaWegetrianskaPizza(){
        name = "Wloska pizza serowa z sosem Tabsco";
        ciasto = "Cienkie kruche ciasto";
        sos = "Kotlin";
        dodatki.add("Tarty ser Morski");

    }
}
