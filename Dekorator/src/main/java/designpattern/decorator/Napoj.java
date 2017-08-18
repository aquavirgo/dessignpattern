
package designpattern.decorator;

public abstract class Napoj {
    public static final int MALY = 1;
    public static final int SREDNI = 2;
    public static final int DUZY = 3;

    public int wielkosc;


    public String opis = "Napój nieznany";


    public String pobierzOpis(){
        return opis;
    }

    public int pobierzWielkosc(){
        return wielkosc;
    }

    public void ustawWielkosc(int wielkosc){
        this.wielkosc=wielkosc;
    }
    public abstract double koszt();

}
