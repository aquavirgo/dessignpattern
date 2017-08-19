package argumentywieloznaczne;

public class NumericFns<T extends Number> {
T num;

NumericFns(T n){
    num =n;
}

double fraction(){
    return 1/num.doubleValue();
}

boolean absEqual(NumericFns<?> ob){
    if(Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue())) return true;
    return false;
}
}
