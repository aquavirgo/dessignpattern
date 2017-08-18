package designpattern.decorator.dodatki;

import designpattern.decorator.Napoj;
import designpattern.decorator.SkladnikDekorator;

public class Czekolada extends SkladnikDekorator {

    Napoj napoj;

    public Czekolada(Napoj napoj){
        this.napoj=napoj;
    }
    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() +", Czekolada";
    }

    @Override
    public double koszt() {
        return napoj.koszt() +0.20;
    }
}
