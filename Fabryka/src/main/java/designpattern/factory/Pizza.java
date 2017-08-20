package designpattern.factory;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String ciasto;
    public String sos;
   public ArrayList dodatki = new ArrayList();


    public String getName() {
        return name;
    }

    public void przygotowanie() {
        System.out.println("Przygotowanie pizzy " + name);
        System.out.println("Wyrabianie ciasta ...");
        System.out.println("Dodawanie sosu ...");
        System.out.println("Dodatki: ");
        for (int i = 0; i < dodatki.size(); i++) {
            System.out.println("  " + dodatki.get(i));
        }
    }




    public void pieczenie(){System.out.println("Pieczenie: 25 minut w temperaturze 350 stopni Celsjusza");}
    public void krojenie(){System.out.println("Krojenie pizzy na 8 kawałkow");}
    public void pakowanie(){System.out.println("Pakowanie pizzy w oficialne pudelko naszej pizzeri");
    }





    }



