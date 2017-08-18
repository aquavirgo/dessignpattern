package designpattern.decorator.napoj;

import designpattern.decorator.Napoj;

public class MocnoPalona extends Napoj {

public MocnoPalona(){
    opis = "Kawa Mocno palona";
}
    @Override
    public double koszt() {
        return 0.99;
    }
}
