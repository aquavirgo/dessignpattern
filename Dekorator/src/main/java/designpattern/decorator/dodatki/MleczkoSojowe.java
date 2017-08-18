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
