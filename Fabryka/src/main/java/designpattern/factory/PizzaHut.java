package designpattern.factory;

import designpattern.factory.rodzajepizz.wloskapizza.WloskaPizzaSerowa;
import designpattern.factory.rodzajepizzeri.AmerykanskaPizzeria;
import designpattern.factory.rodzajepizzeri.WloskaPizzeria;

public class PizzaHut {
    public static void main(String[] args) {


        Pizzeria wloska = new WloskaPizzeria();
        Pizzeria usa = new AmerykanskaPizzeria();

        Pizza pizza = wloska.zamowPizza("serowa");
        System.out.println("Eryk zamowił: "+ pizza.getName());

        pizza = usa.zamowPizza("serowa");
        System.out.println("Jacek zamowił: "+ pizza.getName());





       /*
        ProstaFabrykaPizzy prostaFabrykaPizzy = new ProstaFabrykaPizzy();
Pizzeria pizzeria = new Pizzeria(prostaFabrykaPizzy);
Pizza pizza = pizzeria.zamowPizza("peperoni");
        System.out.println("We ordered a " + pizza.getName() + "\n");

System.out.println(pizza.getName());
   */



    }
}
