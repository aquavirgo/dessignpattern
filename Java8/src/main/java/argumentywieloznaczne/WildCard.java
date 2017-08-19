package argumentywieloznaczne;

public class WildCard {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<>(6);
        NumericFns<Double> dOb = new NumericFns<>(6.0);//nie trzeba definowac <Double> compilator bierze z cyfry
        if(iOb.absEqual(dOb)) System.out.println("Wartosci sa takie same");
    }

    //Istnieje mozliwosc ograniczenie argumentow wieloznacznych;
    //Gen<? extends A> o  <- Gen ograniczony obiektem A
 }
