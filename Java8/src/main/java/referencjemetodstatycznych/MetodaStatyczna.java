package referencjemetodstatycznych;

public class MetodaStatyczna {
    public static void main(String[] args) {

        if(numTest(MyPredictate::isPositive,-1)){
      System.out.println("TAK");}else{System.out.println("NIE");}
    }

    static class MyPredictate{
        static boolean isPositive(int n){
            return n>0;
        }
    }

    static boolean numTest(IntPredicate p,int v){
        return p.test(v);


    }
}

