package predefiniowaneinterface;

import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven =(n)->(n%2)==0;
        if(isEven.test(15)){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}


/*
Predefiniowane interface
_____________________________

UnaryOperator<T> - jednoargumentowe operacje na obiekcie T zwraca obiekt T (apply)
BinaryOperator<T> - operacje na dwóch obiektach typu T, zwraca obiekt T (apply)
Consumer<T> - operacje na obiekcie T (accept)
Supplier<T> - zwraca obiekt typu T (get)
Function<T,R> - operacie na obiekcie typu T zwraca wynik R (apply)
Predcate<T> - czy T spełnia warunek , zwraca boolean (test)
 */
