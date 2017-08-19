package typsparametryzowanyogranicznietypow;

public class BoundDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);
        System.out.println(iOb.reciprocal());
    }

}
