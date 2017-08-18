package designpattern.factory;

public class ProstaFabrykaPizzy {
    public Pizza utworzPizza(String type){

        Pizza pizza = null;
        if(type.equals("serowa")){
            pizza=new SerowaPizza();
        }else if(type.equals("peperoni")){
            pizza = new Pepperoni();
            //System.out.println(type);
        }
        return pizza;

    }
}
