package typsparametryzowanyogranicznietypow;

public class NumericFns <T extends Number> {
    T num;
NumericFns(T n){
    num = n;
}

double reciprocal(){
    return 1/num.doubleValue();
}

}
