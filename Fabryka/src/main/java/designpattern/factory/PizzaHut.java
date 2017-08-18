package designpattern.factory;

public class PizzaHut {
    public static void main(String[] args) {
      ProstaFabrykaPizzy prostaFabrykaPizzy = new ProstaFabrykaPizzy();
Pizzeria pizzeria = new Pizzeria(prostaFabrykaPizzy);

Pizza pizza = pizzeria.zamowPizza("peperoni");
        System.out.println("We ordered a " + pizza.getName() + "\n");

System.out.println(pizza.getName());
    }
}
