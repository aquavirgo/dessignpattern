package designpattern.decorator.napoj;

import designpattern.decorator.Napoj;

public class Bezkofeinowa extends Napoj {

    Bezkofeinowa(){
        opis = "Kawa bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 1.05;
    }
}
