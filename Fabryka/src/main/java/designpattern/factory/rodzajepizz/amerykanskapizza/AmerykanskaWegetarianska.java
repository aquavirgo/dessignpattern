package designpattern.factory.rodzajepizz.amerykanskapizza;

import designpattern.factory.Pizza;

public class AmerykanskaWegetarianska extends Pizza {
    public AmerykanskaWegetarianska(){
        name = "Wegetarianska USA pizza serowa z sosem USA";
        ciasto = "Grube ciasto";
        sos = "Majonez";
        dodatki.add("Tarty ser Mozzarela");
    }
}
