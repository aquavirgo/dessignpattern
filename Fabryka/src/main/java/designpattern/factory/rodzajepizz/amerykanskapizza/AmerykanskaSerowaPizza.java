package designpattern.factory.rodzajepizz.amerykanskapizza;

import designpattern.factory.Pizza;

public class AmerykanskaSerowaPizza extends Pizza {

         public AmerykanskaSerowaPizza(){
            name = "Americano pizza serowa z sosem USA";
            ciasto = "Grube ciasto";
            sos = "BBQ";
            dodatki.add("Tarty ser Utha");

        }

    public void krojenie(){
        System.out.println("Krojenie pizzy na grube kwadratowe kawałki");
    }

    }
