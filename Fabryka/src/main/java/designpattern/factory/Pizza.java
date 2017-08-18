package designpattern.factory;

public abstract class Pizza {
String name;
    String dough;
    String sauce;

    public String getName() {
        return name;
    }

    public void przygotowanie(){System.out.println("Przygotowanie pizzy "+name);}
    public void pieczenie(){System.out.println("Pieczenie pizzy "+name);}
    public void krojenie(){System.out.println("Krojenie pizzy "+name);}
    public void pakowanie(){System.out.println("Pakowanie pizzy "+name);}


}
