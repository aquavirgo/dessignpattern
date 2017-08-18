package designpattern.decorator;

public abstract class Napoj {
    public String opis = "Napój nieznany";


    public String pobierzOpis(){
        return opis;
    }

    public abstract double koszt();

}
