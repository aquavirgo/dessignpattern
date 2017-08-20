package designpattern.factory.rodzajepizzeri;

import designpattern.factory.Pizza;
import designpattern.factory.Pizzeria;
import designpattern.factory.rodzajepizz.wloskapizza.WloskaPizzaSerowa;
import designpattern.factory.rodzajepizz.wloskapizza.WloskaWegetrianskaPizza;

public class WloskaPizzeria extends Pizzeria {
    @Override
    public Pizza utworzPizza(String type) {
        if (type.equals("serowa")){
            return new WloskaPizzaSerowa();
        }else if(type.equals("wegetarianska")){
            return new WloskaWegetrianskaPizza();
        }else{
            return null;
        }
    }
}
